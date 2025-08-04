import java.util.*;
public class PrimeNum{
   public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER THE NUM WHICH YOU CHECK");
    int num = sc.nextInt();
    System.out.println(num);}


    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;

            }
        }
        return true;
    
}
   
}