package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static final int GREAT = 1;
    public static final int EXIT = 0;
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!"); //Начало игры. Приветсвие
        Scanner scanner = new Scanner(System.in); //Создали объект Scanner
        System.out.println("Please enter the game number and press Enter.");

        System.out.println(GREAT + " - Great");
        System.out.println(EXIT + " - Exit");
        System.out.println(EVEN_GAME + " - Even");
        System.out.println(CALC_GAME + " - Calc");
        System.out.println(GCD_GAME + " - GCD");
        System.out.println(PROGRESSION_GAME + " - Progression");
        System.out.println(PRIME_GAME + " - Prime");

        var numberGame = scanner.nextInt();
        System.out.println("Your choice: " + numberGame);

        switch (numberGame) {
            case GREAT:
                Cli.run();
                break;
            case EVEN_GAME:
                Even.run();
                break;
            case CALC_GAME:
                Calc.run();
                break;
            case GCD_GAME:
                GCD.run();
                break;
            case PROGRESSION_GAME:
                Progression.run();
                break;
            case PRIME_GAME:
                Prime.run();
                break;
            case EXIT:
                break;
            default:
                throw new RuntimeException("Unknown Game");
        }
    }
}
