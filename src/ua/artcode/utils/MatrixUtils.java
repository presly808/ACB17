package ua.artcode.utils;

/**
 * Created by serhii on 09.07.16.
 */
public class MatrixUtils {
    public static int[][] generate(int rowCount, int columnCount,
                                   int leftRange, int rightRange) {
        int[][] matrix = new int[rowCount][columnCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ArrayUtils.generateRandomNum(leftRange,rightRange);
            }
        }

        return matrix;
    }

    public static String toString(int[][] matrix) {
        // create string empty variable
        String res = "";
        // iterate over matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                // append each element into String variable
                res += matrix[i][j] + "\t";
            }
            res += "\n";
        }
        // return string variable
        return res;
    }
}
