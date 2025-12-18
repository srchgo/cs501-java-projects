/* Start main method
 * import scanner and arraylist 
 * Loops: get ingredient details until user types DONE
 * Create ingredient and add to Arraylist 
 * Show menu list all ingredients, show total calories, show calories per serving, list ingredients by type and exit option
 * close scanner
 * end main method
 */


import java.util.Scanner;
import java.util.ArrayList;

public class RecipeManager {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        ArrayList <Ingredient> ingredientsList = new ArrayList<Ingredient>();
        String name, unit, type;
        double calories; 

        System.out.println("Welcome to the recipe manager!");
        System.out.println("Let's add ingredients to your reciepe.");
        System.out.println("When you are done, type DONE as the ingredient name.");

        name = "na";

        while (!name.equalsIgnoreCase("DONE")) {
            System.out.println("Enter Ingredient Name (or DONE to stop): ");
            name = keyboard.nextLine();

            if (!name.equalsIgnoreCase("DONE")) {
                System.out.println("Enter Unit (like 1 cup, 2tbsp, etc): ");
                unit = keyboard.nextLine();

                System.out.println("Enter Calories: ");
                calories = keyboard.nextDouble();
                keyboard.nextLine();

                System.out.println("Enter Type (Protein, Carb, Fat): ");
                type = keyboard.nextLine();

                ingredientsList.add(new Ingredient(name, unit, calories, type));
                
            }
            
        }

        int choice = 0;
        while (choice != 5){
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. List all ingredients");
            System.out.println("2. Calculate total calories");
            System.out.println("3. Calculate calories per serving");
            System.out.println("4. List ingredients by type");
            System.out.println("5. Exit");
            System.out.println("Enter your choice( 1 to 5): " );
            choice = keyboard.nextInt();
            keyboard.nextLine();

            if (choice == 1) {
                System.out.println("\nIngredients: ");
                for (Ingredient ing : ingredientsList){
                    System.out.println(ing.toString());
                }
                
            }

            else if (choice == 2) {
                double totalCalories = 0;
                for (Ingredient ing : ingredientsList){
                    totalCalories += ing.getCalories();
                }
                System.out.println("Total calories: " + totalCalories);
                
            }
            else if (choice == 3) {
                double totalCalories = 0;
                for (Ingredient ing : ingredientsList){
                    totalCalories += ing.getCalories();
            }
            System.out.println("Enter number of servings: ");
            int servings = keyboard.nextInt();
            keyboard.nextLine();

            double caloriesPerServing = totalCalories/servings;
            System.out.println("Calories per serving: " + caloriesPerServing);
        
            }
            else if (choice ==4 ) {
                System.out.println("Enter type to list (Protein, Carb, Fat): ");
                String searchType = keyboard.nextLine();

                System.out.println("Ingredients of type " + searchType + ":");
                for (Ingredient ing : ingredientsList){
                    if (ing.getType().equalsIgnoreCase(searchType)) {
                        System.out.println(ing.toString());
                        
                    }
                }
                
            }
            else if (choice == 5) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("Invalid choice, please enter 1-5.");
            }
        
        }
        keyboard.close();
    }
    
}
