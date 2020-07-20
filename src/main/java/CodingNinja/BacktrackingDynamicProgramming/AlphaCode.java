package CodingNinja.BacktrackingDynamicProgramming;

public class AlphaCode {

    static void alphaCode(String str , String output){
        if(str.length() == 0){
            System.out.println(output);
            return;
        }

        alphaCode(str.substring(1), output+(char)(str.charAt(0)+48));

        if(str.length()>1){
            int code = (str.charAt(0)-48)*10 + str.charAt(1)-48;
            if(code <= 26){
                alphaCode(str.substring(2), output+(char)(code + 96));
            }
        }
    }

    static void alphaCode(String str){
        alphaCode(str, "");
    }

    public static void main(String [] args){
        String code = "301";
        alphaCode(code);
//        int code = '2'-48;
//        System.out.println(code);
    }
}
