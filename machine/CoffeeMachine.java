package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Write how many ml of water the coffee machine has: ");
        int countWater = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int countMilk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int countBeans = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        System.out.println();
        int countCups = sc.nextInt();


        int cupsAvail = 0;

        while (countWater >= 200 && countMilk >= 50 && countBeans >= 15) {
            countWater -= 200;
            countMilk -= 50;
            countBeans -= 15;
            cupsAvail++;
        }

        if (cupsAvail >= 2 && countCups < cupsAvail) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", --cupsAvail);
        } else if (cupsAvail == 1 && countCups <= 1 ) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", cupsAvail);
        }




    }
}
