import java.util.*;
public class count {
    public static void main(String args[]){
        int [][] array ={
                          {4,7,8},
                          {8,7,7}

        };
        int countOf8=0;
        for(int i =0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==8){
                    countOf8++;
                }
            }

        }
        System.out.println("Count of 8 is :" +countOf8);


    }
    
}
