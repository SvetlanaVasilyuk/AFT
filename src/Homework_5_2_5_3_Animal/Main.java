package Homework_5_2_5_3_Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Turtle turtle = new Turtle();

        cat.getName();
        duck.getName();
        fish.getName();
        turtle.getName();

        cat.run();
        duck.fly();
        duck.run();
        duck.swim();
        fish.swim();
        turtle.run();
        turtle.swim();
    }
}
