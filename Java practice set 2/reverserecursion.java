/*public class reverserecursion {
  public static void printInc(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
     printInc(n-1);
    System.out.println(n+"");
   

  }

    public static void  main(String args[]){
        int n=10;
        printI(n);

    }
    
}*/
public class reverserecursion {
    public static void printInc(int n){
        if(n==1){
            System.out.println(1+" ");
            return;
        }

         
        printInc(n-1);
        System.out.println(n);
    }
    public static void main (String args[]){

        int n=12;
        printInc(n);
    }
}
