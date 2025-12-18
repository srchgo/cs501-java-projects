import java.util.ArrayList;
import java.util.Scanner;


public class SUSCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> responses = new ArrayList<Integer>();
        int totalScore = 0; 

        System.out.println("Welcome! This program will calculate your SUS (System Usability Scale) score. ");
        System.out.println("Please respond to 10 SUS question with a number between 1 to 5.");

        
        for (int i = 1; i <= 10; i++){
            int response = 0;
            while (true){
                System.out.println(" Enter the response for question "+ i + " (1 to 5): ");
                if (input.hasNext()){
                    response = input.nextInt();
                    if (response >= 1 && response <= 5) {
                        break;
                    } else {
                        System.out.println("Please enter a valid number between 1 and 5.");
                    } 
                } else {
                        System.out.println(" That's not a number. Try again.");
                        input.next();
                    }
                }
                responses.add(response);
            }

            
            for (int i = 0; i < responses.size(); i++){
                int response = responses.get(i);
                if (i % 2 == 0){
                    totalScore += (response - 1);
                } else {
                    totalScore += (5 - response); 
                }
            }

            double susScore = totalScore * 2.5;

            System.out.println("\nYour final SUS Usability Score is: " + susScore);
            System.out.println("A higher score (above 68) indicates better usability.");

            input.close();
                }
            }
