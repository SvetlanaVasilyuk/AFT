package MultiplyTable;

import java.sql.SQLOutput;

public class Main {

    public static void printMultiplyTableV1(){
        for (int i=2; i<10; i++){
            for (int j=1; j<11; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }

    public static void printMultiplyTableV2(){
        System.out.print("   ");
        for (int i=1; i<10; i++){
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i=1; i<10; i++){
            System.out.print(i);
            for (int j=1; j<10; j++){
                if (i*j<10){
                    System.out.print("  " + i*j);
                }
                else {
                    System.out.print(" " + i*j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMultiplyTableV1();
        System.out.println();
        printMultiplyTableV2();
    }
}
