package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yearOfBirth, zodiacNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type your year of birth :");
        yearOfBirth = input.nextInt();
        String chineseZodiac = "";
        switch (yearOfBirth % 12) {
            case 1:
                chineseZodiac = "Chicken";
                break;
            case 2:
                chineseZodiac = "Dog";
                break;
            case 3:
                chineseZodiac = "Pig";
                break;
            case 4:
                chineseZodiac = "Mouse";
                break;
            case 5:
                chineseZodiac = "Ox";
                break;
            case 6:
                chineseZodiac = "Tiger";
                break;
            case 7:
                chineseZodiac = "Rabbit";
                break;
            case 8:
                chineseZodiac = "Dragon";
                break;
            case 9:
                chineseZodiac = "Snake";
                break;
            case 10:
                chineseZodiac = "Horse";
                break;
            case 11:
                chineseZodiac = "Sheep";
                break;
            default:
                break;
        }

        System.out.print("Your chinese zodiac is " + chineseZodiac);
    }
}
