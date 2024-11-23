package bot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleBot {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2023.");

        userName();
        guessAge();
        countNumbers();
        SimpleQuiz.quiz();
    }


    static void userName() {
        System.out.println("Please, remind me your name.");
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static int readInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    static void countNumbers() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = readInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
    }
}

class SimpleQuiz {
    static void quiz() {
        System.out.println("Let's take an easy test! ");
        System.out.println("""
                What is the chemical symbol for water?
                1. CO2
                2. H2O
                3. O2
                4. NaCl
                """);

        while (true) {
            int userAnswer = SimpleBot.scanner.nextInt();
            if (userAnswer == 2) {
                System.out.println("Congratulations, have a nice day!");
                break;
            } else
                System.out.println("Please, try again.");

        }
    }
}

