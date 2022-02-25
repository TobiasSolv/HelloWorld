package demo;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World.");
        // System.out.println("Hello Dat22v1");
        System.out.println();

        if (1 == 1) {
            // System.out.println("one is equal to one");
        }
        //erklæret en scanner (aka tastaturet)
        Scanner scanner = new Scanner(System.in);
        int number = 2; //initialiseret med værdien -1

        //loop
        // != betyder "forskellig fra"
        while (number != 5) {


            //beder bruger indtaste et tal
            System.out.print("Enter a number:");

            // Indlæs tal fra tastaturet
            number = scanner.nextInt();


            //erklære variabel med datetype og variabelnavn

            if (number > 5) {
                System.out.println("Number is greater than five");
            } else {
                System.out.println("Number is less than five");
            }
        }
    }
}
