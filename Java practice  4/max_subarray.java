
import java.util.*;

public class max_subarray {
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum = 0;
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    currSum+=numbers[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum= "+maxSum);
    }

    public static void main(String args[]){
        int numbers[]={2,5,9,7,-5,-10};
        maxSubarraySum(numbers);
    }

}

