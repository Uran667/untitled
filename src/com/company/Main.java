package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ageOfMyFamily;
        final int NUM = 15;
        String word = "Dog";
        ageOfMyFamily = NUM + word;
        System.out.println(ageOfMyFamily);
        if(NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");}
        else if(NUM > 0) {
            System.out.println("Вы сохранили положительное число");}
        else {
            System.out.println("Вы сохранили нуль");}
    }
}
