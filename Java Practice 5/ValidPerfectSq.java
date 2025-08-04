import java.util.*;
public class ValidPerfectSq {
    public static boolean isValidPerfectSq(int n){

        if(n==1){
            return true;

        }
      int low =1;
      int high = n/2;
      while(low<=high){
        int mid = (low+(high-low)/2);
        if(mid == n/mid && n%mid ==0){
            return true;

        }
        else if(mid<n/mid){
            low = mid +1;

        }
        else{
      high=mid-1;

        }

      }

        return false;
    }
   
    public static void main (String args[]){
        int n =15;
        System.out.println(isValidPerfectSq(n));

    }
    
}
