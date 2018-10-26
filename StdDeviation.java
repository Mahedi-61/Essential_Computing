// find the standard deviation of a list of numbers
import java.lang.Math;

public class StdDeviation{
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double std = getStdDeviation(numbers);
        System.out.println("Standard deviation: " + std);

    }

    // method for calculating std deviation
    public static double getStdDeviation(double[] numbers){
        double l = numbers.length;
        double sum = 0, var = 0, std = 0;

        for(double i: numbers){
            sum += i;
        }

        double mean = sum / l;
        System.out.println("Mean: " + mean);


        for(double i: numbers){
            var += Math.pow((i - mean), 2);
        }

        std = Math.sqrt(var / l);
        return std;
    }
}