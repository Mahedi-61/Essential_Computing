// find the GCD of two numbers with sign.

import java.lang.Math;

public class GCDWithSign{
    public static void main(String[] args) {
        int firstNumber = -81;
        int secondNumber = -153;

        // make all number positive
        //firstNumber = (check_condition) ? true : false;
        firstNumber = (firstNumber < 0) ? -firstNumber : firstNumber;
        secondNumber = (secondNumber < 0) ? -secondNumber : secondNumber;

        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);
        
        int gcd;

        if (firstNumber > secondNumber){
            gcd = firstNumber - secondNumber;

        }else{
            gcd = secondNumber - firstNumber;
        }

        System.out.println("GCD: " + gcd);
    }
}