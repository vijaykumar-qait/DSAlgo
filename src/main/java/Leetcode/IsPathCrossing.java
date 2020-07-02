package Leetcode;
import org.omg.CORBA.INTERNAL;

import java.util.*;

public class IsPathCrossing {

    public static boolean isPathCrossing(String path) {
        char pathChar [] = path.toCharArray();

        int pathDir[] = {0,0};

        Map<Integer, int[]> map = new HashMap<>();
        map.put(-1, Arrays.copyOf(pathDir, pathDir.length));

        for(int i=0; i<pathChar.length; i++){
            if(pathChar[i]=='N'){
                pathDir[1]++;
            }
            else if(pathChar[i] == 'S'){
                pathDir[1]--;
            }
            else if(pathChar[i]=='E'){
                pathDir[0]++;
            }
            else if(pathChar[i]=='W'){
                pathDir[0]--;
            }

            for(Map.Entry<Integer, int[]> entry : map.entrySet()){
                int arr[] = entry.getValue();
                if(Arrays.equals(pathDir, arr)){
                    return true;
                }
            }
            map.put(i, Arrays.copyOf(pathDir, pathDir.length));
        }
        return false;
    }

    public static void main(String [] args){
        String str = "NESWW";
        //String str = "NNSWWEWSSESSWENNW";
        System.out.println(isPathCrossing(str));
    }
}
