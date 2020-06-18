package DSAndAlgo;


public class QuestoinMarkCount {

    public static boolean matchSumQuestionMark(char arr[], int index1, int index2, int sum, int questionMarkCount){
        boolean flag = false;

        int num1 = Character.getNumericValue(arr[index1]);
        int num2 = Character.getNumericValue(arr[index2]);

        int sumTotal = num1 + num2;
        int count = 0;

        for(int i=index1; i<=index2; i++){
            if(arr[i] == '?') {
                count++;
            }
        }

        if(sumTotal == sum && count == questionMarkCount){
            flag = true;
        }

        return flag;
    }

    public static void main(String args[]){
        String str = "?def?1ab?gh?9?6ab?4?ab5?b??c5";
        char [] strArr = str.toCharArray();

        int indexArr[] = new int[6];
        int count = 0;

        for(int i=0; i<strArr.length; i++) {
            if(strArr[i] >= 48 && strArr[i]<=57){
                indexArr[count++] = i;
            }
        }

        boolean flag = false;

        for(int i=0; i<indexArr.length-1; i++){
            if(matchSumQuestionMark(strArr, indexArr[i], indexArr[i+1], 10, 3)) {
                flag = true;
                break;
            }
        }

        if(flag) {
            System.out.print("Sum exist and question count exist");
        }
        else {
            System.out.print("Does not exist");
        }

    }
}
