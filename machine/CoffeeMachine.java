package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int initWater = 400;
        int initMilk = 540;
        int initBeans = 120;
        int initDispCups = 9;
        int initMoney = 550;

        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", initWater);
        System.out.printf("%d ml of milk%n", initMilk);
        System.out.printf("%d g of coffee beans%n", initBeans);
        System.out.printf("%d disposable cups%n", initDispCups);
        System.out.printf("$%d of money%n", initMoney);

        System.out.println("Write action (buy, fill, take): ");
        String action = sc.nextLine();

        if(action.equalsIgnoreCase("take")) {
            System.out.printf("I gave you $%d", initMoney);
            initMoney = 0;

            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water%n", initWater);
            System.out.printf("%d ml of milk%n", initMilk);
            System.out.printf("%d g of coffee beans%n", initBeans);
            System.out.printf("%d disposable cups%n", initDispCups);
            System.out.printf("$%d of money%n", initMoney);
        }

        if(action.equalsIgnoreCase("fill")) {
            System.out.println("Write how many ml of water you want to add: ");
            int addWater = sc.nextInt();
            initWater += addWater;
            System.out.println("Write how many ml of milk you want to add: ");
            int addMilk = sc.nextInt();
            initMilk += addMilk;
            System.out.println("Write how many grams of coffee beans you want to add:");
            int addBeans = sc.nextInt();
            initBeans += addBeans;
            System.out.println("Write how many disposable cups of coffee you want to add:");
            int addDispCups = sc.nextInt();
            initDispCups += addDispCups;

            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water%n", initWater);
            System.out.printf("%d ml of milk%n", initMilk);
            System.out.printf("%d g of coffee beans%n", initBeans);
            System.out.printf("%d disposable cups%n", initDispCups);
            System.out.printf("$%d of money%n", initMoney);
        }

        if(action.equalsIgnoreCase("buy")) {

            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int typeOfCoffee = sc.nextInt();

            switch (typeOfCoffee) {
                case 1 -> {
                    initWater -= 250;
                    initBeans -= 16;
                    initDispCups -= 1;
                    initMoney += 4;
                }
                case 2 -> {
                    initWater -= 350;
                    initMilk -= 75;
                    initBeans -= 20;
                    initDispCups -= 1;
                    initMoney += 7;
                }
                case 3 -> {
                    initWater -= 200;
                    initMilk -= 100;
                    initBeans -= 12;
                    initDispCups -= 1;
                    initMoney += 6;
                }
                default -> System.out.println("Please choose coffee");
            }


            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water%n", initWater);
            System.out.printf("%d ml of milk%n", initMilk);
            System.out.printf("%d g of coffee beans%n", initBeans);
            System.out.printf("%d disposable cups%n", initDispCups);
            System.out.printf("$%d of money%n", initMoney);
        }





    }
}
