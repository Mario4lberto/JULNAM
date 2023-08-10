using OrderedCollections
using SHA
using Gtk

# convert glade file using GtkBuilder()glade = GtkBuilder(filename = "HelloGlade.glade")

# assign variables

input = nothing
oc = nothing
#β = nothing
#firma_ma = nothing#firma_loli = nothing
α = 60573 


dict_x = Dict()
dict_y = Dict()
lis = []
puntos = ()



for i in 0:630
   
    #print(i)
    dict_y[i] = (i^2) % 631 #𝑦²
    dict_x[i] = ((i^3) + (2*i) + 2) % 631 #𝑥³+2𝑥+2
   
end


ord_x = sort(dict_x)
ord_y = sort(dict_y)

lis = [(i,j) for i in  keys(ord_x), j in keys(ord_y) if  ord_x[i] == ord_y[j]]


function suma_puntos(p1,p2)
    
    
    #=
    Función para calcular la suma de 2 puntos
    𝜆=(𝑦2−𝑦1)/(𝑥2−𝑥1)
    𝑥3=𝜆²−𝑥1−𝑥2
    𝑦3=𝜆(𝑥1−𝑥3)−𝑦1
    =#

    suma = []
    
    x1 = p1[1]
    x2 = p2[1]
    y1 = p1[2]
    y2 = p2[2]
    
     m = (y2 - y1)/(x2 - x1)
    
    x3 = 0
    y3 = 0
    
    
    if (isa(m,Int64))
        
        x3 = mod((m^2 - x1 - x2) ,631)
        y3 =mod((m * (x1 - x3 ) - y1) , 631)
        
    else
    
        #=
        Como el grupo tiene domino en los enteros positivos se implenta esta condición para calcular el 
        inverso multiplicativo modular y evitar números fraccionarios 
        =#
        m =  mod((y2 - y1)*(invmod( x2 - x1 ,631) ) , 631)
        x3 = mod((m^2 - x1 - x2) , 631)
        y3 = mod((m * (x1 - x3 ) - y1) , 631)
    
    end
    
    suma = [(x3,y3)]
    
    return suma
end


function mult_2(punto)#OjO point es una tupla
   
    #print("$xG,$yG")
    
    #=
    Función para doblar 1 punto
    𝜆=(3𝑥²𝐺+𝑎)/2𝑦𝐺
    𝑥2𝐺=𝜆−2𝑥𝐺
    𝑦2𝐺=𝜆(𝑥𝐺−𝑥2𝐺)−𝑦𝐺
    
    =#
    
    xG = punto[1]
    yG = punto[2]
    

    gf = ()
    my_list = []
    
    

    
    
     m = (3 * xG ^ 2 + 2) / (2*yG)
    
    
    if(isa(m, Int64))
        
        x2G = mod((m^2 - 2*xG) ,631)
        y2G =mod((m * (xG - x2G ) - yG) , 631)
    else
        m = mod((3 * xG ^ 2 + 2)*(invmod(2 * yG,631) ),631)
        x2G =mod((m^2 - 2*xG) , 631)
        y2G =mod((m * (xG - x2G ) - yG) , 631)
    end
    
    #gf  = x2G ,y2G
    
    #append!(my_list,x2G ,y2G)
    
    my_list = [(x2G ,y2G)]
    
    return my_list
    
end

mult_2(lis[1])

lis_gf = [lis[1],mult_2(lis[1])[1]]


for i in 1:length(lis)-2
    append!(lis_gf, suma_puntos(lis_gf[1],lis_gf[length(lis_gf)]))
end

#show(lis_gf)

push!(lis_gf, (-1,-1)) 

#=
print("->")
for i in 1:length(lis_gf)
    print(lis_gf[i])
    print("->")
end
=#


function identificar(firma,clv)
    c = 0
    aux_c = 0


    for i in lis_gf
   
        c = c + 1
        if i == firma
            aux_c = c
            #print(aux_c)
        end
        
        
    end

    identificado = aux_c*clv

    return   identificado 
end

function  firmar(identificado)

    d = 1

    aux = 0

    for x in 1:identificado
        #print(d)
        #print("\n")
        aux = d
        d = d + 1
        if d%596 == 0
            d = 1
        end
   
    end

    return aux
    
end

function  buscar_engrupo(identificado)

    d = 1

    aux = 0

    for x in 1:identificado
        #print(d)
        #print("\n")
        aux = d
        d = d + 1
        if d%596 == 0
            d = 1
        end
   
    end

    return aux
    
end


glade = GtkBuilder(filename = "C:\\Users\\mfmin\\OneDrive\\Escritorio\\JULNAM\\src\\JULNAM.glade")

window = glade["window"]
label = glade["firma"]
button = glade["boton"]
clvp = glade["clvp"]
# launch GUI

showall(window)

# set button callback
lis_clv = []

id = signal_connect(button, "button-press-event") do widget, event

    ent = GtkEntry()
    str = get_gtk_property(clvp,:text,String)
    println(str)
    β = parse(Int,str)

    a = lis_gf[buscar_engrupo(α)]

    #print( buscar_engrupo(β2))
    #print("\n")
    b = lis_gf[buscar_engrupo(β)]

    global firma_ma = a
    global firma_loli = b

    

    append!(lis_clv, β)

    show(lis_clv) 
    #=
    OJO declarar una lista de claves, la primera es la del usuario actual o sea se toma el primer elemento de la
    lista de claves privadas 
    =#

    
    if(lis_gf[firmar(identificar(firma_ma, lis_clv[1]))] == lis_gf[firmar(identificar(firma_loli,α))])
        print("Tu acta ha sido firmada exitosamente\n")

        clvhx = string(β , base=16)
        print(bytes2hex(sha256(clvhx)))
        print("\n")
        warn_dialog("Tu acta ha sido firmada exitosamente")
        GAccessor.text(label,bytes2hex(sha256(clvhx)))
    else
        #ojo aqui meter otro if para rectificar
        print("Error al ingresar tu clave privada, fallo al autentificarte\n")
        warn_dialog("Error al ingresar tu clave privada, fallo al autentificarte")
        GAccessor.text(label,"Error al ingresar tu clave privada, fallo al autentificarte")
    end



end

#=
id = signal_connect(button, "button-press-event") do widget, event
    if get_gtk_property(label, :label, String) == "Hello, World!"
        GAccessor.text(label, "Hello, Julia!")
    else
        GAccessor.text(label, "Java es mejor que Julia y la queso!")
    end
end=#