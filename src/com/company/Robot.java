package com.company;

public class Robot implements Actions {
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
            return true;
//            System.out.println("Робот пробежал");
        } else {
            return false;
//            System.out.println("Робот не смог пробежать");
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            return true;
//            System.out.println("Робот перепрыгнул");
        } else {
            return false;
//            System.out.println("Робот не смог перепргынуть");
        }
    }
}
