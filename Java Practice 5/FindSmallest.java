import java.util.*;
public class FindSmallest {
    public static void main(String args[]){
        int arr[]={2,3,5,6,7,78,0,-1};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Smallest Element :"+arr[0]);
        System.out.println("Second smallest element :"+arr[1]);
    }
    
}
