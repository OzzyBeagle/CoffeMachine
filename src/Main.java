
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int water = 400;
    public static int milk = 540;
    public static int coffee = 120;
    public static int cups = 9;
    public static  int money = 550;
    public static String action = "";

    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino:");
        int num = scanner.nextInt();
        switch (num){
            case 1: // espresso
                water -= 250;
                coffee -= 16;
                money +=4;
                cups -=1;
                break;
            case 2: // latte
                water -= 350;
                milk -= 75;
                coffee -=20;
                money+=7;
                cups -=1;
                break;
            case 3: // cappucino
                water -=200;
                milk -=100;
                coffee -=12;
                money +=6;
                cups -=1;
                break;
            default:
                break;
        }
    }

    public static void fill(){
        int newWater = 0;
        int newMilk = 0;
        int newCoffee = 0;
        int newCups = 0;

        System.out.println("Write how many ml of water you want to add: ");
        newWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        newMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        newCoffee = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        newCups = scanner.nextInt();

        water += newWater;
        milk += newMilk;
        coffee += newCoffee;
        cups += newCups;
    }

    public static void write(){

        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println( coffee + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
    public static void main(String[] args) {

        write();

        System.out.println("Write action (buy, fill, take):");
        action = scanner.next();

        switch(action){
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
            default:
                break;
        }

        write();

    }
}