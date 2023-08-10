# JULNAM

### Objetivo

Implementar un mecanismo (en Python o Julia) de firma digital con criptografía
asimétrica con el protocolo ECDH (Elliptic-curve Diffie–Hellman) de intercambio con 
llaves privadas.

### Problema que resuelve

El mecanísmo de autenticación con firma digital

### Lenguajes utilizados
Se opto por usar Python y Julia para la fase de prueba de código de proyecto con la tecnología jupyter notebooks
###
<img width="137" alt="image" src="https://github.com/Mario4lberto/JULNAM/assets/136736346/655e3176-0ab3-4637-98af-2beeaca99906">
<img width="125" alt="image" src="https://github.com/Mario4lberto/JULNAM/assets/136736346/0a43479c-e760-4d07-be0a-4860df058997">
<img width="114" alt="image" src="https://github.com/Mario4lberto/JULNAM/assets/136736346/5bb60b83-224c-4567-8316-7dd87beefb89">

###
En la implementación de la aplicación opté por usar Julia debido a su rapidez de ejecución computacional, el mayor problema fue implemntar número muy grandes por lo que en esta versión prototipo las claves privadas no aceptan claves muy largas en caracteres y solo acepta números.

### Descripción de lo que está simulando, analizando o demostrando.
Lo que se simula es un mecanísmo de auntenticación de firma digital con clave privada 
<img width="593" alt="image" src="https://github.com/Mario4lberto/JULNAM/assets/136736346/3bf270a7-c932-42a7-9302-d752b2774c6c">
###
<img width="586" alt="image" src="https://github.com/Mario4lberto/JULNAM/assets/136736346/97e767dd-c1de-4e00-a763-d48429e3018c">

###
<img width="693" alt="image" src="https://github.com/Mario4lberto/JULNAM/assets/136736346/114eb6a6-4354-4053-bc05-3fa2a8098dd6">

###
<img width="408" alt="image" src="https://github.com/Mario4lberto/JULNAM/assets/136736346/6bf9290b-d78f-445b-8343-d3fee2244988">

El sistema simula la firma de actas por los profesores en el SIAE si la clave privada no coincide con la que emitio el emisor con su clave privada original el sistema no permitirá la autenticación y por ende la firma de acta

### Ejemplo básico de funcionamiento general, instrucciones de ejecución y uso
Para ejecutar el programa correrlo en VS code y ejecutar línea a línea el código para mostrar la aplicaión 

### Tema que ayuda a comprender
Unidad 2. Funciones racionales y funciones con radicales
Resuelve problemas de aplicación (función con radicales)

### Justificación de cómo ayuda al alumno a comprender el tema

La aplicación de las funciones polinomiales (en esta secuencia una función con radical como lo es una curva elíptica) son variados y se utilizan para resolver muchos problemas en otras ciencias, por mencionar los siguientes:
-En construcción, ingeniería civil y arquitectura
![image](https://github.com/Mario4lberto/JULNAM/assets/136736346/97d84803-7ba6-4e60-a2e6-8ebaf399448d)
###
-En Ingeniería forestal, por ejemplo, necesitamos la geometría para calcular áreas, pero también los polinomios en problemas como calcular cuántos árboles necesitamos replantar después de haber talado una zona de un bosque.
###
-El uso de polinomios en el área de la salud es amplio, desde el cálculo de las dosis más adecuadas de un medicamento, o el peso de un paciente enfermo en función del tiempo. Por poner solo un ejemplo, si queremos modelizar el ritmo circadiano en pacientes con hipertensión, buscamos la curva que mejor se adapte a nuestros datos, en este caso un polinomio de grado cuatro, lo que nos permite optimizar las dosis del medicamento contra la hipertensión.
###
-Finalmente, las curvas elípticas son usadas en criptografía, y no son más que expresiones polinómicas en dos variables, que también se pueden expresar como funciones con radicales, tal y como muestran estos dos ejemplos:

![image](https://github.com/Mario4lberto/JULNAM/assets/136736346/92f7afd8-66a3-4d25-9280-507f61ae148a)

### 1.- $y = \sqrt{x^3 - x}$

### 2.- $y = \sqrt{x^3 - x + 1}$

###

Que es el problema de aplicación que utilizaremos para ejemplificar al alumno
