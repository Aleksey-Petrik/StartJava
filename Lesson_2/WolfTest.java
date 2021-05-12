public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setSex('M');
        wolf.setNickName("Alha");
        wolf.setWeight(120);
        wolf.setAge(7);
        wolf.setColor("black");

        System.out.println("Кличка - " + wolf.getNickName());
        System.out.println("Пол - " + wolf.getSex());
        System.out.println("Вес - " + wolf.getWeight());
        System.out.println("Возраст - " + wolf.getAge());
        System.out.println("Цвет - " + wolf.getColor());

        wolf.walk();
        wolf.hunt();
        wolf.run();
        wolf.howl();
        wolf.sit();
    }
}