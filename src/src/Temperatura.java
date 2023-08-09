
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
public class Temperatura {
    public static void main(String[] args) {
        
        int temp;
        Scanner obj = new Scanner(System.in);
        
        
        System.out.println("Ingrese la temperatura:");
        temp = obj.nextInt();
        
        if (temp >= 45) {
            System.out.println("Mucho calor");
        }else{
            if (temp < 45 && temp >= 30) {
                System.out.println("Poco calor");
            }else{
                if (temp < 30 &&  temp >= 15) {
                    System.out.println("Temperatura normal");
                }else{
                    if (temp < 15 && temp >= 10) {
                        System.out.println("Poco frio");
                    }else{
                        System.out.println("Mucho frío");
                    }
                       
                }
            }
        }
    }
        
}

