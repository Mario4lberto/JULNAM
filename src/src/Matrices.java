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




public class Matrices {
    
    
    
       //definición de atributos
    private static int fila,columna;
    private String nombre;
    private  static int [][] matriza ;
    private  static int [][] matrizb ;
    private  static int [][] resultado;

   /* public Matrices(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }*/

    
    public int getFila() {
        return fila;
    }   public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    

    public static int[][] getMatriza() {
        return matriza;
    }

    public static void setMatriza(int[][] matriza) {
        Matrices.matriza = matriza;
    }

    public static int[][] getMatrizb() {
        return matrizb;
    }

    public static void setMatrizb(int[][] matrizb) {
        Matrices.matrizb = matrizb;
    }
    
    
    
    
    
    
    public void CapturaMatrices(){
        System.out.println("El valor de filas = " + fila);
        System.out.println("El valor de columnas = "+ columna);
        //System.out.println(matriza.length);
        Scanner entrada = new Scanner(System.in);
        for (int fil = 0; fil < fila ; fil++){
            for (int col = 0 ; col < columna  ; col++){
                System.out.println("Posición [" + fil + "," + col + "]");
                System.out.println("Teclea valor de matriz a");
                matriza [fil] [col]= entrada.nextInt();
                System.out.println("Teclea valor de matriz b");
                matrizb [fil] [col]= entrada.nextInt();
            }
          
        }
        
    }
    
    public void ImprimeMatrices(){
        System.out.println("Matriz A");
        for (int fil = 0; fil < matriza.length ; fil++){
            for (int col = 0 ; col < matriza[fil].length ; col++){
                System.out.print(matriza [fil] [col] + " ");
            }
            System.out.println("");
        }
        System.out.println("Matriz B");
        for (int fil = 0; fil < matrizb.length ; fil++){
            for (int col = 0 ; col < matrizb[fil].length ; col++){
                System.out.print(matrizb [fil] [col] + " ");
            }
            System.out.println("");
        }
    }
    
    public void SumaMatrices(int [][] A, int [][] B){
        for (int fil = 0; fil < matriza.length ; fil++){
            for (int col = 0 ; col < matriza[fil].length ; col++){
                resultado [fil] [col] = A[fil][col] + B[fil][col];
            }
        }
    }

    public void RestaMatrices(int [][] A, int [][] B){
        for (int fil = 0; fil < matriza.length ; fil++){
            for (int col = 0 ; col < matriza[fil].length ; col++){
                resultado [fil] [col] = A[fil][col] - B[fil][col];
            }
        }
    }
    
    public void ImprimeResultados(int [][]A) {
        for (int fil = 0; fil < A.length ; fil++){
            for (int col = 0 ; col < A[fil].length ; col++){
                System.out.print(A [fil] [col] + " ");
            }
            System.out.println("");
        }
    }
    
    public void TranspuestaSumaMatrices(int [][] A){
        System.out.println(" **** MATRIZ TRANSPUESTA *****"); 
        for (int fil = 0; fil < A.length ; fil++){
            for (int col = 0 ; col < A[fil].length ; col++){
                System.out.print(A [col] [fil] + " ");
            }
            System.out.println("");
        }
    }
    
    public void MenuMatrices(){
        System.out.println(" **********************************************");
        System.out.println("           MENU MATRICES                       ");
        System.out.println("   1.- Suma de matrices                        ");
        System.out.println("   2.- Resta de matrices                       ");
        System.out.println("   3.- Transpuesta de la suma de matrices      ");
        System.out.println("   0.- Salir                                   ");
        System.out.println(" **********************************************");
    }

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Teclea el numero de filas ");
        fila = teclado.nextInt();
        System.out.println("Teclea el numero de columnas ");
        columna = teclado.nextInt();
        Matrices ejemplo = new Matrices();
        
        matriza = new int [fila][columna];
        matrizb = new int [fila][columna];
        resultado = new int [fila][columna];
        
        ejemplo.CapturaMatrices();
        ejemplo.ImprimeMatrices();
        int opcion = 9;
        while (opcion != 0){
               ejemplo.MenuMatrices();
               System.out.println("Elige una opción : ");
               opcion = teclado.nextInt();
               switch (opcion){
                   case 1: ejemplo.SumaMatrices(matriza, matrizb);
                           ejemplo.ImprimeResultados(resultado);
                           break;
                   case 2: ejemplo.RestaMatrices(matriza, matrizb);
                           ejemplo.ImprimeResultados(resultado);
                           break;
                   case 3: ejemplo.SumaMatrices(matriza, matrizb);        
                           ejemplo.TranspuestaSumaMatrices(resultado);
                           break;
                   default: System.out.println("Error en opción elige nuevamente ");
                            break;
               }
            
        }
        
    }

 }
    

