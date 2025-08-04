import java.util.*;
public class invertedhalf {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     // lines print 
    for(int i = 0; i<=n;i++){
        //for space
        for(int j = 1;j<=n-i;j++){
        System.out.print(" ");
    }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
    //for star
    

    }

}
