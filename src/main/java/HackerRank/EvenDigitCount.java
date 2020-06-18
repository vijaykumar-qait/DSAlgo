package HackerRank;

public class EvenDigitCount {
    static int digitCount(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println("count: "+ count);
        return count;
    }

    public static  void main(String [] args){
        int nums[]= {0};

        int evencount = 0;
        for(int i=0; i<nums.length; i++){
            int digiCount = digitCount(nums[i]);
            if(digiCount%2==0 && digiCount!=0){
                evencount++;
            }
        }
        System.out.println("evencount" + evencount);
    }
}
