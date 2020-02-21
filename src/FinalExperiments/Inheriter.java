package FinalExperiments;

//Следующий класс нельзя создать, потому что нельзя наследоваться от final класса
/*
public class Inheriter extends FinalClass{

}
*/

//А от не final класса наследоваться можно
public class Inheriter extends NotFinalClass{
    public int finalField1 = 5; // Можно создать поле со своим значением для класса-наследника
    public static int finalField2 = 6; // Можно создать поле со своим значением для класса-наследника

}
