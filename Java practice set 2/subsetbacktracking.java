public class subsetbacktracking {
    public static void findSubset(String str, int i,String ans){
        //base case
        if(i==str.length ()){
            if(ans.length()==0){
            System.out.println("null");}
            else{
                System.out.println(ans);
            }
            return;

        }

        //yes 
           findSubset(str,i+1, ans+str.charAt(i));
         findSubset(str, i+1, ans);

        //No
     
     
    }

    public static void main(String args[]){
        String str ="abc";
        findSubset(str, 0, "");
        
    }
    
}
