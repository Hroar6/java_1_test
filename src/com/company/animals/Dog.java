package com.company.animals;

public class Dog extends Animal {
    private final int maxRun = 500;
    private final int maxSwim = 10;
    private static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " метров");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
        }
    }
}
