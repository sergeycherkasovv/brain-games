package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!"); //Начало игры. Приветсвие

        Scanner scanner = new Scanner(System.in); //Создали объект Scanner
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Great\n2 - Even\n0 - Exit");
        var numberGame = scanner.nextInt();
        System.out.println("Your choice: " + numberGame);

        switch (numberGame) {
            case 1:
                Cli.userName();
                break;
            case 2:
                Even.evenParity();
                break;
            case 0:
                break;
        }
        scanner.close(); //Завершает работу с пользователем
    }
}
