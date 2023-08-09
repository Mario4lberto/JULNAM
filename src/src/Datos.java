/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author silpa_000
 */
public class Datos {
    public static void main(String[] args) throws IOException  {
        
        int op;
        boolean salir = false;
        ArrayList<String[]> datos = new ArrayList<String[]>();
        Scanner obj = new Scanner(System.in);
        
        do {
            
            System.out.println("Menú");
            System.out.println("1.- Captura de datos ");
            System.out.println("2.- Consulta de datos");
            System.out.println("3.- Salir");
            
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                System.out.println("Escribe una de las opciones:");
                op = obj.nextInt();
                String sexo,nombre,est,peso,edad,tel,sueldo;
                Scanner obj2 = new Scanner(System.in);
                
                switch(op){
                    case 1:
                        System.out.println("Sexo:");
                        sexo = br.readLine();
                        System.out.println("Nombre:");
                        nombre = br.readLine();
                        System.out.println("Estatura:");
                        est = br.readLine();
                        System.out.println("Peso:");
                        peso = br.readLine();
                        System.out.println("Edad:");
                        edad = br.readLine();
                        System.out.println("Teléfono:");
                        tel =  br.readLine();
                        System.out.println("Sueldo:");
                        sueldo = br.readLine();
                        datos.add( new String[]{nombre+" ",sexo+" ",est+" ",peso+" ",edad+" ",tel+" ",sueldo+" "});
                        //System.out.println(datos);
                        break;
                    case 2:
                //System.out.println(datos.get(0));
                    for (String[] dato : datos) {
                        for (int j = 0; j < dato.length; j++) {
                            System.out.printf(dato[j]);
                        }
                        System.out.println();
                    }
                    break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
                
                
            }catch (Exception e) {
                System.out.println("Debes insertar un número");
                obj.next();
            }
            
        } while (!salir);
        
        
    }
}
