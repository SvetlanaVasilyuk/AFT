package VendingAutomate;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addDrinkToMenu("Кока-Кола 0.33л", 60);
        vm.addDrinkToMenu("Аква Минерале 0.33л", 55);
        vm.addDrinkToMenu("Сок Добрый 0.25л", 40);
        while (true) {
            vm.runVendingMachine();
        }
    }
}
