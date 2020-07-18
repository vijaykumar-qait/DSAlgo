package CodingNinja.OOPS;

public class Polynomial {

    DynamicArray dynamicArray;

    public Polynomial(){
        dynamicArray = new DynamicArray();
    }

    public void setCoefficient(int degree, int coeff){
        dynamicArray.set(degree, coeff);
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        int arr[] = dynamicArray.data;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                System.out.print(arr[i]+"x^"+i + " + ");
            }
        }
        System.out.println();
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial result = new Polynomial();
        int arr[] = p.dynamicArray.data;

        int len = dynamicArray.data.length > arr.length ? arr.length : dynamicArray.data.length;
        int copyArr [] = dynamicArray.data.length > arr.length ? dynamicArray.data : arr;

        for(int i=0; i<copyArr.length; i++){
            result.setCoefficient(i, copyArr[i]);
        }
        for(int i=0; i<len; i++){
            result.setCoefficient(i, dynamicArray.data[i] + arr[i]);
        }
        return result;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial result = new Polynomial();
        int arr[] = p.dynamicArray.data;

        int len = dynamicArray.data.length > arr.length ? arr.length : dynamicArray.data.length;

        int copyArr [] = dynamicArray.data.length > arr.length ? dynamicArray.data : arr;

        for(int i=0; i<copyArr.length; i++){
            result.setCoefficient(i, copyArr[i]);
        }
        for(int i=0; i<len; i++){
            result.setCoefficient(i, dynamicArray.data[i] - arr[i]);
        }
        return result;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial result = new Polynomial();

        int arr1[] = p.dynamicArray.data;
        int arr2[] = dynamicArray.data;

        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length; j++){
                int ans = arr1[i] * arr2[j] + result.dynamicArray.get(i+j);
                result.setCoefficient(i+j, ans);
            }
        }
        return result;
    }

}
