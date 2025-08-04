import java.util.*;
public class arraysss{
public static int largest(int numbers[]){
    int largest =Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(largest<numbers[i]){
             largest =numbers[i];
        }
    }
    return largest;


}



    public static void main(String args[]){
        int numbers[]={1,2,3,5,19,68,84,211,45,67};
        int max =largest(numbers);
        System.out.println("largest element in array is : " + max);
    

    }
}
