public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.sex = 'M';
        wolf.nickName = "Alha";
        wolf.weight = 120;
        wolf.age = 34;
        wolf.color = "black";

        System.out.println("Кличка - " + wolf.nickName);
        System.out.println("Пол - " + wolf.sex);
        System.out.println("Вес - " + wolf.weight);
        System.out.println("Возраст - " + wolf.age);
        System.out.println("Цвет - " + wolf.color);

        wolf.walk();
        wolf.hunt();
        wolf.run();
        wolf.howl();
        wolf.sit();
    }
}