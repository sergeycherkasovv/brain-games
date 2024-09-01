package hexlet.code;
import hexlet.code.games.Even2;

import java.util.Scanner;
import  hexlet.code.games.Calc;
import hexlet.code.games.GCD;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!"); //Начало игры. Приветсвие

        Scanner scanner = new Scanner(System.in); //Создали объект Scanner
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Great"
                        + "\n2 - Even"
                        + "\n3 - Calc"
                        + "\n4 - GCD"
                        + "\n0 - Exit");
        var numberGame = scanner.nextInt();
        System.out.println("Your choice: " + numberGame);

        switch (numberGame) {
            case 1:
                Engine.userName();
                String name = Engine.userEntersString();
                Engine.helloUserName(name);
                break;
            case 2:
                Even2.even();
                break;
            case 3:
                Calc.calculated();
                break;
            case 4:
                GCD.gcd();
            case 0:
                break;
        }
        scanner.close(); //Завершает работу с пользователем
    }
}
