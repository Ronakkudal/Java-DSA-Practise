import java.util.*;

public class halftriangle {
    public static void half_pyramid(int n){
    
       for(int i=1;i<=n;i++){
          for(int j=1;j<=n-1;j++){
           System.out.print(" ");
          }
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }

       System.out.println();
      }
    

    }
    public static void main(String args[]){
        half_pyramid(7);
   
}
   
    }

