package DSAndAlgo;

public class Compressor {

    public  static void main(String [] args) {
        String str = "aa";
        str = str.toLowerCase();

        int arr[] = new int[26];
        for(int i=0; i<str.length(); i++) {
            arr[str.charAt(i)-97]++;
        }

        String newStr = "";

        for(int i=0; i<str.length(); i++) {
            if(!(newStr.contains(""+str.charAt(i)))){
                char chara = str.charAt(i);
                newStr = newStr + chara + arr[chara-97];
            }
        }

        if(newStr.length() > str.length()) {
            System.out.println(str);
        }
        else {
            System.out.println(newStr);
        }


    }
}
