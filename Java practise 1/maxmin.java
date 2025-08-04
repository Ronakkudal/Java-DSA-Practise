import javax.swing.plaf.synth.SynthSpinnerUI;

public class maxmin{
    public static void main (String args[]){
        int arr[]={2,3,6,8,7,1,0,10};
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max val:"+max);
        System.out.println("min val :"+min);
    }
}





/*public public class maxmin{
    public static void main(String args[]){
        int arr[]={1,2,2,5,8,8,9,10};
    int max= arr[0];
    int min =arr[0];
    for(int i =1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
System.out.println("Max val "+max);
System.out.println("Min va;"+min);

}

    
}
*/