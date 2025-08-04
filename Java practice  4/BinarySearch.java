import java.util.*;
public class BinarySearch {
    public static int binary(int numbers[],int key){
        int start= 0,end=numbers.length-1;
        while(start<=end){
            int mid =(start + end)/2;
            if(numbers[mid]==key)   {
                return mid;
                
                
        }
        if(numbers[mid]<key){
            start=mid+1;

        }else{
            end=mid-1;
        }
    }

        return-1;

    }
    public static void main(String args[]){
        int numbers[]={2,4,5,6,7,8,12,13,25,26,29,45};
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter the key you want to found :" );
        int key =sc.nextInt();
        System.out.println("index for key is " + binary(numbers, key));
    }
    
}
