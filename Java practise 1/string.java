/*import java.util.*;
public class string {
    public static void main(String args[]){
     Scanner sc = new Scanner( System.in);
     System.out.print(" Enter you Fname");
     String Firstname = sc.nextLine();
     System.out.print(" Enter you Sname");
     String Secondname = sc.nextLine();

     System.out.println( FirstName.charAt(0));



    }
    
}*/
import java.util.*;
public class string {
    public static boolean isPalidrome(String str){
        str = str.trim(); 
    for(int i =0 ; i<str.length()/2;i++){
        int n = str.length();
        if(str.charAt(i)!= str.charAt(n-1-i)){
            return false;
        }
    }

    return true;
}




    public static void main (String args[]){
        String str= " madam";
        System.out.println(isPalidrome(str));
    }

}

