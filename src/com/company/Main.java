package com.company;

import com.company.enums.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        Actions[] members = {
                new Cat(1500, 5),
                new Human(2000, 2),
                new Robot(10000, 1)
        };

        Obstacle[] obstacles = {
                new RunningTrack(1000),
                new Wall(2),
                new RunningTrack(1900),
                new Wall(5)
        };

        for (int j = 0; j < members.length; j++) {
            for (int i = 0; i < obstacles.length; i++) {
                if (obstacles[i].test(members[j])) {
                    System.out.println("Участник под номером " + (j + 1) + " прошел " + (i + 1) + " препятствие");
                } else {
                    System.out.println("Участник под номером " + (j + 1) + " выбыл");
                    break;
                }

            }
        }
    }
}