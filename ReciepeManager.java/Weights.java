import java.util.Random;
import java.util.ArrayList;

public class Weights {

    public static void main(String[] args) {

        Random myRandom = new Random(); 
        int arrayListCapacity = 5;
        ArrayList <Integer> weights = new ArrayList<Integer>(arrayListCapacity);
        int sum = 0; 

        for (int i = 0; i < arrayListCapacity; i++){
            int randomInt = myRandom.nextInt(500) + 1;
            weights.add(randomInt);
            sum += randomInt;
            // sum = sum + randomInt;
            System.out.println("The element is " + randomInt);

        }
        System.out.println("\n\nThe sum is: " + sum);

        sum = 0; 
        for (int i = 0; i <weights.size(); i++){
            sum += weights.get(i);
        }
        System.out.println("\n\nThe sum is: " + sum);

        sum = 0; 
        for (int weight : weights){
            sum += weight;
        }
        
        System.out.println("\n\nThe sum is: " + sum);

        sum = 0;
        int i = 0;
        while (i<weights.size()) {
            sum += weights.get(i);
            i++;
            
        }

        System.out.println("\n\nThe sum is: " + sum);

    }
    
}

