import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class cost {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float pencil=sc.nextFloat();
        System.out.println("ENter the cost of pen");
        float pen=sc.nextFloat();
        System.out.println("enter the cost of eraser");
        float eraser=sc.nextFloat();
        float bill=14.2f+15.4f+12.4f;
        System.out.println("Total bill"+bill);
        float newBill = bill+(0.18f*bill);
    System.out.println("new bill with gst is "+newBill);

    }
}
