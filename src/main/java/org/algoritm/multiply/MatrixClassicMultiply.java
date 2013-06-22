package org.algoritm.multiply;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/18/13
 * Time: 9:07 AM
 */
public class MatrixClassicMultiply implements IMatrixMultiply {

    @Override
    public int[][] multiplication(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b.length];
        int length = result.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int multiply = 0;
                for (int k = 0; k < length; k++) {
                    int temp = a[i][k] * b[k][j];
                    multiply += temp;
                }
                result[i][j] = multiply;
            }
        }
        return result;
    }
}
