import java.util.*;
public class singleNum {
    public static int SingleNumber(int nums[]){
        int xor=0;
        for(int num:nums){
            xor=xor^num;

        }
        return xor;
    }

    public static void main(String args[]){
        int nums[]={2,2,3,3,4,5,5};
        System.out.println(SingleNumber(nums));
    }

    
}
