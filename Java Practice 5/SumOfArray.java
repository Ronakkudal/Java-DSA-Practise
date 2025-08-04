import java.util.*;
public class SumOfArray {
       

    public static int sumofArr(){
        int arr[]={2,3,44,5,6};
        int sum =0;
       
        int i;
        for(i=0;i<=arr.length;i++){
            sum =sum+arr[i];
         

        }
           return sum;
    }
    public static void main(String args[]){
        System.out.println(sumofArr());
     
    }
    
}
