
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
public class Cajero {
    
        public static ArrayList<Double> depo = new ArrayList<Double>();
        public static ArrayList<Double> ret = new ArrayList<Double>();
        public static double total = 0;
        public static double deptoini = 0;
        public static int contdepo = 0;
        public static int contret = 0;
    
    public static void main(String[] args) throws IOException {
        
        int op;
        boolean salir = false;
        String cont;
        Scanner obj = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       
        
        do{
            System.out.println("Menú Cajero");
            System.out.println("1.- Deposito ");
            System.out.println("2.- Retiro");
            System.out.println("Teclee movimiento:");
            
           
            try{
                op = obj.nextInt();    
                switch(op){
                    case 1:

                            hazDeposito();
                            System.out.println("Dessea continuar s/n");
                            cont = br.readLine();
                            switch(cont){
                                case "s":
                                         salir = false;
                                         break;

                                case "n":
                                        salir = true;
                                        imrpimeTicket();
                                        break;

                                default:
                                        System.out.println("Solo opción n o s");
                            }

                            break;
                    case 2:

                            hazRetiro();
                            System.out.println("Dessea continuar s/n");
                            cont = br.readLine();
                            switch(cont){
                                case "s":
                                         salir = false;
                                         break;

                                case "n":
                                         salir = true;
                                         imrpimeTicket();
                                         break;

                                default:
                                        System.out.println("Solo opción n o s");
                            }

                            break;

                    default:
                            System.out.println("Solo números entre 1 y 2");
                }
                
            }catch (Exception e) {
                System.out.println("Debes insertar un número");
                obj.next();
            }
            
            
            
            
            
        }while(!salir);
    }
    
    public static void hazDeposito(){
        
        Scanner obj = new Scanner(System.in);
        double imp;
        System.out.println("Digite importe:$");
        imp = obj.nextDouble();
        depo.add(imp);
        total = total + imp;
        contdepo++;
        if (contdepo == 1) {
           deptoini = imp;
        }
    }
    
    
    public static void hazRetiro(){
        
        Scanner obj = new Scanner(System.in);
        double imp;
        System.out.println("Digite importe:$");
        imp = obj.nextDouble();
        
        
        if (imp > total) {
            System.out.println("Retiro rechazado");
        }else{
            ret.add(imp);
            total = total - imp;
            contret++;
        }
        
        
       
    }
    
    public static void imrpimeTicket(){
        
        double depoad = 0;
        double retad = 0;
        
        for (double i:depo) {
            
            depoad = depoad + i;
            
        }
        
        
        for (double i:ret) {
            retad = retad + i;
        }
        
        System.out.println("*************************************************************************************");
        System.out.println("*                                       Ticket                                      *");
        System.out.println("*************************************************************************************");
        System.out.println("*Importe del deposito inicial:                                         $"+deptoini+"*");
        System.out.println("*Número de depositos adicionales("+depo.size()+") e importe depositado:$"+depoad+"  *");
        System.out.println("*Importe de retiros adicionales ("+ret.size()+") e importe retirado:   $"+retad+"   *");
        System.out.println("*Importe final en la cuenta:                                           $"+total+"   *");
        System.out.println("*************************************************************************************");
        System.out.println("*                                                                                   *");
        System.out.println("*************************************************************************************");
    }
    
}
