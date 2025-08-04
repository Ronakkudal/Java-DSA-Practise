import java.util.*;
public class shortestPath {
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
        char dir =path.charAt(i);
        if(dir=='S'){
            y++;

        }
        if(dir=='N'){
            y++;
        }
        if(dir=='W'){
            x--;
        }
        if(dir=='E'){
            x++;
        }
       
      


    }
    int x2=x*x;
    int y2=y*y;

    return(float)Math.sqrt(x2+y2);
    }
    public static void main (String args[]){
        String path="WNEENESENNA";
        System.out.println(getShortestPath(path));

    }
    
}
