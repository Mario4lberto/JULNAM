/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class Interes {
    
    public static void main(String[] args) {
        
      double amount; 
      double principal = 1000.0; 
      double rate = 0.05; 

     
      System.out.printf( "%s%20s\n", "Año", "Monto en deposito" );

     
      for ( int year = 1; year <= 10; year++ ) {
         
         amount = principal * Math.pow( 1.0 + rate, year );
         System.out.printf( "%4d%,20.2f\n", year, amount );
      } 
        
        
    }

}
