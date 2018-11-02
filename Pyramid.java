// display the following pyramid
import java.lang.Math;

public class Pyramid{
    public static void main(String[] args) {
        for(int row = 0; row < 5; row++){
            System.out.println();

            for(int i = 1; i <= row + 1; i++){
                System.out.print(" " + i);
            }

        }
    }
}