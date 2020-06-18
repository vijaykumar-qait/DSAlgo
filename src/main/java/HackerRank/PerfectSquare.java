package HackerRank;

public class PerfectSquare {

    public boolean isPerfectSquare(int num) {
        long start=2;
        long end=num/2;

        if(num<2){
            return true;
        }

        while(start<=end){
            long mid = (start +(end-start)/2);
            long sqrt = mid*mid;
            if(sqrt==num){
                return true;
            }
            else if(sqrt<num){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        //2147483647 false
        //1 true
        //808201 true
        //2147395600 true
        //5 false
        System.out.println(new PerfectSquare().isPerfectSquare(2147483647));

    }
}
