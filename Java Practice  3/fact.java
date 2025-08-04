import java.util.*;
public class fact {
    public static int Fact(int n){
        if(n==0){
         return 1;
}

      int fnm1= Fact(n-1);
      int fn =n*fnm1;
      return  fn;

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number that you want factorial :");

        int n= sc.nextInt();

   
    System.out.println("Factorial of "+ n +  " is "+Fact(n));

    }
    
}
