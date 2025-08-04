public class MaxMinArr {
    public static void main(String args[]){
        int arr[]={2,3,4,5,8,10,15,1};
        findMaxMinarr(arr);

    }
   static void  findMaxMinarr(int arr[]){
        if(arr==null||arr.length==0)
        return ;
    int min =arr[0];
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
     min =Math.min(min,arr[i]);
     max =Math.max(max,arr[i]);
    }
    System.out.println(max+"maxium");
    System.out.println(min+"min");

    }
}
