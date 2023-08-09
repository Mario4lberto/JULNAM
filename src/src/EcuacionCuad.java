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
public class EcuacionCuad {
        
    
    private int a,b,c;
    
    
    public static void main(String[] args) {
        
        
       
        EcuacionCuad ec = new EcuacionCuad();
        Scanner obj = new Scanner(System.in);
        System.out.println("Ecuación de 2do de la forma:");
        System.out.println("ax²+bx+c=0");
        System.out.println();
        System.out.println("Dame el coeficiente a");
        ec.a = obj.nextInt();
        System.out.println("Dame el coeficiente b");
        ec.b = obj.nextInt();
        System.out.println("Dame el coeficiente c");
        ec.c = obj.nextInt();
        
        ec.solveEq(ec.a, ec.b, ec.c);
        
        
        
    }
    
    public void solveEq(int a, int b,int c){
        
        float r,i;
        double x1,x2;
        
        if (( Math.pow(b, 2)-(4*a*c) )< 0) {
            System.out.println("La ecuación no tiene solución en los reales pero si en los complejos:");
            r = (-b)/2*a;
            i =  (float) (Math.sqrt((-1)*(Math.pow(b, 2)-(4*a*c)))/2*a);
            System.out.println("La solucion es:");
            System.out.println("x1 = "+r+" + √"+i+"i");
            System.out.println("x2 = "+r+" - √"+i+"i");
        }else{
            x1 = (-b + (Math.sqrt( Math.pow(b, 2)-(4*a*c))))/2*a;
            x2 = (-b - (Math.sqrt( Math.pow(b, 2)-(4*a*c))))/2*a;
            System.out.println("La solucion es:");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
    
}
