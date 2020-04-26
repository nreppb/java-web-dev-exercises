package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("How much gas have you consumed (in gallons)?");
        Double gas = input.nextDouble();
        Double milesPerGallon = miles * gas;
        System.out.println("Your miles-per-gallon is " + milesPerGallon + " miles per gallon.");
    }
}
