package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 127;
        short s = 1245;
        int i = 1234;
        long l = 1245235;
        float f = 12.5f;
        double d = 12.95423;
        char c = 'а';
        String str = "hello world";
        boolean isEven = false;
        System.out.println(b +" " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + str + " " + isEven);
        System.out.println(exp(100,7, 14, 2));
        System.out.println(isSum(10, 10));
        isPositive(-12);
        System.out.println(isNegative(-1));
        hello("Рома");
    /*    for (i = 1; i< 2025; i++) {
            leapYear(i);
        }*/
        leapYear(2020);
    }

    static int exp(int a, int b, int c, int d) {
        return a*(b + (c/d));
    }

    static boolean isSum (int a, int b){
        return a+b>=10 && a+b<=20;
    }

    static void isPositive(int a){
        if (a >= 0){
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    static boolean isNegative(int a){
        return a < 0;
    }

    static void hello(String name){
        System.out.println("Привет, " + name);
    }

    static void leapYear(int a){
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год високосный");
        } else{
            System.out.println(a + " год не високосный");
        }
    }

}