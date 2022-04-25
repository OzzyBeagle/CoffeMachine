import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Jedna kawa to:
        //200ml wody, 50 ml mleka, 15g kawy

        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/

/*        int input;

        System.out.println("Write how many cups of coffee you will need:");
        input = scanner.nextInt();
        System.out.println("For 25 cups of coffee you will need:");
        System.out.println(input * 200 + " ml of water");
        System.out.println(input * 50 + " ml of milk");
        System.out.println(input * 15 + " g of coffee beans");*/

        int water;
        int milk;
        int coffee;
        int cups;
        int howMany;

        System.out.println("Write how many ml of water the coffee machine has: ");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffe machine has:");
        coffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();

        int howManyFromWater = water / 200;
        int howManyFromMilk = milk / 50;
        int howManyFromCoffee = coffee / 15;

        if(howManyFromWater >= cups && howManyFromMilk >= cups && howManyFromCoffee >= cups) {
            if(howManyFromWater < howManyFromMilk){
                if(howManyFromWater < howManyFromCoffee){
                    howMany = howManyFromWater;
                } else{
                    howMany = howManyFromCoffee;
                }
            }
             else if(howManyFromMilk < howManyFromCoffee){
                howMany = howManyFromMilk;
            } else {
                howMany = howManyFromCoffee;
            }

            if(howMany == cups) {
                System.out.println("Yes, I can make that amount of coffee");
            } else {
                System.out.println("Yes, I can make that amount of coffee (and even " + (howMany - cups) + " more then that)");
            }

        } else {
            int tmp = howManyFromWater;
            if(tmp > howManyFromMilk) {
                tmp = howManyFromMilk;
            }
            if(tmp > howManyFromCoffee) {
                tmp = howManyFromCoffee;
            }
            System.out.println("No, I can make only " + tmp + " cups of coffee");
        }
    }
}