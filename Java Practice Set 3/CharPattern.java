/*public class CharPattern {
    public static void main (String args[]){
        int n=5;
        char ch ='A';
        for(int line =1;line<=n;line++){
            for(int charCount=1;charCount<=line;charCount++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}*/
public class CharPattern{
    public static void main(String args[]){
        int n= 5;
        char ch ='A';
        for(int i =1;i<=n;i++){
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
             System.out.println();
            
        }
       

    }
}