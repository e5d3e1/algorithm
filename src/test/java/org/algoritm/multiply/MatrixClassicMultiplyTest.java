package org.algoritm.multiply;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created with IntelliJ IDEA.
 * Ostapets Vitaliy
 * luxoft ukraine
 * Member of the IBS Group
 * Date: 4/18/13
 * Time: 9:32 AM
 */
public class MatrixClassicMultiplyTest {

    @Test
    public void testMultiply() {
        IMatrixMultiply multiply = new MatrixClassicMultiply();
        int[][] a = {
                {1, 2},
                {3, 4}
        };
        int[][] b = {
                {5, 6},
                {7, 8}
        };
        int[][] result = {
                {19, 22},
                {43, 50}
        };
        int[][] multiplication = multiply.multiplication(a, b);
        assertNotNull(multiplication);
        assertArrayEquals(result, multiplication);
    }
    @Test

    public void testBigMultiply() {
        IMatrixMultiply multiply = new MatrixClassicMultiply();
        int[][] a = {
                { 1,  2,  3,  4,  5,  6,  7,  8,  9},
                {10, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 42, 43, 44, 45, 46, 47, 48, 49},
                {50, 52, 53, 54, 55, 56, 57, 58, 59},
                {60, 62, 63, 64, 65, 66, 67, 68, 69},
                {70, 72, 73, 74, 75, 76, 77, 78, 79},
                {80, 82, 83, 84, 85, 86, 87, 88, 89},
        };
        int[][] b = {
                { 2401,  2490,  2535,  2580,  2625,  2670,  2715,  2760,  2805},
                { 6010,  6268,  6402,  6536,  6670,  6804,  6938,  7072,  7206},
                { 9620, 10048, 10272, 10496, 10720, 10944, 11168, 11392, 11616},
                {13230, 13828, 14142, 14456, 14770, 15084, 15398, 15712, 16026},
                {16840, 17608, 18012, 18416, 18820, 19224, 19628, 20032, 20436},
                {20450, 21388, 21882, 22376, 22870, 23364, 23858, 24352, 24846},
                {24060, 25168, 25752, 26336, 26920, 27504, 28088, 28672, 29256},
                {27670, 28948, 29622, 30296, 30970, 31644, 32318, 32992, 33666},
                {31280, 32728, 33492, 34256, 35020, 35784, 36548, 37312, 38076},
        };
        int[][] result = {
                {  974401,  1019162,  1042743,  1066324,  1089905,  1113486,  1137067,  1160648,  1184229},
                { 2487610,  2601412,  2661318,  2721224,  2781130,  2841036,  2900942,  2960848,  3020754},
                { 4003220,  4186152,  4282428,  4378704,  4474980,  4571256,  4667532,  4763808,  4860084},
                { 5518830,  5770892,  5903538,  6036184,  6168830,  6301476,  6434122,  6566768,  6699414},
                { 7034440,  7355632,  7524648,  7693664,  7862680,  8031696,  8200712,  8369728,  8538744},
                { 8550050,  8940372,  9145758,  9351144,  9556530,  9761916,  9967302, 10172688, 10378074},
                {10065660, 10525112, 10766868, 11008624, 11250380, 11492136, 11733892, 11975648, 12217404},
                {11581270, 12109852, 12387978, 12666104, 12944230, 13222356, 13500482, 13778608, 14056734},
                {13096880, 13694592, 14009088, 14323584, 14638080, 14952576, 15267072, 15581568, 15896064},
        };
        int[][] multiplication = multiply.multiplication(a, b);
        assertNotNull(multiplication);
        assertArrayEquals(result, multiplication);
    }

    public void toStringArray(int[][] multiplication) {
        for (int[] ints : multiplication) {
            System.out.print("{");
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println("},");
        }
    }
}
