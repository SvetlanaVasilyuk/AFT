package FinalExperiments;

public class Main {
    public static void main(String[] args) {
        //NotFinalClass.finalField2 = 7; // Не скомпилируется, нельзя присвоить значение final переменной
        System.out.println(NotFinalClass.finalField2); // использовать переменную можно

        NotFinalClass myClass1 = new NotFinalClass();
        //myClass1.finalField1 = 11; // Не скомпилируется, нельзя присвоить значение final переменной
        System.out.println(myClass1.finalField1); // использовать переменную можно

        myClass1.finalMethod1(); // можно вызвать метод
        NotFinalClass.finalMethod2(); // можно вызвать метод

        FinalClass myClass2 = new FinalClass();
        //myClass2.finalField1 = 12; // Не скомпилируется, нельзя присвоить значение final переменной

        myClass2.finalMethod1(); // можно вызвать метод
        FinalClass.finalMethod2(); // можно вызвать метод
        myClass2.notFinalMethod(); // можно вызвать метод

        Inheriter myClass3 = new Inheriter();
        System.out.println(myClass3.finalField1); // Скомпилируется, и выведется значение, обозначенное в классе-наследнике
        System.out.println(Inheriter.finalField2); // Скомпилируется, и выведется значение, обозначенное в классе-наследнике
    }
}
