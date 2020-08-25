package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));

        //2
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

        //3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        //4
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
        }
        printArr2d(arr4);


        //5
        int[] arr5 = {4, 23, 10, 7, 41};
        System.out.println("min = " + minArr(arr5));
        System.out.println("max = " + maxArr(arr5));

        //6
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 14};
        System.out.println(sumPartArr(arr6));
        System.out.println(Arrays.toString(arr6));

        //7
        System.out.println(Arrays.toString(shiftArr(arr6, 9)));
        //  System.out.println(-1%5);

    }

    // Вывод 2-мерного массива
    static void printArr2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    static int minArr(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //6
    static boolean sumPartArr(int[] arr) {
        int leftSide = arr[0];
        int rightSide = arr[arr.length - 1];
        int k; // индекс для rightSide
        k = arr.length - 1; //
        for (int i = 1; i < k; i++) {
            if (leftSide < rightSide) {
                leftSide += arr[i];
            } else {
                rightSide += arr[k - 1];
                k--;
                i--;
            }
        }
        return leftSide == rightSide;
    }

    //7
    static int[] shiftArr(int[] arr, int n) {
        int length = arr.length;
        n = n % length;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                int last = arr[length - 1];
                for (int j = length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
        } else {
            n = -n;
            for (int i = 0; i < n; i++) {
                int first = arr[0];
                for (int j = 0; j < length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[length - 1] = first;
            }
        }
        return arr;
    }

}