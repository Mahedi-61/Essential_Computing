// find the standard deviation of a list of numbers
import java.lang.Math;

public class AddMatrices{
    public static void main(String[] args) {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}}; //2x3
        int[][] secondMatrix = {{5, 6, 7}, {3, 4, 5}}; //2x3

        int [][] sum = new int[2][3];
        
        //adding two matrices
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                sum[row][col] = firstMatrix[row][col] + secondMatrix[row][col];
            }
        }

         
        //printing sum matrices
        
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(" " + sum[row][col]);
            }
            System.out.println("");
        }

    }
}