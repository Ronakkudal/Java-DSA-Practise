import java.util.*;
public class revarray {
    public static void reverseArray(int numbers[]){
        int first=0,   last = numbers.length-1;

        while(first<last){
            int temp =numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;


        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers []={2,5,8,9,10};
        System.out.println(numbers);
reverseArray(numbers);
for(int i =0;i<=numbers.length;i++){
    System.out.print(numbers[i]+" ");
}

    }
    
}


