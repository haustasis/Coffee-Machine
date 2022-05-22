package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

        Scanner sc = new Scanner(System.in);

        int cups = sc.nextInt();

        int water = cups * 200;
        int milk = cups * 50;
        int beans = cups * 15;

        System.out.printf("For %d cups of coffee you will need: %n", cups);
        System.out.printf("%d ml of water %n", water);
        System.out.printf("%d ml of milk %n", milk);
        System.out.printf("%d g of coffee beans %n", beans);



    }
}
