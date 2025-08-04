import java.util.*;
public class table {
public static void printMultiplicationTable(int number){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number for table");
    int num = sc.nextInt();
    for( int i =1;i<=10;i++){
    System.out.println(num+"* " + i +"="+num*i);
    }
}

public static void main(String args[]){
    printMultiplicationTable(0);

}

}

