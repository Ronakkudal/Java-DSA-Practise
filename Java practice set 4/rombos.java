public class rombos {
    public static void solid_rombos(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }

    public static void hollo_rombos(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n ||j==1||j==n){
                    System.out.print("*");

                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

   
public static void diamond(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");

        }
        for(int j=1;j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }


for(int i=n;i>=1;i--){
    for(int j=1;j<=(n-i);j++){
        System.out.print(" ");

    }
    for(int j=1;j<=(2*i)-1; j++){
        System.out.print("*");
    }
    System.out.println();
}

}
public static void numberPyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
     
    }
   
}

public static void palidromicPatternNumbers(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i); j++){
            System.out.print(" ");
        }
        for (int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}


    public static void main(String args[]){
        //solid_rombos(7);
        //hollo_rombos(10);
        //diamond(8);
       // numberPyramid(5);
       palidromicPatternNumbers(10);
    }

}
