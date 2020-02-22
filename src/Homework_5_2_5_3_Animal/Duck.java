package Homework_5_2_5_3_Animal;

public class Duck extends Animal implements Fly, Run, Swim {

    @Override
    public void getName() {
        System.out.println("Duck");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }

    @Override
    public void run() {
        System.out.println("Duck is running...");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming...");
    }
}
