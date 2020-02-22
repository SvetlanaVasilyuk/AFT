package Homework_5_2_5_3_Animal;

public class Cat extends Animal implements Run {

    @Override
    public void getName() {
        System.out.println("Cat");
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
    }
}
