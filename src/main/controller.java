package main;


import java.util.Scanner;

public class controller {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        String choice = readUserInput();
        handle(choice);
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

    private static String readUserInput() {
        System.out.print("\nWrite a Letter :\t");
        String choiceInternal = scanner.next();

        return choiceInternal;
    }

    private static void handle(String choice){
        switch (choice){
            case "R" :
                convertFahrenheittoCelsius();
                break;

            case "C" :
                convertCelsiustoFahrenheit ();
                break;

            case "A":
                convertKelvintoCelsius();
                break;

            case "S":
                convertCelsiustoKelvin();
                break;

            case "L":
              break;

            case "W": break;

            case "B":
                break;

            default: {

            }
            break;

        }

    }

    private static int convertFahrenheittoCelsius (){
        System.out.println("What Number of Fahrenheit should we convert? ");
        int a = scanner.nextInt();

        System.out.println(" Celsius: ");
        return (a - 32) *5/9;
    }

    private static double convertCelsiustoFahrenheit (){
        System.out.println("What Number of Celsius should we convert ?");
        double a = scanner.nextDouble();

        System.out.println(" Fahrenheit: ");

        return (a * 1.8) + 32;
    }

    private static double convertKelvintoCelsius (){
        System.out.println("What Number of Kelvin should we convert ?");
        double a = scanner.nextDouble();

        System.out.println(" Celsius: ");

        return (a - 273.15) ;
    }

    private static double convertCelsiustoKelvin (){
        System.out.println("What Number of Celsius should we convert ?");
        double a = scanner.nextDouble();

        System.out.println(" Kelvin: ");

        return (a + 273.15) ;
    }

    private static double euklid (){
        System.out.println("Give us größte Nummer");
        double a = scanner.nextDouble();

        System.out.println("Give us kleinste Nummer");
        double b = scanner.nextDouble();
        double z = Double.parseDouble(null);
        while(z != 0){
           z =  a % b;
           z = b % z;
        }
        return 0;
    }

    // noch die branches zusammenführen
    //xx
}
