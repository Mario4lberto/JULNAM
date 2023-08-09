import java.math.BigDecimal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class Fibonacci {
    public static void main(String[] args) {
        BigDecimal pri = new BigDecimal(0);
        BigDecimal seg = new BigDecimal(1) ;
        int i = 3;
        
        System.out.println("1 - "+pri);
        System.out.println("2 - "+seg);
        BigDecimal sig = pri.add(seg);
        
        do{
            System.out.println(i+" - "+sig);
            pri = seg;
            seg = sig;
            sig = pri.add(seg);
            
            i++;
        }while(i<= 10000);
        
        
        
    }
}
