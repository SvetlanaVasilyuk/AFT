package Human;

public class Main {

    public static void main(String[] args) {
        Human man1 = new Man();
        Human man2 = new Sportsman();

        man1.jog();
        man1.sprint();
        man1.breaststroke();
        man1.butterfly();

        man2.jog();
        man2.sprint();
        man2.breaststroke();
        man2.butterfly();
    }

}
