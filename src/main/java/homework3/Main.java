package homework3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(switchNumber()));
        System.out.println(Arrays.toString(fillingTheArr()));
        System.out.println(Arrays.toString(belowSixMultiplyTwo()));
        System.out.println(Arrays.deepToString(twoDimensionalArray()));
        System.out.println(Arrays.toString((massiv(3, 5))));
        System.out.println(minAndMax());
    }

    public static int[] switchNumber() {
        int[] numbers = {1, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
        }
        return numbers;
    }

    public static int[] fillingTheArr() {
        int[] arrays = new int[100];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i + 1;
        }
        return arrays;
    }

    public static int[] belowSixMultiplyTwo() {
        int[] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 6) {
                arrays[i] *= 2;
            }
        }
        return arrays;
    }

    public static int[][] twoDimensionalArray() {
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }

        }
        return array;
    }

    public static int[] massiv(int len, int initialValue) {
        int[] monoMassiv = new int[len];
        for (int i = 0; i < len; i++) {
            monoMassiv[i] = initialValue;
        }
        return monoMassiv;
    }

    public static String minAndMax() {
        int[] minMaxArr = {3, 4, 5, 10, 6, 5, 35, 17, 2};
        int min = minMaxArr[0];
        int max = minMaxArr[0];
        for (int i = 0; i < minMaxArr.length; i++) {
            if (min > minMaxArr[i]) {
                min = minMaxArr[i];
            }
            if (max < minMaxArr[i]) {
                max = minMaxArr[i];
            }
        }
        return ("Минимальное значение: " + min + ", максимальное значение: " + max);
    }
}




