import java.util.*;
public class smallest_array {

    public static int smallest(int numbers[]){
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if( smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;


    }


    public static void main(String args[]){
        int numbers[]={3,5,89,3,5,68,9,4,1};
        int min= smallest(numbers);
        System.out.println("smallest elemnt in arraya is "+min);

    }

    
}
