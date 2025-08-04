public class pattern5 {
    public static void ButterFlyPattern(int n){
        //outer
        for(int i=1;i<=n;i++){
            //Inner star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        //space
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        // star
         for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd Half
        for(int i=n;i>=1;i--){
        //Inner star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        //space
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        // star
         for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
        
    }



    public static void main (String args[]){
        ButterFlyPattern( 4);

    }
    
}
