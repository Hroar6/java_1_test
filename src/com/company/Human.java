package com.company;

public class Human implements Actions {
    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
            return true;
//            System.out.println("Человек пробежал");
        } else {
            return false;
//            System.out.println("Человек не смог пробежать");
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump){
            return true;
//            System.out.println("Человек перепрыгнул");
        } else {
            return false;
//            System.out.println("Человек не смог перепргынуть");
        }
    }
}
