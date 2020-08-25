package SDEProblems;

import java.util.*;

public class SubsequenceRemoval {
    public static List<Integer> findSubsequence(List<Integer> arr) {
        // Write your code here
        if(arr.size() < 1){
            List<Integer> ans = new ArrayList<>();
            ans.add(-1);
            return ans;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.size(); i++){
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0)+1);
        }

        Stack<Integer> stack = new Stack<>();

        for(int i=arr.size()-1; i>=0; i--){
            int element = arr.get(i);
            if(map.get(element) > 1){
                if(stack.size()>0){
                    if(stack.peek() >= element){
                        stack.push(element);
                        map.put(element, map.get(element)-1);
                    }
                }
                else {
                    stack.add(element);
                    map.put(element, map.get(element)-1);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (stack.size()>0){
            ans.add(stack.pop());
        }
        boolean flag = true;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                flag = false;
            }
        }

        if(!flag){
            ans.clear();
            ans.add(-1);
        }
        return ans;
    }
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);


        System.out.println(findSubsequence(list).toString());


    }
}
