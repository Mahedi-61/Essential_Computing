// finding leapYear of a given year
import java.lang.Math;

public class BinaryToDecimal{

    public static void main(String[] args){
        int binaryNum = 10011;
        int num = binaryNum;
        int remainder = 0;
        int twoPow = 0, decimalNumber = 0;

        while(num !=0 ){
            remainder = num % 10; // 1

            decimalNumber += remainder * Math.pow(2, twoPow); //1+2
            twoPow++;
            num = num / 10; 
        }

        System.out.println("Binary Number: " + decimalNumber);
    }
}
