package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Engine.QUESTION_USER_NAME);
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
