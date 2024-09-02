package hexlet.code;
import hexlet.code.games.*;

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
                System.out.println(Engine.userName());
                String name = Engine.userEntersString();
                System.out.println(Engine.helloUserName(name));
                break;
            case 2:
                Even2.even();
                break;
            case 3:
                Calc.calculated();
                break;
            case 4:
                GCD.gcd();
                break;
            case 5:
                Progression.progression();
                break;
            case 6:
                Prime.prime();
                break;
            case 0:
                break;
        }
        scanner.close(); //Завершает работу с пользователем
    }
}
