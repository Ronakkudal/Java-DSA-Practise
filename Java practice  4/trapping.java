import java.util.*;
public class trapping {
    public static int trappedWater(int height[]){
    int leftMax[]=new int[height.length];
    leftMax[0]=height[0];
    for(int i =1;i<height.length;i++){
        leftMax[i]=Math.max(height[i],leftMax[i-1]);
    }
    int rightMax[]=new int [height.length];
    

    }
    
}
