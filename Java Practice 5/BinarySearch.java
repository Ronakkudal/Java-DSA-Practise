public class BinarySearch {

    public static int  BinartSer(int arr[],int key){
     int first=0,last=arr.length-1;
     while(first<=last){
        int mid=(first+last)/2;
        //compare
        if(arr[mid]==key){
            return mid;

        }
        if(arr[mid]<key){
          first=mid+1;

        }
        else{
            last=mid-1;
        }

     }




        return -1;
    }



    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7,8,9,10};
        int key = 5;
       System.out.println("index for key :"+key+" is  +"+BinartSer(arr, key));

    }

    
}
