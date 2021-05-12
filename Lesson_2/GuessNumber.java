import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int compNumber;//загаданное число

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    private void inventCompNumber(){
        this.compNumber = (int) (Math.random() * 100) + 1;
    }

    public Player game(Scanner scanner) {
        inventCompNumber();
        System.out.println("Компьютер загадал число." + "  //Для теста комп загадал число - " + this.compNumber);
        Player currPlayer = firstPlayer;
        while (true) {
            System.out.print("Число вводит игрок с именем " + currPlayer.getName() + ": ");
            int playerNumber = currPlayer.inNumber(scanner);
            if (playerNumber != compNumber) {
                if (playerNumber > compNumber) {
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
                break;
            }
        }
        return currPlayer;
    }
}