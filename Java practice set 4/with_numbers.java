public class with_numbers{
    public static void  half_pyramid_with_numbers(int n){
        int counter=1;

        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter +" ");
                counter++;


            }
            System.out.println();
        }
    }
        public static void main(String args[]){
            half_pyramid_with_numbers(5);
        

    }
}