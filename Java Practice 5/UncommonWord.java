public class UncommonWord{
    public static String UncommonSen(String s1,String s2){
        String[] str1=s1.split(" ");
        String[] str2=s2.split("");
        HashMap<String.Integer> hm =new HashMap<>();
        for(String s: str1){
            hm.put(s,hm.getOrDefault(s,0)+1);

        }
        for(String s:str2){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        




        return;

    }


}