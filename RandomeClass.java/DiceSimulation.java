/* Create a random number generator
 * Roll the first die to generate a random number between 1 to 10 and create a variable die1
 * Roll the second die to generate a random number between 1 to 10 and create a second variable die2
 * Calculate the sum, difference, product, quotient when die1 is divided by die2, and the remainder 
 * Calculate results for raising die 1 to the power of die2 
 * print the results for user using printf
 * print each outcome in a friendly manner 
 */

 import java.util.Random;

public class DiceSimulation {

    public static void main(String[] args) {
        
        Random rand = new Random(); 

        int die1 = rand.nextInt(10)+1; 
        int die2 = rand.nextInt(10)+1;

        int sum = die1 + die2; 
        int difference = die1 - die2;
        int product = die1 * die2; 
        int quotient = die1 / die2;
        int remainder = die1 % die2;
        double power = (int) Math.pow(die1, die2); 

        System.out.printf("Die 1: %d\n", die1);
        System.out.printf("Die 2: %d\n", die2);
        System.out.printf("Addition: %d + %d = %d\n", die1, die2, sum);
        System.out.printf("Subtraction: %d - %d = %d\n", die1, die2, difference);
        System.out.printf("Multiplication: %d * %d = %d\n", die1, die2, product);
        System.out.printf("Division: %d / %d = %d with remainder %d\n", die1, die2, quotient, remainder);
        System.out.printf("Power = %d ^ %d = %.2f\n", die1, die2, power);

    }
    
}
