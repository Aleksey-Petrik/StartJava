import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int secretNumber;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    private void inventCompNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Компьютер загадал число." + "  //Для теста комп загадал число - " + secretNumber );
    }

    public Player startGame() {
        Scanner scanner = new Scanner(System.in);
        inventCompNumber();
        Player currPlayer = firstPlayer;
        while (true) {
            System.out.print("Число вводит игрок с именем " + currPlayer.getName() + ": ");
            int playerNumber = scanner.nextInt();

            if (playerNumber != secretNumber ) {
                if (playerNumber > secretNumber ) {
                    System.out.println("Данное число больше того, что загадал компьютер!");
                } else {
                    System.out.println("Данное число меньше того, что загадал компьютер!");
                }       
                //следующий игрок
                if (currPlayer.getName().equals(firstPlayer.getName())){
                    currPlayer = secondPlayer;
                } else {
                    currPlayer = firstPlayer;
                }                              
            } else {
                System.out.println("\n*** ПОБЕДИЛ игрок под именем - " + currPlayer.getName() + " ***\n");
                break;
            }
        }
        return currPlayer;
    }
}