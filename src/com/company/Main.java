package com.company;

import com.company.animals.*;

public class Main {
    public static void main(String[] args) {


        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Барсик", 10);
        cat[1] = new Cat("Мурзик", 15);
        cat[2] = new Cat("Рыжик", 12);
        cat[3] = new Cat("Вася", 20);
        cat[4] = new Cat("Леопольд", 10);
        Plate plate = new Plate (40);

        for (int i = 0; i< cat.length; i++){
            cat[i].eat(plate);
            if (cat[i].isSatiety()){
                System.out.println("Кот " + cat[i].getName() + " сыт");
            } else {
                System.out.println("Кот " + cat[i].getName() + " голодный");
            }
        }

//        plate.increaseFood(100);
//        System.out.println(plate);

//        cat.eat(plate);
//        Dog dog = new Dog("Tuzik");
//        dog.scare(cat);


    }

}