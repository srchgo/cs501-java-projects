import java.util.Scanner;

public class Beverage {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int bevLength = 3;
        String[] beverage = new String[bevLength];
        double[] price = new double[bevLength];
        for(int i = 0; i < beverage.length; i++){
            System.out.println("Enter beverage name ( " + bevLength + " total):");
            beverage[i] = keyboard.next();
            System.out.println("Enter price: ");
            price[i] = keyboard.nextDouble();
        }
        
        for(int i = 0; i < beverage.length; i++){
            System.out.print(beverage[i] + "\t");
            System.out.printf("$%.2f",price[i]);
        }
        keyboard.close();

    }
    
}

