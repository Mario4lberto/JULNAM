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
public class Cramer {
    
    private int a,b,c,d,e,f;
    
    private int det [][], detx[][],dety[][];
    
    private float dt,dtx,dty,x,y;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int[][] getDet() {
        return det;
    }

    public void setDet(int[][] det) {
        this.det = det;
    }

    public int[][] getDetx() {
        return detx;
    }

    public void setDetx(int[][] detx) {
        this.detx = detx;
    }

    public int[][] getDety() {
        return dety;
    }

    public void setDety(int[][] dety) {
        this.dety = dety;
    }

    public float getDt() {
        return dt;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public float getDtx() {
        return dtx;
    }

    public void setDtx(float dtx) {
        this.dtx = dtx;
    }

    public float getDty() {
        return dty;
    }

    public void setDty(float dty) {
        this.dty = dty;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Sistema simultaneo de ecuaciones:");
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");
        
        Cramer cr = new Cramer();
        
        int a,b,c,d,e,f;
        
        int det [][], detx[][],dety[][];
        
        float dt,dtx,dty,x,y;
        
        
        Scanner obj = new Scanner(System.in);
        
        
        
        System.out.println("Dame el valor de a:");
        a = obj.nextInt();
        cr.setA(a);
        System.out.println("Dame el valor de b:");
        cr.b = obj.nextInt();
        System.out.println("Dame el valor de c:");
        cr.c = obj.nextInt();
        System.out.println("Dame el valor de d:");
        cr.d = obj.nextInt();
        System.out.println("Dame el valor de e:");
        cr.e = obj.nextInt();
        System.out.println("Dame el valor de f:");
        cr.f = obj.nextInt();
        
        System.out.println("El sistema de ecuaciones es:");
        
        System.out.println(a+"x + "+cr.b+"y = "+cr.c);
        System.out.println(cr.d+"x + "+cr.e+"y = "+cr.f);
        
        System.out.println();
        
        det = cr.regresaDeterminante(cr.getA(),cr.b,cr.d,cr.e);
        cr.setDet(det);
        dt = cr.calculaDeterminante(cr.getDet());
        cr.setDt(dt);
        
        cr.detx = cr.regresaDeterminante(cr.c,cr.b,cr.f,cr.e);
        cr.dtx =  cr.calculaDeterminante(cr.detx);
        
        cr.dety = cr.regresaDeterminante(cr.a,cr.c,cr.d,cr.f);
        cr.dty =  cr.calculaDeterminante(cr.dety);
        
        //System.out.println(cr.dt);
        
        
        
        try{
            cr.x =  cr.dtx / cr.getDt();
            cr.y = cr.dty / cr.dt;
            System.out.println("La solucion es:");
            System.out.println("x = "+cr.x+", y = "+cr.y);
        }catch(Exception exc){
            System.out.println("El sistema de ecuaciones no tiene solución");
        }
        
        
       
        
        
    }
    
    public int [][]  regresaDeterminante(int a,int b,int c,int d){
        
        int det [][] = new int [2][2];
        
        
        for (int i = 0; i < det.length; i++) {
            for (int j = 0; j < det[0].length; j++) {
                for (int k = j + 1; k <  det[0].length; k++) {
                    for (int l = i + 1; l < det.length; l++) {
                        
                    
                    //aux1 = perimetroCuad(cont1);
                    det[i][j] = a;
                    //aux2 = areaCuad(cont1);
                    det[i][k] = b;
                    det[l][j] = c;
                    det[l][k] = d;
                    
                
                 }     
                    
               }            
            } 
        }
        
        /*System.out.println();
        
        for (int i = 0; i < det.length; i++) {
            for (int j = 0; j < det[0].length; j++) {
                System.out.print(det[i][j]+" ");
            }
            System.out.println();
        }*/
        
        
        return det;
        
    }
    
    public float calculaDeterminante(int det [][]){
        
       float dt = 0; 
       
       for (int i = 0; i < det.length; i++) {
            for (int j = 0; j < det[0].length; j++) {
                for (int k = j + 1; k <  det[0].length; k++) {
                    for (int l = i + 1; l < det.length; l++) {
                        
                    
                    dt = (det[i][j]* det[l][k])-(det[l][j]*det[i][k]);
                    
                
                 }     
                    
               }            
            } 
        }
        
        return dt;
    }
    
}
