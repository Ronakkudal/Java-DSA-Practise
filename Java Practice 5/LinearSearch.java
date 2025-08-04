import java.util.*;

public class LinearSearch {
    public static int LinearSearching(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 78, 99, 3, 2, 2, 345, 6, 87, 8765, 32, 34, 5, 43, 2, 345, 6, 543, 2345, 64, 323,
                456, 5, 432, 34, 56, 543, 234, 567, 65 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key You want to Find");
        int key = sc.nextInt();
        int Index = LinearSearching(arr, key);
        if (Index == -1) {
            System.out.println("key not Found");
        }

        else {
            System.out.println("key is at Index : " + Index);
        }

    }

}