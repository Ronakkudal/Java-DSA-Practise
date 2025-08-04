import java.util.*;
public class LargestNum {
    public static int LargestNumber(int arr[]){
        int largest= Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }

            
        }
        return smallest;
  

    }
    public static void main (String args[]){
        int arr[]={2,3,45,6,73,24,45,21,65};
        System.out.println("Largest Number is"+LargestNumber(arr));
        System.err.println("Smallest among all"+LargestNumber(arr));
     }
    
}
