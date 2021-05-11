public class MyFirstGame{
    public static void main(String[] args){
        //Диапозон поиска, изменяемый
        int x1 = 0;
        int x2 = 100;

        int ourNumber = 0;
        int compNumber = 49;//Число компьютера, изменяемое

        while (ourNumber != compNumber){
            ourNumber += (x2 - x1) / 2;  
            if (ourNumber > compNumber) {
                System.out.println("Данное число(" + ourNumber + ") больше того, что загадал компьютер");
                x2 = ourNumber;
                ourNumber = x1;
            }else if(ourNumber < compNumber){
                System.out.println("Данное число(" + ourNumber + ") меньше того, что загадал компьютер");
                x1 = ourNumber;
            }
        }
        System.out.println("Поздравляю, число угадано! " + ourNumber);
    }
}