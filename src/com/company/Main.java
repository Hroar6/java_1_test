package com.company;

public class Main {
    public static void main(String[] args) {
        String[][] w = {
                {"5", "3", "1", "1"},
                {"3", "3", "2", "1"},
                {"6", "0", "2", "1"},
                {"2", "10", "3", "5"}
        };

        try {
            System.out.println(arrCheckSize(w));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    static int arrCheckSize(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        int arrLength = 4;
        if (arr.length != arrLength) {
            throw new MyArraySizeException("Количество строк не равно " + arrLength);
        }
        for (int i = 0; i < arrLength; i++) {
            if (arr[i].length != arrLength) {
                throw new MyArraySizeException("Количество столбов в " + i + " строке не равено " + arrLength);
            }
        }
//        System.out.println("Массив прошел проверочку");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не возможно преобразовать [" + i + "][" + j + "] элемент");
                }
            }
        }
        return sum;
    }
}