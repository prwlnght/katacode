
package porkchop;


public class PorkChop {
        // iterative 
       public static int chop(int value,int [] arr){
           int start_indx=0;
           int end_indx=arr.length -1;
           
           int start_indx1=1;
           int end_indx1= 0;
           
           int mid_indx=-1;
           
           int counter=(int)Math.log(arr.length);
           int i =0;
           
           if (arr.length==0) return -1;
           else if (arr.length==1){
               if (arr[0]==value) {
                   return 1;
               }
               else
               {return -1;}
           }
           
           
           
           while ((start_indx!=start_indx1 && end_indx!=end_indx1)){
           start_indx=start_indx1;
           end_indx=end_indx1;
           mid_indx=(start_indx+end_indx)/2;
    
           i+=1;
           if (arr[mid_indx]==value){
               return mid_indx;
           }
           else if (arr[mid_indx]>value){
               end_indx1=mid_indx-1;
               mid_indx=-1;
           }
           else{
               start_indx1=mid_indx+1;
               mid_indx=-1;
           }

       }
           return mid_indx;
           
       }
}
       
       
  
