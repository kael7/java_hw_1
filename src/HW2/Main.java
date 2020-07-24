package HW2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArray = new int[5];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10);
        }

        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr1 = {1, 1, 1, 2, 1};
//        invertArray();
//        fillArray();
//        changeArray();
//        fillDiagonal();
//        findMinMaxNumArray();
//        checkBalance(randomArray);
        moveArray(new int[]{1, 2, 3, 4, 5}, 1);
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.printf("%2d", 1);
            } else {
                System.out.printf("%2d", 0);
            }
        }
    }

    public static void fillArray() {
        int[] arr = new int[8];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n * 3;
            n = n + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }
        System.out.println(Arrays.toString(w));
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void findMinMaxNumArray() {
        int[] arr = {4, 6, 1, 8, 3, 5, 9, 20, 0, 31, -1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(min);
        System.out.println(max);
    }

    // 2, 2, 2, 1, 2, 2, 10, 1
    public static void checkBalance(int[] arr) {
        int sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
        }
        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sumLeft += arr[i - 1];
        }
        sumRight = sumTotal - sumLeft;
        if (sumRight == sumLeft) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum Left: " + sumLeft);
        System.out.println("Sum Right: " + sumRight);
        System.out.println("Sum Total: " + sumTotal);

    }

    public static void moveArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int value = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = value;
        }
        System.out.println(Arrays.toString(arr));
    }


}


