import java.util.*;
public class CheckNumber {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number: ");
int n =sc.nextInt();


if(n>0){
    System.out.println("Number is Positive");
}
else if(n==0){
    System.out.println("Zero");
}
else{
    System.out.println("Number is negative");
}
if(n%2==0){
    System.out.println("Number is even");
}
else{
    System.out.println("Number is odd");
}

    }
    
}
