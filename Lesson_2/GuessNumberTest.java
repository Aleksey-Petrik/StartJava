import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String nameFirstPlayer = scanner.next();
        System.out.print("Введите имя второго игрока: ");
        String nameSecondPlayer = scanner.next();

        Player firstPlayer = new Player(nameFirstPlayer);
        Player secondPlayer = new Player(nameSecondPlayer);
        
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        
        String question = "yes";
        do {
            if ("yes".equals(question)) {
                System.out.println("\n*** Игра началась!!! ***");
                Player winPlayer = guessNumber.game(scanner);
                System.out.println("\n*** ПОБЕДИТЕЛЬ игрок под именем - " + winPlayer.getName() + " ***\n");
            }
            System.out.print("\nХотите продолжить игру? [yes/no]:");
        } while (!"no".equals(question = scanner.next()));
    }
}