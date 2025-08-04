public class pattern2 {
 public static void Inverted_pyramid(int n){
//outerloop
  for(int i =1;i<=n;i++){
    //space
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");

    }
    //star
     for(int j=1;j<=i;j++){
        System.out.print("*");
     }
    
      System.out.println();
     
  }
}
    public static void main (String args[]){
        Inverted_pyramid(4);

    }
    
}
