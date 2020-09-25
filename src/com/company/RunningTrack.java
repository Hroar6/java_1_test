package com.company;

public class RunningTrack implements Obstacle{
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean test(Actions i) {
        return i.run(length);
    }
}
