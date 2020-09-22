package com.company.enums;

public class DayOfWeekMain {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.Monday;
//        System.out.println(thursday.compareTo(DayOfWeek.Sunday));
//        System.out.println(DayOfWeek.);

        System.out.println("Оставшееся количество рабочих часов = " + getWorkingHours(monday));
    }

    public static int getWorkingHours(DayOfWeek dayOfWeek){
        int result = 0;
        if (dayOfWeek.getWorkHours() == 0){
            System.out.println("Сегодня выходной");
        }
        for (DayOfWeek j:DayOfWeek.values()) {
            if (j.ordinal()>=dayOfWeek.ordinal()){
                result+= j.getWorkHours();
            }
        }
        return result;
    }

}

