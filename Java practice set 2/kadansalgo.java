public class kadansalgo {
    public static void kadans(int number[]){
        int ms =Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<=number.length;i++){
            cs = cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms =Math.max(cs,ms);

        }
        System.out.println("our max subarray sum is :"+ms);

    }
    public static void main(String args[]){
        int number[]={5,4,-3,2,-10,-4};
      kadans(number);

    }
    
}





