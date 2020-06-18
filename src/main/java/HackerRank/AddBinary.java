package HackerRank;

public class AddBinary {

    public String addBinary(String a, String b) {
        char arrA[] = a.toCharArray();
        char arrB[] = b.toCharArray();

        int i=a.length()-1, j=b.length()-1, rem=0;
        StringBuilder str = new StringBuilder();
        while(i>=0 && j>=0){
            int sum = Integer.parseInt(""+arrA[i--]) + Integer.parseInt(""+arrB[j--]);
            if(sum==2){
                if(rem==1){
                    str.append("1");
                    rem=1;
                }
                else {
                    str.append("0");
                    rem=1;
                }
            }
            else {
                if(rem==1){
                    if(sum+rem==2){
                        str.append("0");
                        rem=1;
                    }else {
                        str.append(sum+rem);
                        rem=0;

                    }
                }
                else {
                    str.append(sum);
                }
            }
        }
        while(i>=0){
            int sum = Integer.parseInt(""+arrA[i--])+rem;
            if(sum==2){
                str.append(0);
                rem=1;
            }
            else {
                str.append(sum);
                rem=0;
            }
        }

        while(j>=0){
            int sum = Integer.parseInt(""+arrB[j--])+rem;
            if(sum==2){
                str.append(0);
                rem=1;
            }
            else {
                str.append(sum);
                rem=0;
            }
        }
        if(rem!=0){
            str.append(rem);
        }

        return str.reverse().toString();
    }


    public String addBinary2(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i--)-'0';

            }
            if(j>=0){
                sum+=b.charAt(j--)-'0';
            }

            sb.append(sum%2);
            carry=sum/2;
        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main (String [] args){
        //String a = "1010";
        //String b = "1011";

        //String a = "1000";
        //String b = "";

        String a = "110010";
        String b = "10111";

        System.out.println(new AddBinary().addBinary2(a,b));
    }
}
