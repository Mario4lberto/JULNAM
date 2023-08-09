/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class SeriePi {
    
    public static void main(String[] args) {
         //float catro = 4;
        float acum = 0;
        int cont = 1;
        float pi;
       
        
        for (int i = 1; i < 1000000000; i++) {
            cont = cont + 2;
            if (i % 2 == 0) {
                acum -= ((float) 4/cont);
            }else{
                acum +=  ((float) 4/cont);
            }
        }
        
        pi = 4 - acum;
        System.out.println(pi);
    }
    
}
