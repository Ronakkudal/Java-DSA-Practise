import java.util.*;
public class linearsearch {
    public static int linear(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }



        public static int Lsearch(String menu[] , String key){
           for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int numbers[]={2,4,5,6,8,10,12,14};

       /*  Scanner sc =new Scanner(System.in);
        System.out.print("Enter the key you want to found :");
        int key = sc.nextInt();
        int index= linear(numbers,key);
        if(index==-1)
        {
            System.out.println("key not found");
        }
        else{
            System.out.println("Key is at index :"+index );
        }*/

        String menu[]= {"DOsa","Pizza", "pasta","cake","ice creme"};
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the key you want to found :");
        String key = sc.nextLine();
        int index=Lsearch(menu, key);
        if(index==-1){
    
            System.out.println("key not found");
        }
        else{
            System.out.println("Key is at index :"+ index );
        }


        


    }
 
}

