public class inc {
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }
    public static int SumOfN(int n){
        if(n==1){
            return 1;
        }
 
      int Snm1=SumOfN(n-1);
      int Sn=n+Snm1;
      return Sn;

    }
    public static void main(String args[]){
        int n= 10;
        System.out.println(SumOfN(n));
    }

    
}
