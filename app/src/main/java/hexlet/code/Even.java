package hexlet.code;
import java.util.Random; //Импортируем Класс Random
import java.util.Scanner; //Подключаем Класс Scanner

public class Even {
    public static void evenParity() {
        Random random = new Random();  //Создали объект Random
        Scanner scanner = new Scanner(System.in); //Создали объект Scanner

        //Копия логики файла Cli.java
        //Пока не буду создавать класс с кострукцией
        System.out.println("May I have your name?"); //Узнать имя игрока
        String userName = scanner.nextLine(); //Игрок вводит имя и для завершения нажимает Enter
        System.out.println("Hello, " + userName + "!"); // Приветсвие игрока


        // Начало игры Even
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100); // вернет случайное число от 0 до 99

            System.out.println("Question: " + randomNumber);
            String userAnswer = scanner.nextLine(); //Игрок вводит свой ответ yes или no
            System.out.println("Your answer: " + userAnswer); //Вывадится ответ игрока

            int evenNumberRandom = randomNumber % 2; //Остаток от деления в отдельной переменной
                                                     //так меньше кода в условиях if and else if

            if (evenNumberRandom == 0 && userAnswer.equals("yes")){
                System.out.println("Correct!");
            } else if (evenNumberRandom != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Congratulations, " + userName);
        }
        scanner.close(); //Завершает работу с пользователем

    }
}
