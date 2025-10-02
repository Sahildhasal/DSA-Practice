package MultiDimensionalArrays;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        System.out.println("Enter your matrix rows and column values");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] userMatrix = new int[rows][columns];

        System.out.println("Enter your matrix values now");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                userMatrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your Matrix is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }        
    }
}
