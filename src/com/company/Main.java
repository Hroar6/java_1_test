package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 3;
    static final int DOT_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили! Поздравляем!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил.");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("input X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x;
        int y;
        //  boolean turnDone = false;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // Смотрит можно ли победить
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        return;
                    } else {
                        map[i][j] = DOT_EMPTY;
                    }
                }
                // Смотрит может ли победить противник
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j] = DOT_O;
                        //                turnDone = true;
                        return;
                    } else {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (chekX(i, j, c) || chekY(i, j, c) || chekDiagonal1(i, j, c) || chekDiagonal2(i, j, c)) {
                    return true;
                }
            }
        }
       /* if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {return true; }
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {return true; }
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {return true; }

        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {return true; }
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {return true; }
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {return true; }

        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {return true; }
        if (map[0][2] == c && map[1][1] == c && map[2][0] == c) {return true; }*/

        return false;
    }

    static boolean chekY(int i, int j, char c) {
        if (j + DOT_TO_WIN - 1 < SIZE) {
            for (int k = j; k < j + DOT_TO_WIN; k++) {
                if (map[i][k] != c) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static boolean chekX(int i, int j, char c) {
        if (i + DOT_TO_WIN - 1 < SIZE) {
            for (int k = i; k < i + DOT_TO_WIN; k++) {
                if (map[k][j] != c) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static boolean chekDiagonal1(int i, int j, char c) {
        int l = j;
        if (i + DOT_TO_WIN - 1 < SIZE && j + DOT_TO_WIN - 1 < SIZE) {
            for (int k = i; k < i + DOT_TO_WIN; k++) {
                if (map[k][l] != c) {
                    return false;
                }
                l++;
            }
            return true;
        }
        return false;
    }

    static boolean chekDiagonal2(int i, int j, char c) {
        int l = j;
        if (i - DOT_TO_WIN + 1 >= 0 && j + DOT_TO_WIN - 1 < SIZE) {
            for (int k = i; k > i - DOT_TO_WIN; k--) {
                if (map[k][l] != c) {
                    return false;
                }
                l++;
            }
            return true;
        }
        return false;
    }
}
