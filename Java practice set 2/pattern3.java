public class pattern3 {

 public static void floyd_triangle(int n){
    int num=1;
  //outerloop
  for(int i =1;i<=n;i++){
    // innerloop
    for(int j=1;j<=i;j++){
        System.out.print(num +" ");
        num++;
    }
    System.out.println();

  }


 }

    public static void  main(String args[]){
        floyd_triangle(5);


    }
    
}
