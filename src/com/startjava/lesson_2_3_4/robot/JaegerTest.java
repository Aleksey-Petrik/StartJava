package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Android", "Mark", "USA", 0, 0, 0, 0);
        jaeger1.setModelName("Crimson Typhoon");
        jaeger1.setMark("Mark-4");
        jaeger1.setOrigin("China");
        jaeger1.setHeight(250f);
        jaeger1.setWeight(1.722f);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);

        System.out.println(jaeger1.getModelName() + " " + jaeger1.getMark());
        if (jaeger1.drift()) jaeger1.move();
        jaeger1.setMark("Mark-5");
        System.out.println(jaeger1.getModelName() + " " + jaeger1.getMark());

        Jaeger jaeger2 = new Jaeger("Android", "Mark", "China", 0, 0, 0, 0);
        jaeger2.setModelName("Hydra Corinthian");
        jaeger2.setMark("Mark-4");
        jaeger2.setOrigin("China");
        jaeger2.setHeight(267f);
        jaeger2.setWeight(1.829f);
        jaeger2.setStrength(9);
        jaeger2.setArmor(8);
        
        System.out.println(jaeger2.getModelName() + " " + jaeger2.getMark());
        if (jaeger2.drift()) jaeger2.useVortexCannon();
    }
}