import java.util.*;
public class SortingString {
    public static void StringSort(String str){
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));

    }

    public static void main(String args[]){
        String s="ronak kudal";
        StringSort(s);
    }
    
}
