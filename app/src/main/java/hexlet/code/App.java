package hexlet.code;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!"); //Начало игры. Приветсвие

        Scanner scanner = new Scanner(System.in); //Создали объект Scanner
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Great"
                        + "\n2 - Even"
                        + "\n3 - Calc"
                        + "\n4 - GCD"
                        + "\n5 - Progression"
                        + "\n6 - Prime"
                        + "\n0 - Exit");
        var numberGame = scanner.nextInt();
        System.out.println("Your choice: " + numberGame);

        switch (numberGame) {
            case 1:
                Engine.run();
                break;
            case 2:
                Even.run();
                break;
            case 3:
                Calc.run();
                break;
            case 4:
                GCD.run();
                break;
            case 5:
                Progression.run();
                break;
            case 6:
                Prime.run();
                break;
            case 0:
                break;
        }
        scanner.close(); //Завершает работу с пользователем
    }
}
