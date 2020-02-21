package Human;

public class Man extends Human {

    @Override
    public void jog() {
        System.out.println("Man can jog!");
    }

    @Override
    public void sprint() {
        System.out.println("Man can't run sprint!");
    }

    @Override
    public void breaststroke() {
        System.out.println("Man can swim breaststroke!");
    }

    @Override
    public void butterfly() {
        System.out.println("Man can't swim butterfly");

    }
}
