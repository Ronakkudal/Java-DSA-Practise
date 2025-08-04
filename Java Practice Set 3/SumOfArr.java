import java.util.*;
public class SumOfArr {
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of arr ");
    int size =sc.nextInt();
    int arr []=new int[size];
    
    for(int i=0;i<arr.length;i++){

        System.out.print("Enter the number ");
        arr[i]=sc.nextInt();
    }
    int product =1;
    for(int i=0;i<size;i++){
        product =product*arr[i];
   
    System.out.println("products of Array is "+product); }
}

}
