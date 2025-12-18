/*Create an array with a capacity of 100 prices (in decimal notation).
Configure variables to monitor:
    The sum of the favorable pricing
    Total of prices that are negative (such as discounts)  
    The amount of taxes
    Total amount due
    The most costly item
Examine every location in the array:
    Select a number at random from -2 to 20.
    To two decimal places, round it.
If the number is positive:
    Include it in the positive sum.
    
Save it as the most costly if it's the highest so far.
Add it to the negative sum if it's negative.
Use 3% of the positive total to compute tax.
Determine the ultimate sum (positive total plus tax).
Print the receipt for each item.

Print the synopsis that displays:
 The sum of the positive items
 Total amount of money saved through discounts
 The amount of taxes
 The most costly item

 The total amount due
*/

import java.util.Random;


public class SalesReceipt {

    public static void main(String[] args) {
        double [] prices = new double[100];
        double positiveTotal = 0;
        double negativeTotal = 0;
        double tax = 0;
        double totalDue = 0;
        double mostExpensive = Double.MIN_VALUE;

        Random rand = new Random();

        for (int i = 0; i < prices.length; i++){
            prices [i] = Math.round((rand.nextDouble()* 22 - 2)* 100.0) / 100.0;

            if (prices [i]>0){
                positiveTotal += prices[i];
                if (prices[i] > mostExpensive){
                    mostExpensive = prices[i];
                }
            } else{
                negativeTotal += prices[i];
            }
        } 

        tax = Math.round(positiveTotal * 0.03 * 100.0) / 100.0;
        totalDue = Math.round ((positiveTotal + tax ) * 100.0);


        for (int i = 0; i < prices.length; i++){

            System.out.printf("Item %03d: $%6.2f\n", (i+1), prices[i]);


        }

        System.out.println("\nSUMMARY");
        System.out.printf("Subtotal (positive only): $%.2f\n", positiveTotal);
        System.out.printf("You saved: $%.2f\n", Math.abs(negativeTotal));
        System.out.printf("Sales tax (3%%): $%.2f\n", tax);
        System.out.printf("Most expensive item: $%.2f\n", mostExpensive);
        System.out.printf("Total due: $%.2f\n", totalDue);
    }
  }
  