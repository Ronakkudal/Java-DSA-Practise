import javax.swing.text.AttributeSet.ColorAttribute;

import java.util.*;
public class transpose {
   public static void main(String args[]){
    int row=3,column=3;
            int matrix[][]={
                {4,7,8},
                {8,5,6},
                {8,7,7}};
                printMatrix(matrix);

                int [][] transpose=new int [column][row];
                for(int i=0;i<column;i++){
                    for(int j=0;j<column;j++){
                    transpose[j][i]=matrix[i][j];

                }
            }


printMatrix(transpose);
        }
public static void printMatrix(int [][] matrix){
    System.out.println("the matrix is : ");
    for(int i =0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
        System.out.print(matrix[i] [j] +" ");
    }
    System.out.println();
}


}
}


        
    
    
    

