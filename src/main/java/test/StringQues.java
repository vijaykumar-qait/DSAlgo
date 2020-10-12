package test;

import java.util.ArrayList;

public class StringQues {
    static String [] printWordWise(String str){
        ArrayList<String> list = new ArrayList<>();

        while (str.length()>0){
            str = str.trim();
            int tempIndex = str.indexOf("\"");
            String tempStr = "";
            if(tempIndex > 0){
                tempStr = str.substring(0, tempIndex);
            }
            else {
                tempStr = str;
            }

            String tempArr[] = tempStr.split(" ");
            for(int i=0; i<tempArr.length; i++){
                list.add(tempArr[i]);
                System.out.println(tempArr[i]);
            }
            if(tempIndex < 0){
                break;
            }
            str = str.substring(tempIndex+1, str.length());
            str = str.trim();
            tempIndex = 0;
            int nextTemp = str.indexOf("\"");
            if(nextTemp > 0){
                tempStr = str.substring(tempIndex, nextTemp);
                list.add("\""+tempStr+"\"");
                System.out.println("\""+tempStr+"\"");

                str = str.substring(nextTemp+1, str.length());
                str = str.trim();
            }
        }
        String [] strArr = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            strArr[i] = list.get(i);
        }
        return strArr;
    }
    public static void main(String [] args){
        String str = "xyz abc mnp \"asdf dfaa asdf\" asd \"fdas asdsdafF";
        String [] strArr = printWordWise(str);
        System.out.println();
        for(int i=0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
}
