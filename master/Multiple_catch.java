import java.util.Random;

public class Multiple_catch{

    public static void main(String args[]){
      try{
        int a = args.length;
        System.out.println("a = " + a);
        int b = 42 / a;
        int c[] = { 1 };
        c[20] = 99;

        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: ");

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: ");
        }
        
        System.out.println("After try/catch blocks.");
    }
}