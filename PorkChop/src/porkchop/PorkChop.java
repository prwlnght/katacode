
package porkchop;

import static java.lang.Math.ceil;
import java.util.Arrays;


public class PorkChop {
        // iterative 
       public static int chop_it(int value,int [] arr){
           Arrays.sort(arr, 0, arr.length-1);
           int start_indx=0;
           int end_indx=arr.length -1;
           int mid_indx;
        
           if (arr.length==0) return -1;
           
           while ((end_indx>start_indx)){
           mid_indx=(int)(start_indx+end_indx)/2;      
           if (arr[start_indx]==value){
               return start_indx;
           }
           else if (arr[mid_indx]==value){
               return mid_indx;
           }
           else if(arr[mid_indx]==end_indx){
               return end_indx;
           }
           else if (arr[mid_indx]>value){
               start_indx=mid_indx;
           }
           else{
               end_indx=mid_indx;
           }

       }
           if (arr[end_indx]==value) return end_indx;
           return -1;
                   
       }
       
       public static int chop_rec(int value, int [] arr){
           if (arr.length==0) return -1; 
           int start_pt=0;
           int end_pt=arr.length-1;
           int c;
           
           int mid_pt=(int) ceil((float)(start_pt+end_pt)/2);
           
           if (arr[start_pt]==value)return start_pt;
           if (arr[mid_pt]==value) return mid_pt;
           if (arr[end_pt]==value)return end_pt;
           
           if (arr[mid_pt]>value){
               start_pt=mid_pt; 
               c=mid_pt;
           }
           else {
               end_pt=mid_pt;
               c=start_pt;
           }
           
           int[] new_arr=new int[end_pt-start_pt];

           for (int j=0;j<new_arr.length;j++){
               new_arr[j]=arr[start_pt+j+1];
           }
           
           
           if (chop_rec(value,new_arr)==-1)return -1;
           else return c+chop_rec(value,new_arr);
            
          
}
}
       
       
  
