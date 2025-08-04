import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class largestofthree {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
           int a = sc.nextInt();
           int b=sc.nextInt();
           int c=sc.nextInt();
           if(a>b && a>c){
            System.out.print("A is greater then all");
           }
else if(b>a && b>c){
    System.out.println("B is greater then All of this");
}
        else{
            System.out.println("C is greater the all");
        }
    }
    
}
