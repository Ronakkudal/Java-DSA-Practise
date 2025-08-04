import java.util.*;
public class arrayInput2 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+5;
        }

    }
    public static void main (String args[]){
        int marks []={95,97,100};
        update(marks);
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
     


    }

    
}
