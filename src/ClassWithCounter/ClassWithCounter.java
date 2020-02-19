package ClassWithCounter;

public class ClassWithCounter {

    private static int counter;

    ClassWithCounter(){
        counter++;
    }

    public static int getCountOfObjects(){
        return counter;
    }
}
