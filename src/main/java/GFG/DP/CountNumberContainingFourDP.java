package GFG.DP;


public class CountNumberContainingFourDP {
    static int numberOfDigit(int num, int digit){
        int count = 0;
        while(num>0){
//            count+=num%10==digit?1:0;
            if(num%10==4){
                return 1;
            }
            num/=10;
        }
        return count;
    }

    static int countFour(int num, int digit){
        if(num<4){
            return 0;
        }
        int dp[]= new int[num+1];
        dp[4]=1;
        for(int i=5; i<=num; i++){
            int countDigit = numberOfDigit(i, digit);
            dp[i] = dp[i-1] + countDigit;
        }
        return dp[num];
    }

    public static void main(String [] args){
        int num = 44;
        int digit = 4;
        System.out.println(countFour(num, digit));

//        Scanner scanner = new Scanner(System.in);
//        int testcase = scanner.nextInt();
//        for(int i=0; i<testcase; i++){
//            int num = scanner.nextInt();
//            System.out.println(countFour(num, 4));;
//        }
    }
}
