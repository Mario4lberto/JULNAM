/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class Tabla {
    
    public static void main(String[] args) {
        
        Object [] tabla  = new Object [4];
        
        double ttabla [][] = new double [2][2];
        double vector[] = new double[ttabla.length * ttabla.length];
        
        int cont1 = 1;
        int cont2 = -1;
        double aux1,aux2;
        
        System.out.println("Este es el contador:"+ cont1);
        
        
        for (int i = 0; i < ttabla.length; i++) {
            for (int j = 0; j < ttabla[0].length; j++) {
                for (int k = j + 1; k <  ttabla[0].length; k++) {
                    for (int l = i + 1; l < ttabla.length; l++) {
                        
                    
                    //aux1 = perimetroCuad(cont1);
                    ttabla[i][j] = perimetroCuad(cont1);
                    //aux2 = areaCuad(cont1);
                    ttabla[i][k] = areaCuad(cont1);
                    ttabla[l][j] = perimetroCirc(cont1);
                    ttabla[l][k] = areaCirc(cont1);
                    
                
                 }     
                    
               }
                  
                  

               
            }
            
            
        }
        
        
        for (int i = 0; i < ttabla.length; i++) {
            for (int j = 0; j < ttabla[0].length; j++) {
               
                   System.out.print(ttabla[i][j]+"\t"); 
                    
               
            }
            System.out.println();
            
        }
        
        
        System.out.println();
        System.out.println(vector.length);
        
        int cont = 0;
        System.out.println("Perimetro cuad\t  Área cuad\t \tPerimetro cir\t \t\t\tÁrea Circ\t ");
            for (int i = 0; i < ttabla.length; i++) {
              for (int j = 0; j < ttabla[0].length; j++) {
                 vector[cont] = ttabla[i][j];
                  System.out.print("\t"+vector[cont]+"\t");
                  cont ++;
              }
            }
        
        
        
        /*
        for (int i = 0; i < tabla.length; i++) {
            
            if (i % 2 == 0) {
                cont1++;
                tabla[i] = cont1;
            }else{
                cont2--;
                tabla[i] = cont2;
            }
            
            
        }*/
        
        
        
    }
    
     public static double perimetroCuad(int l){
         return 4*l;
     }
     
     public static double areaCuad(int l){
         return l*l;
     }
     
     public static double perimetroCirc(int r){
         return 2*r*Math.PI;
     }
     
      public static double areaCirc(int r){
         return r*r*Math.PI;
     }
    
}
