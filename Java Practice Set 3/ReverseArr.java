

public class ReverseArr {
    public static void FindReverse(int arr[]){
        int first=0;int last=arr.length-1;

        while(first<last){
            int temp =arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
        first++;
        last--;
    }


    }
    
    public static void main(String args[]){
        int arr[]={9,8,7,6,5,4,3,2,1};
      //  System.out.println(arr);
        FindReverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");}
    }
}
