public class sumOfCol {
    public static void main(String args[]){
        int num[][]={
            {4,7,8},
            {8,5,6},
            {8,7,7}};

        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i][0];
        }
        System.out.println("sum of 2 col is :" +sum);
        
    }
    
}
