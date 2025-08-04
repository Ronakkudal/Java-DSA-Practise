/*public class reverse {
    public static void printReverseArray(int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first<last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }


    }
    public static void main (String args[]){
      int numbers[]={2,4,6,8,10};
      printReverseArray(numbers);
      for(int i = 0; i<numbers.length;i++){
        System.out.print(numbers[i] + " ");
      }
      System.out.println();
    }
    
}*/


public class reverse{
  public static void printReverseOfArray(int numbers[]){
    int first = 0 ,  last =numbers.length-1;
    while(first<last){
        int temp = numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;
        first++;
        last--;


    }

  }


    public static void main (String args[]){
        int numbers []={5,8,9,45,63,14};
        printReverseOfArray(numbers);
        for(int i = 0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();

    }
}
