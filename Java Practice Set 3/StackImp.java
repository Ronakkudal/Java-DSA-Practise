import java .util.*;
public class StackImp {
    static class stack{
    
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
        
    }
    //push
    public static void push(int data){
        list.add(data);


    }
        //pop
    public static int pop(){
        int top = list.get(list.size()-1);
        list.remove(top);
        return top;

    }


    //peak


  public static int peek(){
    int peek = list.get(list.size()-1);
    return peek;
  }




}

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }



    }

}
