
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class Ticket {
 
    public static void main(String[] args) throws IOException {
        
         ArrayList<Object[]> ticket = new ArrayList<Object[]>();
         int noprod = 0;
         int nobienes;
         double preciou,importetot;
         importetot = 0;
         String prod;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
         
         for (int i = 0; i < 10; i++) {
             
             noprod++;
             System.out.println("Producto "+noprod);
             System.out.println("Nombre de producto:");
             prod = br.readLine();
             System.out.println("No de bienes:");
             nobienes = Integer.parseInt(br.readLine());
             System.out.println("Precio unitario:");
             preciou =Double.parseDouble(br.readLine());
             
             ticket.add(new Object[]{noprod,prod,nobienes,preciou});
            
        }
        
        System.out.printf( "%s%20s%s%s\n", "No producto\t", "Nombre de producto\t","No de bienes\t"," Precio unitario\t" );
         
         
         
        for (Object[] dato : ticket){
            System.out.printf( "\t%4d\t\t%s\t\t%d%20.2f\n",(int)dato[0] ,(String) dato[1],(int)dato[2],(double)dato[3]);
            importetot =  importetot +((int)dato[2]*(double)dato[3]);
        }
        
        System.out.printf("%s\t\t\t\t\t%s%20.2f\n","Importe total"," ",importetot);
        
        
        
        
    }
}
