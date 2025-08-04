import java.nio.file.attribute.FileTime;
import java.util.*;
public class reverse_array {
    public static void  arrayReverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;

        }



    }
    public static void main(String args[]){
        int numbers[]={2,5,8,9,8,10,11,15,};
        arrayReverse(numbers);
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }
}


    

