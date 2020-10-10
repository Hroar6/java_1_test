package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        method1();
        method2();
    }

    public static void method1() {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];

        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
//        System.out.println("Время создания массива 1 метода = " + a);
        System.out.println("Время выполнения цикла 1 метода = " + (System.currentTimeMillis() - a));

    }

    public static void method2() {
        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];

        Arrays.fill(arr, 1);
        long time1 = System.currentTimeMillis();

//        System.out.println("time1 = " + time1);

        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        long time2 = System.currentTimeMillis() - time1;
        System.out.println("Время разбивания массива на 2 = " + time2);


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//                    System.out.println("a1[" + i + "] = " + a1[i]);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + (i + HALF) / 5) * Math.cos(0.2f + (i + HALF) / 5) * Math.cos(0.4f + (i + HALF) / 2));
//                    System.out.println("a2[" + i + "] = " + a2[i]);
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long time3 = System.currentTimeMillis() - time1 - time2;
        System.out.println("Время выполнения 2 потоков = " + time3);


        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);

        System.out.println("Время склейки 2 массивов = " + (System.currentTimeMillis() - time1 - time2 - time3));


    }
}