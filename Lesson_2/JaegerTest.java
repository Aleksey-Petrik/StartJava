public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Crimson Typhoon");
        jaeger1.setMark("Mark-4");
        jaeger1.setOrigin("China");
        jaeger1.setHeight(250f);
        jaeger1.setWeight(1.722f);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        System.out.println(jaeger1.modelName + " " + jaeger1.mark);
        if (jaeger1.drift()) jaeger1.move();
        jaeger1.mark = "Mark-5";
        System.out.println(jaeger1.modelName + " " + jaeger1.mark);

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Hydra Corinthian");
        jaeger2.setMark("Mark-4");
        jaeger2.setOrigin("China");
        jaeger2.setHeight(267f);
        jaeger2.setWeight(1.829f);
        jaeger2.setStrength(9);
        jaeger2.setArmor(8);
        System.out.println(jaeger2.modelName + " " + jaeger2.mark);
        if (jaeger2.drift()) jaeger2.useVortexCannon();
    }
}