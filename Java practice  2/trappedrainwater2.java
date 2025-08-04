public class trappedrainwater2 {
public static int  rainWaterTrapped (int height[]){
            int n = height.length;
            //cal left most boundary
            int leftMax[]=new int[n];
            leftMax[0] =height[0];
            for(int i =0;i<n;i++){
                leftMax[i]=Math.max(height[i],leftMax[i-1]);
            }

            //cal right most boundary
            int rightMax[]=new int [n];
            rightMax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                rightMax[i]=Math.max(height[i],rightMax[i+1]);

            }
            int trappedrainwater=0;


            //loop
            for(int i=0;i<n;i++){
                int waterLevel =Math.min(leftMax[i],rightMax[i]);
                trappedrainwater+=waterLevel-height[i];

            }

            return trappedrainwater;
            //waterlevel =min(leftmax bound,rightmax bound)
}     public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(rainWaterTrapped(height));

    }
    
}
    

