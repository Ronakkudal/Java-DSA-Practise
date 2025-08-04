import java.util.*;
public class countingDigit{
    public static void main (String args[]){
        int number =12345;
        int digits = countDigit(number);
        System.out.println("Number of digit :" +digits);}

        public static int countDigit(int x) {
            int res = 0;
            while(x>0){
                x=x/10;
                res++;
            }
            return res;

        }
    }
