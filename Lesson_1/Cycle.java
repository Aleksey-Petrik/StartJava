public class Cycle {
    public static void main(String[] args) {
        System.out.println("Cycle FOR");
        for (int i = 0; i < 21; i++){
            System.out.print(i + " ");
        }

        int counter = 6;
        System.out.println("\n" + "Cycle WILE");
        while (counter > -7){
            System.out.print(counter + " ");
            counter -= 2;
        }

        counter = 10;
        int sum = 0;
        System.out.println("\n" + "Cycle DO WILE");
        do {
            if (counter % 2 != 0) sum += counter;
            counter++;
        } while (counter < 21);
        System.out.print("Sum: " + sum);
    }
}