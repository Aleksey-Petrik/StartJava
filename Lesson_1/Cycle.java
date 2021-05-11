public class Cycle{
    public static void main(String[] args){
        int i = 0;
        System.out.println("Cycle FOR");
        for(i = 0; i < 21; i++){
            System.out.print(i + " ");
        }
        i = 6;
        System.out.println("\n" + "Cycle WILE");
        while(i > -7){
            System.out.print(i + " ");
            i-=2;
        }
        i = 10;
        int sum = 0;
        System.out.println("\n" + "Cycle DO WILE");
        do{
            if (i % 2 != 0) sum += i;
            i++;
        }while(i < 21);
        System.out.print("Sum: " + sum);
    }
}