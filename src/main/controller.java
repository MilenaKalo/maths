package main;


import java.util.Scanner;

public class controller {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {

        String menuItems[] = {"",
                "R\t convert Fahrenheit to Celsius",
                "C\t convert Celsius to Fahrenheit",
                "A\t convert Kelvin in Celsius",
                "S\t convert Celsius in Kelvin",
                "L\t euklidischer Algorithmus",
                "W\t something",
                "B\t <B>eenden"};

        System.out.println("\n----------- some Maths for you -----------\n");

        System.out.println("\nWhat do you want to do ...\n");

        for (int i = 1; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }

    }
    public static void handle(String choice){

    }
}
