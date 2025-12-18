/*// Welcome the user and explain what the program does
e.g. Display: “Welcome! This program will calculate SUS(System Usability Scale) based on the responses of 10 SUS Test questions. Please input the response below for Question one (rating between 1 to 5): ”

// Create a list to store 10 responses using Arraylist
   Create a list called responses 

// Loop to collect user input for 10 SUS questions 
For i from 1 to 10
Prompt user: “ Enter the response observed for Question i (1 to 5): “ 

// Get input from user 

// Store it in the list called responses 

// Create a variable ‘totalscore’ to store the adjusted score, set it to 0 

// Loop through each response in the list 
For i from 0 to 9(0 being the 1st question) 
If i is even, subtract 1 from response and add the outcome to totalscore variable 
Else, if it is odd, subtract response from 5 and add that to totalscore variable 

// Multiply the totalscore by 2.5 to get the final SUS score 
   SUSScore = totalscore * 2.5

// Display the SUS score to user 
“Your final SUS Usability score is” + SUSScore. 
“A higher score indicates better usability.” 
*/

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
