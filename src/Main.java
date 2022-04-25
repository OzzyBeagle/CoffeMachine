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

        int input;

        System.out.println("Write how many cups of coffee you will need:");
        input = scanner.nextInt();
        System.out.println("For 25 cups of coffee you will need:");
        System.out.println(input * 200 + " ml of water");
        System.out.println(input * 50 + " ml of milk");
        System.out.println(input * 15 + " g of coffee beans");


    }
}