package com.company;

public class Main {

    public static void main(String[] args) {
        Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Богдан Богданов", "Уборщик", "bogdan@gmail.com", "89459333345", 5000, 22);
        persArray[1] = new Personal("Владислав", "Управляющий", "vlad1k@gmail.com", "89169114348", 200000, 50);
        persArray[2] = new Personal("Илья", "Программист", "Ilya@gmail.com", "89909332341", 100000, 22);
        persArray[3] = new Personal("Кирилл", "Инженер", "Kirill@gmail.com", "89999332342", 50000, 41);
        persArray[4] = new Personal("Даниил", "Грузчик", "Danya@yandex.ru", "85559332343", 15000, 42);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].info();
            }
        }
    }
}