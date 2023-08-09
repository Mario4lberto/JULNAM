
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
public class MayorMenor {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int a,b,c,d,e;
        
        System.out.println("Ingresa el primer número");
        a = obj.nextInt();
        
        System.out.println("Ingresa el segundo número");
        b = obj.nextInt();
        
        System.out.println("Ingresa el tercer número");
        c = obj.nextInt();
        
        
        System.out.println("Ingresa el cuarto número");
        d = obj.nextInt();
        
        System.out.println("Ingresa el quinto número");
        e = obj.nextInt();
       
        if (a == b && a == c && a == d && a == e && b == c && b ==d && b == e && c == d && c == e && d == e) {
            System.out.println("Los números son iguales");
        }else{
            /*
            if (a >= b && a>=c) {
                System.out.println(a+" es el mayor");
            }else if(b>=a && b>=c){
                System.out.println(b+" es el mayor");
            }else{
                System.out.println(c+" es el mayor");
            }*/
            
            if (a >= b && a>=c && a>=d && a>=e) {
                System.out.println(a+" es el mayor");
            }else if(b>=a && b>=c && b>=d && b>=e){
                System.out.println(b+" es el mayor");
            }else if(c>=a && c>=b && c>=d && c>=e){
                System.out.println(c+" es el mayor");
            }else if(d>=a && d>=b && d>=c && d>=e){
                System.out.println(d+" es el mayor");
            }else{
                System.out.println(e+" es el mayor");
            }
            
            
            
            //System.out.println("Los números son diferentes");
        }
        
    }
    
}
