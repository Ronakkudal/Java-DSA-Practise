import java.util.*;
public class Contains{
    public static boolean DuplicateNumber(int nums[]){
        int n =nums.length;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
          
        }
          return false;
        
    }
    public static void main(String args[]){
        int nums[]={2,3,4,5,1};
        
    }
    
}
