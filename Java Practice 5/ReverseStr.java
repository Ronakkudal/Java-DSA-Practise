import java.util.*;

public class ReverseStr {
    public static void reverse(String str []){
        int first =0,last=str.length-1;

        while(first<last){
            String temp=str[last];
            str[last]=str[first];
            str[first]=temp;
            first++;
            last--;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name Which You want to reverse");
        String name=sc.nextLine();
        String[] charArray = name.split("");
        
    
        reverse(charArray);
        
       for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }
}