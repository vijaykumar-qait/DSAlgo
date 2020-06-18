package CodingNinja;

public class Pallindrome {
    public static void main(String args[]){;
        String str = "";
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");
    }
}
