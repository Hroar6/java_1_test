package com.company;

import com.company.animals.Animal;
import com.company.animals.Cat;
import com.company.animals.Dog;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");
        Cat cat2 = new Cat("Барсик");
        Dog dog2 = new Dog("Дружок");
        Cat cat3 = new Cat("Леопольд");

        dog.run(100);
//        dog.run(600);
        cat.run(10);
//        cat.run(150);
        dog.swim(10);
//        dog.swim(60);
        cat.swim(0);
//        cat.swim(150);

        System.out.printf("Количество живdотных = %d\nКоличество котов = %d\n" +
                "Количество собак = %d", Animal.getCount(), Cat.getCount(), Dog.getCount());

    }

}