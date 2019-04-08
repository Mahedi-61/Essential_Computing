// find whether the GCD of two different integers 
//81, 27

public class GCD{

    public static void main(String[] args){
        int firstNum = 100;
        int secondNum = 90;
        int gcd = 1;

        for (int i = 1; i <= firstNum && i <= secondNum ; i++){

            if((firstNum % i == 0) && (secondNum % i == 0)){
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }
}