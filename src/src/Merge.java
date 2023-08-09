/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silpa_000
 */
public class Merge {
    
    public static void main(String[] args) {
        
        int merge [] = {9,8,7,6,5,5,3,2,1,0};
        
        int men = 0;
        
        
        for (int i = 0; i < merge.length; i++) {
            for (int j = i+1; j < merge.length; j++) {
                
                if (merge[i] > merge [j]) {
                    
                   men = merge [j];
                   merge[j] = merge [i];
                   merge [i] = men;
                    
                }
                
            }
            
        }
        
        
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i]+" ");
        }
        
        
    }
    
}
