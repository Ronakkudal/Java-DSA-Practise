import java.util.*;

public class evenoddsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum =0;
        
        do{
            System.out.print("Enter the number");
            number =sc.nextInt();


        if(number%2==0){
            evenSum += number;
        
    }
    else{
        oddSum +=number;
    }
    System.out.println("Do you want to continue? press 1 for yes or 0 for no");
    choice=sc.nextInt();


        
        } while(choice==1);
        System.out.println("even sum :"+evenSum);
        System.out.println("sum of odd num :" + oddSum);

}

}
