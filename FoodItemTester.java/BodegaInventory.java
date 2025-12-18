/*Start the inventory program:
    - Make a list called inventory

    - Add several food items (like milk, yoghurt, canned beans, doritos)  
    - Add several non-food items (like paper towels, scissors, lighter, spray)

    - Print "Full Inventory"

    - Go through each item:
    - If it is a food item:
        - Check how many days left before sell-by date
        - If 7 days or less:
        - Print message: move this to impulse buy area near register

    - Print "Overstocked Items"

    - Go through each item:
        - If actual stock is more than desired stock:
        - Print message: overstocked! Put this up front
 */


import java.time.LocalDate;
import java.util.ArrayList;

public class BodegaInventory {
    public static void main(String[] args) {
        ArrayList <Item> inventory = new ArrayList<>();

        inventory.add(new FoodItem("Milk",2.99,20,18,"Aisle 1",LocalDate.now().plusDays(5)));
        inventory.add(new FoodItem("Yoghurt", 1.50, 15, 10, "Aisle 1",LocalDate.now().plusDays(3)));
        inventory.add(new FoodItem("Canned Beans", 0.99, 30, 35, "Aisle 2", LocalDate.now().plusMonths(6)));
        inventory.add(new FoodItem("Dortos", 3.49, 25, 20, "Aisle 3", LocalDate.now().plusMonths(2)));


        inventory.add(new NonFoodItem("Paper Towels", 4.99, 40, 45, "Aisle 5"));
        inventory.add(new NonFoodItem("Scissors", 7.99, 10, 12, "Aisle 6"));
        inventory.add(new NonFoodItem("Lighter", 2.50, 15, 10, "Aisle 6"));
        inventory.add(new NonFoodItem("Cleaning Spray", 5.25, 20, 22, "Aisle 7"));

        System.out.println("=== Full Inventory ===");
        for (Item item : inventory){
            if (item instanceof FoodItem){
                FoodItem food = (FoodItem) item;
            if (food.getSellByDate()!= null){
                long daysToSellBy = java.time.temporal.ChronoUnit.DAYS.between(LocalDate.now(), food.getSellByDate());
                if (daysToSellBy <=7){
                    System.out.println(food.getBrand() + " -> Move to impluse buy near register!");
                }
            }
        }
    }

        System.out.println("\n=== Ovestocked Items ===");
        for (Item item: inventory){
            if (item.getStock()>item.getDesiredQty()){
                System.out.println(item.getBrand() + " -> Overstocked! Put up front");
            }
        }

    }   
    
}
