// Adding two complex number

public class ComplexNumber{
    //variables
    double real, img;

    ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;
    }


    static ComplexNumber addTwoComplexNumber(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber sum = new ComplexNumber(0, 0);
        sum.real = c1.real + c2.real;
        sum.img = c1.img + c2.img;
        return sum;
    }


    public static void main(String[] args) {
        ComplexNumber c1 =  new ComplexNumber(5, 6);
        ComplexNumber c2 = new ComplexNumber(1, 3);

        ComplexNumber temp = addTwoComplexNumber(c1 , c2);

        System.out.printf("Sum: %.1f + i %.1f", temp.real, temp.img);
        System.out.println();
    }
}
