
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
public class Primos {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int m,sp,i,j;
        boolean flag;
        sp = 0;
        i =3;
        String prim ="";
        
        System.out.println("Ingresa el numero");
        m = obj.nextInt();
        
       if (m >= 1) {
            sp = sp + 1;
            prim = "NUMERO PRIMO,1";
            //System.out.println(prim);
         
        }
        
           if (m >= 2) {
                 sp = sp + 1;
                 prim = prim+",2";
                 //System.out.println(prim);
            } /*else{*/
        

        
             while(i <= m){
                flag = true;
                j = 3;
           
              while(j < (i/2) && flag == true){
                    if (i%j == 0) {
                        flag = false;
                    }
                    j =j + 2;
              }
              
              if (flag == true) {
                 prim = prim+","+i;
                  //System.out.println(prim);
                 sp = sp + 1;
              }
                  i = i + 2;

             
           }
             System.out.println(prim);
             System.out.println("Entre 1 y "+m+" hay "+sp+" números primos");
          }
        
              
    }
    
