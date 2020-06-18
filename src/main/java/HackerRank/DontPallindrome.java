package HackerRank;

import java.util.Scanner;

public class DontPallindrome {

    static boolean  checkPallindrome(String str2){
        StringBuilder newStr = new StringBuilder(str2);
        return newStr.reverse().toString().equals(str2) ? true : false;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean flag = true;

        if(str.length()==1){
            System.out.println("IMPOSSIBLE");
            return;
        }

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!='a' && i!=0){
                String newStr = str.substring(0,i) + "a" + str.substring(i+1, str.length());
                if(str.compareTo(newStr)>0){
                    if(!checkPallindrome(newStr)){
                        System.out.println(newStr);
                        flag =false;
                        break;
                    }
                }
            }
            else if(str.charAt(i)!='a' && i==0){
                String newStr = "a" + str.substring(1, str.length());
                if(str.compareTo(newStr)>0){
                    if(!checkPallindrome(newStr)) {
                        System.out.println(newStr);
                        flag=false;
                        break;
                    }
                }
            }
        }
        if(flag && str.length()>0){
            System.out.println("IMPOSSIBLE");
        }
    }
}
