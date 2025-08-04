public class pattern6 {
  public static void SolidRhombus(int n,int totRows, int totCols){
    //outerloop
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=n;j++){
            if(i==1|| i==totRows ||j==1|| j==totCols){
            System.out.print("*");
            }
            else{
            System.out.print(" ");
            }
    
        }
        
    
        System.out.println();
    }


}
   public static void main(String args[]){
    SolidRhombus(10, 10, 10);

    }
    
}
