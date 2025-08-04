import java.util.*;

public class MaxSubArr {
    public static void kadans(int number[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }

        System.out.println("Our max subarray sum is " + ms);
        System.out.print("Max subarray is: ");
        
        // Print the elements of the maximum subarray
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    public static void main(String args[]) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadans(number);
    }
}



































































