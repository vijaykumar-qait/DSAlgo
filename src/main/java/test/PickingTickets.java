package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PickingTickets {
    static int maxTickets(List<Integer> tickets) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tickets.size(); i++){
            map.put(tickets.get(i), map.getOrDefault(tickets.get(i),0)+1);
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<tickets.size(); i++){
            int current = tickets.get(i);
            ArrayList<Integer> list = new ArrayList<>();
            if(map.get(current)>0){

                while ((map.get(current))>0){
                    list.add(current);
                    map.put(current, map.get(current)-1);
                }

                boolean flag1 = true;
                boolean flag2 = true;

                int prev = current-1;
                int next = current+1;

                while(flag1 || flag2){
                    if(map.containsKey(prev)){
                        while ((map.get(prev))>0){
                            list.add(prev);
                            map.put(prev, map.get(prev)-1);
                        }
                        prev--;
                    }
                    else {
                        flag1 = false;
                    }

                    if(map.containsKey(next)){
                        while ((map.get(next))>0){
                            list.add(next);
                            map.put(next, map.get(next)-1);
                        }
                        next++;
                    }
                    else {
                        flag2 = false;
                    }
                }
            }
            if(list.size()>max){
                max = list.size();
            }
        }
        return max;
    }

    public static void main(String [] args){
        //int arr[] = {8,5,4,8,4};
        int arr[] = {4,13,2,3};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }

        System.out.println(maxTickets(list));
    }
}
