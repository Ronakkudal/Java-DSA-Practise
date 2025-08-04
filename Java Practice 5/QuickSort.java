public class QuickSort {
    public static void quickSorting(int arr[], int si,int ei){
   if(si>=ei){
    return;
   }
   int pIdx= partition(arr,si,ei);
   quickSorting(arr, si, pIdx-1);
   quickSorting(arr, pIdx+1, ei);


    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i =si-1;
        for(int j=0;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[j]=arr[i];
                arr[i]=temp;


            }
        }
         int temp=pivot;
               arr[ei]=arr[i];
               arr[i]=temp;
               return i;
                

    }
    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
    
        public static void main(String args[]){
            int arr[]={2,4,5,6,3,1};
            quickSorting(arr, 0, 0);
         
            printArr(arr);

        }
    }



    

