public class PairsInArray {
    public static void Pairs(int Number[]){
        for(int i =0;i<Number.length;i++){
            int curr=Number[i];
            for(int j = i+1;j<Number.length;j++){
                System.out.println("{"+curr+","+Number[j]+"}");
            }
            System.out.println();
        }

    }



    public static void main (String args[]){
        int Number[]={2,4,6,8,10};
    }
    
}
