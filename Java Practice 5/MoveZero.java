import java.util.*;
public class MoveZero {
    public static void moveZero(ArrayList<Integer>nums){
        int n = nums.size();
        if(n==0||n==1)
        return;
        int left=0,right=0;
        int temp;
        while(right<n){
            if(nums.get(right)==0){
                right++;
            }
            else{
                temp= nums.get(right);
                nums.set(left, nums.get(right));
             
                nums.set(right, temp);
                ++left;
                ++right;;
            }
        }
    }
        public static void main(String args[]) {
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 5, 0, 7));
            moveZero(arr);
            System.out.println(arr);
        }
        

    }
    

