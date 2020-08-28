package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //1
        int b;
        boolean win = false;
        do {
            int randomNum = random.nextInt(10);
            int userNum;
            System.out.println("Input number");
            for (int i = 0; i < 3; i++) {
                userNum = sc.nextInt();
                if (userNum > randomNum) {
                    System.out.println("Number is lower.");
                } else if (userNum < randomNum) {
                    System.out.println("Number is bigger");
                } else {
                    System.out.println("Congratulations. it was " + (i + 1) + " try");
                    win = true;
                    break;
                }
            }
            if (win) {
                System.out.println("You win :)");
            } else {
                System.out.println("You Lose :( It was " + randomNum);
            }
            System.out.println("print 0 if you want to stop");
            b = sc.nextInt();
        } while (b !=0);

        //2
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String randomWord;
        randomWord = words[random.nextInt(25)];
        char[] prompt = new char[15];
        for (int i = 0; i<prompt.length; i++){
            prompt[i] = '#';
        }
        System.out.println("Input word");
        String userWord;
        do {
            userWord = sc.nextLine();
            int min = Math.min(userWord.length(), randomWord.length());
            for (int i = 0; i < min; i++){
                if(userWord.charAt(i) == randomWord.charAt(i)){
                    prompt[i] = userWord.charAt(i);
                }
            }
            if (!userWord.equals(randomWord)) {
                System.out.println(prompt);
            }
        } while (!userWord.equals(randomWord));
        System.out.println("You win");

    }
}