
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
public class MCD {
    
    public static void main(String[] args) {
        
        int x,y;
        Scanner obj = new Scanner(System.in);
        System.out.println("Dame el primer número:");
        x=obj.nextInt();
        System.out.println("Dame el segundo número:");
        y=obj.nextInt();
        
        if (x == 0 && y==0) {
            System.out.println("No es posible la división entre 0");
        }
        
        
        if (x == 0 || y == 0) {
            
            if (x>0) {
                System.out.println("El mcd es:"+x);
            }
            
            if (y>0) {
                System.out.println("El mcd es:"+y);
            }
            
        }else{
            int r = x % y;
       
            if (r == 0) {
                System.out.println("El mcd es:"+y);
            }
        
            while(r != 0){
                x = y;
                y = r;
                r = x % y;
                if (r == 0) {
                    System.out.println("El mcd es:"+y);
                    break;
                }
            }    
        }   
    }
}
