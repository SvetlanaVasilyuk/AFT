package ClassWithCounter;

public class Main {
    public static void main(String[] args) {
        ClassWithCounter counteredObj1 = new ClassWithCounter();
        ClassWithCounter counteredObj2 = new ClassWithCounter();
        ClassWithCounter counteredObj3 = new ClassWithCounter();

        ClassWithCounter[] mass = new ClassWithCounter[10];
        for (int i=0; i<10; i++){
            mass[i]= new ClassWithCounter();
        }

        System.out.println("Количество созданных объектов класса ClassWithCounter = " + ClassWithCounter.getCountOfObjects());
    }
}
