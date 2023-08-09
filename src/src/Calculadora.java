import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class Calculadora {
    public static void main(String[] args) {
        int op;
        boolean salir = false;
        Scanner obj = new Scanner(System.in);
        
        do{
            System.out.println("Calculadora");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.println("5.- Raíz cuadrada de la suma de 2 números");
            System.out.println("6.- Elevar al cuadrado la suma de 2 números");
            System.out.println("7.- Salir");
            
            try{
                System.out.println("Escribe una de las opciones:");
                op = obj.nextInt();
                
                switch (op) {
                    case 1:
                        suma();
                        break;
                    case 2:
                        resta();
                        break;
                    case 3:
                        mult();
                        break;
                    case 4:
                        div();
                        break;
                    case 5:
                        raiz();
                        break;
                    case 6:
                        cuadr();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 7");
                }
                
                
                
            }catch (Exception e) {
                System.out.println("Debes insertar un número");
                obj.next();
            }
            
            
        }while(!salir);
        
    }
    
    public static void suma(){
        Scanner obj = new Scanner(System.in);
        double x,y,r;
        
        System.out.println("Digite número 1:");
        x = obj.nextDouble();
        System.out.println("Digite número 2:");
        y = obj.nextDouble();
        r = x + y;
        System.out.println("Resultado:"+r); 
    }
    
    public static void resta(){
        Scanner obj = new Scanner(System.in);
        double x,y,r;
        
        System.out.println("Digite número 1:");
        x = obj.nextDouble();
        System.out.println("Digite número 2:");
        y = obj.nextDouble();
        r = x - y;
        System.out.println("Resultado:"+r);
    }
    
    
    public static void mult(){
        Scanner obj = new Scanner(System.in);
        double x,y,r;
        
        System.out.println("Digite número 1:");
        x = obj.nextDouble();
        System.out.println("Digite número 2:");
        y = obj.nextDouble();
        r = x * y;
        System.out.println("Resultado:"+r);
    }
    
    
    public static void div(){
        Scanner obj = new Scanner(System.in);
        double x,y,r;
        
        System.out.println("Digite número 1:");
        x = obj.nextDouble();
        System.out.println("Digite número 2:");
        y = obj.nextDouble();
        if(y != 0){
            r = x/y; 
            System.out.println("Resultado:"+r);
        }else{
           System.out.println("No es posible la división entre 0");
           div();
        }   
    }
    
    
    public static void raiz(){
        
        Scanner obj = new Scanner(System.in);
        double x,y,r;
        
        System.out.println("Digite número 1:");
        x = obj.nextDouble();
        System.out.println("Digite número 2:");
        y = obj.nextDouble();
        
        if(x+y > 0){
           r = Math.sqrt(x+y);
           System.out.println("Resultado:"+r);
        }else{
            System.out.println("La suma debe ser mayoy a 0");
            raiz();
        }
        
    }
    
    
    public static void cuadr(){
        
        Scanner obj = new Scanner(System.in);
        double x,y,r;
        
        System.out.println("Digite número 1:");
        x = obj.nextDouble();
        System.out.println("Digite número 2:");
        y = obj.nextDouble();
        
        r = Math.pow(x+y, 2);
        
        System.out.println("Resultado:"+r);
    }
    
}
