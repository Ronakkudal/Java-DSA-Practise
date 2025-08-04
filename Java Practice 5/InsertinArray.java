import java.util.*;
public class InsertinArray {
    public static void main(String args[]){
        int a[]={2,3,4,6,7};
        int pos=3;
        int element=5;
        for(int i=a.length-1;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=element;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
    }
    
}
