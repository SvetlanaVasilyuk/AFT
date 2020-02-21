package FinalExperiments;

public final class FinalClass extends NotFinalClass {

    //Следующий метод не скомпилируется, так как нельзя переопределять класс final
    /*
    public final void finalMethod1(){
        System.out.println();
    }
    */

    //Аналогично:
    /*
    public static final void finalMethod2(){
        System.out.println();
    }
    */

    //В следующем методе все скомпилируется
    public void notFinalMethod(){
        this.finalMethod1();
        finalMethod2();
    }

}
