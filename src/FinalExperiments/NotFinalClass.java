package FinalExperiments;

public class NotFinalClass {
    public final int finalField1 = 1;  // поле должно быть проинициализирован здесь
    public static final int finalField2 = 2; // поле должно быть проинициализирован здесь

    public final void finalMethod1(){
        //Следующая строка не скомпилируется, так как поле finalField1 нельзя присвоить другое значение
        // this.finalField1 = 3;

        //Следующая строка тоже не скомпилируется, так как поле finalField1 нельзя присвоить другое значение
        //finalField1 = 4;

        System.out.println(this.finalField1); // Скомпилируется
        System.out.println(finalField2); // Скомпилируется
    }

    public static final void finalMethod2(){
        // Следующие две строки не скомпилируются из-за того, что нельзя использовать this в static методе
        //System.out.println(this.finalField1);
        //System.out.println(this.finalMethod1);

        System.out.println(finalField2); // Скомпилируется

    }
}
