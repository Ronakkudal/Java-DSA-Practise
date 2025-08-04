import java.util.*;
public class evenodd {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number which you want print :");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Enter number is Even");
        }
        
        else{
            System.out.println("Enter number is Odd");
        }

    }
    
}
