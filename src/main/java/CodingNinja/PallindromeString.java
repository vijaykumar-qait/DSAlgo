package CodingNinja;

public class PallindromeString {

    public static boolean isPallindrome(String str){
        StringBuilder revStr = new StringBuilder(str);
        revStr.reverse();
        return revStr.toString().equalsIgnoreCase(str)?true:false;
    }

//    public static int countPalindromeSubstrings(String str) {
//        // Write your code here
//        int count = 0;
//        for(int i=0; i<str.length(); i++){
//            for(int j=i+1; j<=str.length(); j++){
//                if(isPallindrome(str.substring(i,j))){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }


    public static int countPalindromeSubstrings(String str) {
        // Write your code here
        int count = 0;
        for(int i=0; i<str.length(); i++){
            count++;
            int mid = i;
            int left = mid-1;
            int right = mid+1;

            while(left>=0 && right<str.length()){
                if(str.charAt(left)==str.charAt(right)){
                    count++;
                    left--;
                    right++;
                }
                else {
                    break;
                }
            }

            if(!(mid+1 == str.length())){
                if(str.charAt(mid)==str.charAt(mid+1)){
                    count++;

                    left = mid-1;
                    right = mid+2;
                    while(left>=0 && right<str.length()){
                        if(str.charAt(left)==str.charAt(right)){
                            count++;
                            left--;
                            right++;
                        }
                        else{
                            break;
                        }
                    }

                }
            }
        }
        return count;
    }


    public static void main(String [] args){
        String str = "aba";
        System.out.println(countPalindromeSubstrings(str));
    }
}
