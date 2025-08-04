
// Java program that accepts 
// array input from the user. 
import java.util.Scanner; 
  
public class InputArr { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
  
        // Take the array size from the user 
        System.out.println("Enter the size of the array: "); 
         int size  = sc.nextInt(); 
        int[] arr = new int[size]; 
  
        // Take user elements for the array 
        System.out.println( "Enter the elements of the array: "); 
        for (int i = 0; i <size; i++) { 
            if (sc.hasNextInt()) { 
                arr[i] = sc.nextInt(); 
            } 
        } 
  
        System.out.println( "The elements of the array are: "); 
        for (int i = 0; i < size; i++) { 
            // prints the elements of an array 
            System.out.print("{"+(arr[i])+","+"}"); 
        } 
        sc.close(); 
    } 
} 
  