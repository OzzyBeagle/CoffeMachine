
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int water = 400;
    public static int milk = 540;
    public static int coffee = 120;
    public static int cups = 9;
    public static  int money = 550;
    public static String action = "";

    public static String choosenCoffee = "";

    public static int[] espresso = {250, 16}; // water, coffee
    public static int[] latte = {350, 75,20}; // water, milk, coffee
    public static int[] cappuccino = {200, 100, 12}; // water, milk, coffee

    public static boolean check(){

        boolean result = false;

        switch(choosenCoffee){
            case "1":
                if(water < espresso[0]){
                    System.out.println("Sorry, not enough water!");
                } else if( coffee < espresso[1]){
                    System.out.println("Sorry, not enough coffee beans!");
                    return false;
                } else if(cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                } else{
                    result = true;
                }
                break;
            case "2":
                if(water < latte[0]){
                    System.out.println("Sorry, not enough water!");
                } else if(milk < latte[1]){
                    System.out.println("Sorry, not enough milk!");
                } else if(coffee < latte[2]){
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(cups < 1){
                    System.out.println("Sorry, not enough cups!");
                } else {
                    result = true;
                }
                break;
            case "3":
                if(water < cappuccino[0]){
                    System.out.println("Sorry, not enough water!");
                } else if(milk < cappuccino[1]){
                    System.out.println("Sorry, not enough milk!");
                } else if(coffee < cappuccino[2]){
                    System.out.println("Sorry, not enough coffee beans!");
                } else if(cups < 1){
                    System.out.println("Sorry, not enough cups!");
                } else {
                    result = true;
                }
                break;
            default:
                break;
        }

        return result;
    }

    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main manu:");
        choosenCoffee = scanner.next();
        switch (choosenCoffee){
            case "1": // espresso
                if(check()){
                    water -= 250;
                    coffee -= 16;
                    money +=4;
                    cups -=1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2": // latte
                if(check()) {
                    water -= 350;
                    milk -= 75;
                    coffee -=20;
                    money+=7;
                    cups -=1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3": // cappucino
                if(check()){
                    water -=200;
                    milk -=100;
                    coffee -=12;
                    money +=6;
                    cups -=1;
                    System.out.println("I have enough resources, making you a coffee!");
                }
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

        //write();

        boolean run = true;

        while(run) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();

            switch (action) {
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
                case "remaining":
                    write();
                    break;
                case "exit":
                    run = false;
                    break;
                default:
                    break;
            }

            //write();
        }
    }
}