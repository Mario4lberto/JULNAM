/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

     /*
        //Con ciclo for
        int counter = 1;
        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print (counter);
                System.out.print (" ");
                counter++;
            }
            System.out.println ();
        }
        
        System.out.println();
        
        
        */



/**
 *
 * @author silpa_000
 */
public class Contador20 {
    
    public static void main(String[] args) {
        
        //Con ciclo while
         
        int i=0;
        
        int cont = 1;
        
        while(i < 4){
            i++;
            int j=0;
            while (j < 5) {
                
                System.out.print(cont+" ");
                cont++;
                j++;
            }     
            System.out.println ();
            
        }
       
    }
    
}
