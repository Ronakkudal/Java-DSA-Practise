import java.util.*;
public class weekno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week Number you find");
        int week_num =sc.nextInt();
        switch(week_num){
            case 1:
              System.out.println("Monday");
              break;
              case 2 :
              System.out.println("Tue");
              break;
              case 3 :
              System.out.println("Wed");
              break;
              case 4 :
              System.out.println("thu");
              case 5 :
              System.out.println("fri");
             break;
             case 6:
             System.out.println("sat");
             break;

             case 7:
             System.out.println("Sun");
             default:
             System.out.println("Enter a valid input from 1 to 7");
              
            
        }
    }
    
}
