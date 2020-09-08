package com.company.animals;

public abstract class Animal {
    protected String name;
    static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    abstract public void swim(int distance);

    abstract public void run(int distance);

}
