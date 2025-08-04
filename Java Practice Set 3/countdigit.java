/*import java.util.*;
public class countdigit{
    public static void main (String args[]){
        int numbers = 12345;
        int digit = countdigit(numbers);
        System.out.println("Number of digit:" + digit);
    }
    public static int countdigit(int x){
        int res =0;
        while (x>0){
            x= x/10;
            res++;
        }


        return res;
    }

import java.util.*;
public class countdigit{
    public static void main (String args[]){
        int numbers= 12345;
        int digits =countdigit(numbers);
         System.out.println("Number of digit:" + digits);

    }
    public static int countdigit(int x){
        int res=0;
        while(x>0){
            x=x/10;
            res++;

        }
        return res;
    }
}}*/



import java.util.*;
public class countdigit{
    public static void main (String args[]){
        int numbers = 12345;
        int digit = countdigit(numbers);
        System.out.println("Number of digit  " +digit);
    }
    public static int countdigit(int x){
        int res =0;
        while(x>0){
            x=x/10;
            res++;
        }
        return res;
    }
}