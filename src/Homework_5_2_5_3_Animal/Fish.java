package Homework_5_2_5_3_Animal;

public class Fish extends Animal implements Swim {

    @Override
    public void getName() {
        System.out.println("Fish");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming...");
    }
}
