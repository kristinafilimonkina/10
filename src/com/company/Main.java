package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше предложение:");
        String words = scan.nextLine();
        String[] transwords = words.split("[\\d\\s]+");
        System.out.print("Кол-во слов: " + transwords.length);



    }
}