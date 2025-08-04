/*public class ispalidrome {
    
    public static void main (String args[]){
        int numbers = 43534;
        boolean ispalidrome = isPal(numbers);
        if (ispalidrome){
            System.out.println(numbers+"is a palindrome");

        }

        else{
            System.out.println(numbers+"is not a palidrome");
        }
    }
    public static boolean isPal(int n){
        int rev=0;
        int temp =n;
        while(temp!=0){
            int ld = temp%10;
            rev =rev*10+ld;
            temp =temp/10;

        }
        return(rev ==n);

    }
}
*/
import java .util.*;
public class ispalidrome{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number which You want to check for palidrome  : ");
        int number = sc.nextInt();
        boolean ispalidrome =isPal(number);
        if(ispalidrome){
            System.out.println(number+" is palidrome");
        }
        else{
            System.out.println(number+"is not palidrome");
        }
    }
    public static boolean isPal(int n){
        int rev =0;
        int temp=n;
        while(temp!=0){
            int lastdigit =temp%10;
            rev = rev*10+lastdigit;
            temp =temp/10;
        }

        return (rev ==n);

    }
}