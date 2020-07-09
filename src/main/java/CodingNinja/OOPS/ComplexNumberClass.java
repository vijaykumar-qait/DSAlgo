package CodingNinja.OOPS;

public class ComplexNumberClass {

    private int real;
    private int imaginary;

    public ComplexNumberClass(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumberClass obj){
        this.real = this.real + obj.real;
        this.imaginary = this.imaginary + obj.imaginary;
    }

    public void multiply(ComplexNumberClass obj){
        int real1 = this.real*obj.real + this.imaginary*obj.imaginary*-1;
        int imaginary1 = this.real*obj.imaginary + this.imaginary*obj.real;

        this.real = real1;
        this.imaginary = imaginary1;
    }

    public void print(){
        System.out.println(real + " + i" + imaginary);
    }

    public static void main(String [] args){


        int real1 =4;
        int imaginary1 =5;

        int real2 =6;
        int imaginary2 =7;

        ComplexNumberClass c1 = new ComplexNumberClass(real1, imaginary1);
        ComplexNumberClass c2 = new ComplexNumberClass(real2, imaginary2);

        int choice = 2;

        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }
    }
}
