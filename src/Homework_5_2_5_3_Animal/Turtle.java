package Homework_5_2_5_3_Animal;

public class Turtle extends Animal implements Run, Swim{

    @Override
    public void getName() {
        System.out.println("Turtle");
    }

    @Override
    public void run() {
        System.out.println("Turtle is running...");
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swimming...");
    }
}
