package com.company;

public class Personal {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Personal(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.printf("Имя: %s Должность: %s email: %s Номер телефона: #%s Зарплата: %d, Возраст %d \n",name, position, email, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }
}
