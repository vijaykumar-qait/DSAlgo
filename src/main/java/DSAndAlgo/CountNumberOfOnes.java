package DSAndAlgo;

public class CountNumberOfOnes {

    public static void main(String args[]) {
        int num = 15;

        CountNumberOfOnes obj = new CountNumberOfOnes();
        System.out.println(obj.countOfOnes(num));

    }

    int countOfOnes(int num) {
        int sum=0;
        while(num>0) {
            sum+=num&1;
            num = num>>1;
        }

        return sum;
    }
}
