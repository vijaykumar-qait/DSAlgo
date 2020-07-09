package CodingNinja;

public class PrintWellFormedParanthesis {

        public static void printWellFormedParanthesis(char [] str, int pos, int n, int open , int close){
            if(close == n){
                for(int i=0; i<str.length; i++){
                    System.out.print(str[i]);
                }
                System.out.println();
                return;
            }
            else {
                if(open>close){
                    str[pos] = ')';
                    printWellFormedParanthesis(str, pos+1, n, open, close+1);
                }
                if(open<n){
                    str[pos] = '(';
                    printWellFormedParanthesis(str, pos+1, n, open+1, close);
                }
            }
        }


        public static void printWellFormedParanthesis(char [] str, int n){
            if(n>0){
                printWellFormedParanthesis(str, 0, n, 0,0);
            }
            return;
        }

    public static void printWellFormedParanthesis( int n){
        char str[] = new char[2*n];
        printWellFormedParanthesis(str, n);

    }

    public static void main(String [] args){
        int num = 3;
        printWellFormedParanthesis(num);
    }
}
