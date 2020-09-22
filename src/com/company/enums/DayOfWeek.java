package com.company.enums;

public enum DayOfWeek {
    Monday(0), Tuesday(8), Wensday(8), Thursday(7), Friday(4), Saturday(8), Sunday(0);

    private int workHours;

    DayOfWeek(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getWorkingHours(DayOfWeek dayOfWeek){
        int result = 0;
        if (dayOfWeek.getWorkHours() == 0){
            System.out.println("Сегодня выходной");
        }
        for (int i = dayOfWeek.ordinal(); i < DayOfWeek.values().length; i++) {
            result++;
        }
        return result;
    }
}
