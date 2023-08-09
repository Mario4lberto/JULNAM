/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class Matriz {
    
    public static void main(String[] args) {
        int[][] datos = {{5,12,16,21},
                         {-14,8,6,37},
                         {43,52,-4,6},
                         {3,5,7,9}};
        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                System.out.print(datos[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Sumatoria por Fila:");
        sumaxFila(datos);
        System.out.println();
        System.out.println("Sumatoria por Columna:");
        sumaxColumna(datos);
        System.out.println();
        System.out.println("Sumatoria diagonal Principal:");
        sumaDiagonal(datos);
    }
    
    
    
     public static void sumaxFila(int a[][]){
        
         int suma = 0;
         int j;
         int fil = 0;
         
         for (int i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                suma = suma + a[i][j];
                fil = i+1;
            }
            System.out.println("Fila "+fil+"="+suma);
            suma = 0;
           
        }
        
    }
    
    
    public static void sumaxColumna(int a[][]){
        
         int suma = 0;
         int j;
         int col = 0;
         
         for (int i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                suma = suma + a[j][i];
                col = i+1;
            }
            System.out.println("Columna "+col+"="+suma);
            suma = 0;
           
        }
        
    }
    
    public static void sumaDiagonal(int a[][]){
        
        int suma = 0;
        
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    suma = suma + a[i][j];
                }
         
            }
          
        }
        
        System.out.println("Sumatoria diagonal:"+suma);
    }
    
    
    
}
