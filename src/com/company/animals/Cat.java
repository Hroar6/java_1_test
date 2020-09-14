package com.company.animals;

public class Cat {
    private String name;
    private boolean satiety;
    private int needToSatiety;

    public Cat(String name, int needToSatiety) {
        this.name = name;
        this.satiety = false;
        this.needToSatiety = needToSatiety;
    }

    public void eat(Plate plate) {
        if(plate.getFood() - needToSatiety >= 0) {
//            System.out.println("Cat " + name + " eat...");
            plate.decreaseFood(needToSatiety);
            satiety = true;
        }
    }


    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void fear(Dog dog) {
        System.out.println("Cat " + name + " fear dog " + dog.getName());
    }

}
