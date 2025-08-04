public class butterfly {
    public static void butterFlyPattern(int n){
        //lines which we print
    for (int i=0;i<=n;i++){
        //star we print 1st
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //space
        for(int j =1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //star we print 1st
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }


    }
    for (int i=0;i>=n;i--){
        //star we print 1st
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //space
        for(int j =1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //star we print 1st
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }


    }


     

    }
    public static void main (String args []){
        butterFlyPattern(3);
    }
    
}
