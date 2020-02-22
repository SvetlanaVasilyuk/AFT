package Homework_5_4_Human;

public class Sportsman extends Human {

    @Override
    public void jog() {
        System.out.println("Sportsman can jog!");
    }

    @Override
    public void sprint() {
        System.out.println("Sportsman can run sprint!");
    }

    @Override
    public void breaststroke() {
        System.out.println("Sportsman can swim breaststroke!");
    }

    @Override
    public void butterfly() {
        System.out.println("Sportsman can swim butterfly!");

    }
}
