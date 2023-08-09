/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author silpa_000
 */
public class Ecuacion {
    
    private int a,b,c;

    
    public static void main(String[] args) {
        System.out.println("Ecuación de la forma:");
        System.out.println("ax + b = c");
        
        Scanner obj = new Scanner(System.in);
        
        Ecuacion ec = new Ecuacion ();
        
        System.out.println("Dame el coeficiente a:");
        ec.a = obj.nextInt();
        System.out.println("Dame el coeficiente b:");
        ec.b = obj.nextInt();
        System.out.println("Dame el coeficiente c:");
        ec.c = obj.nextInt();
        
        System.out.println(ec.a+"x + "+ec.b+" = "+ec.c);
        
        System.out.println();
        
        System.out.println("La solución es:");
        
        ec.solveEq(ec.a, ec.b, ec.c);
        
        
        
        
    }
    
    public void solveEq(int a, int b, int c){
        
        try{
            System.out.println((c-b)/a);
        }catch(Exception e){
            System.out.println("La ecuación no tiene solución");
        }
        
        
    }
    
}
