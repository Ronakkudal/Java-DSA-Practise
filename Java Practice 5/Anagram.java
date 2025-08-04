import java.util.*;
public class Anagram {
    public static void main(String args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st str");
        String str1= sc.nextLine();
        System.out.println("enter 2nd str");
        String str2= sc.nextLine();
        if(str1.length()==str2.length()){
            char a1[]=str1.toCharArray();
            char a2[]=str2.toCharArray();
            boolean result=Arrays.equals(a1,a2);
    if(result){
        System.out.println("anagram");
    }
    else{
        System.out.println("not anagram");
    }
        }
    }
}
