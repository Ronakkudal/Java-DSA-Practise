public class RemoveDuplicate{
    public static String removeDup(String S){
   
        Stack<Charcater>stack=new Stack();
        for(int i=0;i<S.length;i++){
            if(!stack.isEmpty()&&stack.peek()==S.charAt(i)){
                stack.pop();

            }
            else{
                stack.add(S.charAt(i));

            }
        }
 public static void main(String args[]){
    }
}