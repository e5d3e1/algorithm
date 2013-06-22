package org.algoritm.multiply;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 6/20/13
 * Time: 3:19 PM
 */
public class MatrixStrassenMultiply implements IMatrixMultiply {

    @Override
    public int[][] multiplication(int[][] matrix1, int[][] matrix2) {

        if (matrix1.length == 2 && matrix2.length == 2) {
            int a = matrix1[0][0];
            int b = matrix1[0][1];
            int c = matrix1[1][0];
            int d = matrix1[1][1];
            int e = matrix2[0][0];
            int f = matrix2[0][1];
            int g = matrix2[1][0];
            int h = matrix2[1][1];

            int p1 = a * (f - h);
            int p2 = (a + b) * h;
            int p3 = (c + d) * e;
            int p4 = d * (g - e);
            int p5 = (a + d) * (e + h);
            int p6 = (b - d) * (g + h);
            int p7 = (a - c) * (e + f);

            return new int[][]{
                    {p5 + p4 - p2 + p6, p1 + p2},
                    {p3 + p4, p1 + p5 - p3 - p7}
            };
        } else {
            int newLength = matrix1.length / 2;
            int[][] a = new int[newLength][newLength];
            int[][] b = new int[newLength][newLength];
            int[][] c = new int[newLength][newLength];
            int[][] d = new int[newLength][newLength];
            int[][] e = new int[newLength][newLength];
            int[][] f = new int[newLength][newLength];
            int[][] g = new int[newLength][newLength];
            int[][] h = new int[newLength][newLength];

            for (int i = 0; i < newLength; i++) {
                for (int j = 0; j < newLength; j++) {
                    a[i][j] = matrix1[i][j];
                    b[i][j] = matrix1[i][j + newLength];
                    c[i][j] = matrix1[i + newLength][j];
                    d[i][j] = matrix1[i + newLength][j + newLength];
                    e[i][j] = matrix2[i][j];
                    f[i][j] = matrix2[i][j + newLength];
                    g[i][j] = matrix2[i + newLength][j];
                    h[i][j] = matrix2[i + newLength][j + newLength];
                }
            }

            int[][] p1 = multiplication(a, subtract(f, h));
            int[][] p2 = multiplication(add(a, b), h);
            int[][] p3 = multiplication(add(c, d), e);
            int[][] p4 = multiplication(d, subtract(g, e));
            int[][] p5 = multiplication(add(a, b), add(e, h));
            int[][] p6 = multiplication(subtract(b, d), add(g, h));
            int[][] p7 = multiplication(subtract(a, c), add(e, f));

            int[][] Q1 = add(subtract(add(p5, p4), p2), p6);
            int[][] Q2 = add(p1, p2);
            int[][] Q3 = add(p3, p4);
            int[][] Q4 = subtract(subtract(add(p1, p5), p3), p7);
            return union(Q1, Q2, Q3, Q4);
        }
    }

    private int[][] union(int[][] q1, int[][] q2, int[][] q3, int[][] q4) {
        int newLength = q1.length;
        int[][] result = new int[2 * newLength][2 * newLength];
        for (int i = 0; i < newLength; i++) {
            for (int j = 0; j < newLength; j++) {
                result[i][j] = q1[i][j];
                result[i][j + newLength] = q2[i][j];
                result[i + newLength][j] = q3[i][j];
                result[i + newLength][j + newLength] = q4[i][j];
            }
        }
        return result;
    }

    private int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    private int[][] subtract(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
}
