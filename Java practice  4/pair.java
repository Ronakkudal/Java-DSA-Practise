import java.util.*;
public class pair {
    public static void pairArray(int numbers[]){
        for(int i =0;i<numbers.length;i++){
            int curr =numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
            }
            System.out.println();
        }

    }
public static void main(String args[]){
    int numbers[]={2,4,6,4,8,8}; 
    pairArray(numbers);

}
    
}
