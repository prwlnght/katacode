
package porkchop;
import porkchop.PorkChop;

public class testPorkChop {
    
    public static void main(String[] args) {
       
       // System.out.println(PorkChop.chop_it(3,new int[] {3}));
       // System.out.println(PorkChop.chop_it(3,new int[] {1,3,2}));
       // System.out.println(PorkChop.chop_it(8,new int[] {1,3,2,7,8,9,10,15}));
        
        System.out.println(PorkChop.chop_rec(3,new int[] {}));
        System.out.println(PorkChop.chop_rec(3,new int[] {1,3,2}));
        System.out.println(PorkChop.chop_rec(8,new int[] {1,3,2,7,8,9,10,15}));
        
    }
    
  
    

    
   
    
    
}
