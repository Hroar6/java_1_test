package com.company;

public class Cat implements Actions {
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
            return true;
//            System.out.println("Кот пробежал");
        } else {
            return false;
//            System.out.println("Кот не смог пробежать");
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            return true;
//            System.out.println("Кот перепрыгнул");
        } else {
            return false;
//            System.out.println("Кот не смог перепргынуть");
        }
    }
}
