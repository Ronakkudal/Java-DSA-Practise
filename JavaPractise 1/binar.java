import java.util.*;

public class binar {
    public static int binarySearch(int key,int numbers[])

{
    int start =0,end = numbers.length-1;

    while(start<=end){
        int mid = (start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }

        if(numbers[mid]<key){
            start =mid+1;
        }
        else{
            end= mid-1;
        }
    }
    return -1;

}

 public static void main(String args[]) {
    int numbers []={1,5,8,9,7,25,45,6};
    int key= 1;
    System.out.println(" Index of key " +  key + "is"   +binarySearch(key, numbers));

    
    }
    
}
