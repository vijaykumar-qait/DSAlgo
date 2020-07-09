package CodingNinja;

public class MinimunCount {

//    public static int minCount(int n, int i){
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        if(i*i <= n){
//            int smallAns = 1 + minCount(n-i*i, i);
//            return smallAns;
//        }
//        return minCount(n , i-1);
//    }

    public static int minCount(int n){
        //base case
        if(n<=3){
            return  n;
        }

        int res = n;
        for(int x=1; x<=n; x++){
            int temp = x*x;
            if(temp>n){
                break;
            }
            else {
                res = Math.min(res, 1 + minCount(n-temp));
            }
        }
        return res;
    }

    public static void main(String [] args){
        int num = 12;
        System.out.println(minCount(num));
    }
}
