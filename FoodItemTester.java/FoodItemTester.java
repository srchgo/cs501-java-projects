import java.time.LocalDate;

public class FoodItemTester {

    public static void main(String[] args) {
        FoodItem milk = new FoodItem("Milk", 2.99, 20, 18, "Aisle 1", LocalDate.now().plusDays(5));

        if (milk.getBrand().equals("Milk"))
            System.out.println("Brand test passed.");
        else
            System.out.println("Brand test failed.");
        
        if (milk.getPrice()== 2.99)
            System.out.println("Price test passed.");
        else
            System.out.println("Price test failed.");

        if (milk.getDesiredQty() == 20)
            System.out.println("Desired quantity test passed.");
        else
            System.out.println("Desired quantity test failed.");

        if (milk.getStock()== 18)
            System.out.println("Actual stock test passed.");
        else
            System.out.println("Actual stock test failed.");

        if (milk.getLocation().equals("Aisle 1"))
            System.out.println("Location test passed.");
        else
            System.out.println("Location test failed.");

        if(milk.getSellByDate().equals(LocalDate.now().plusDays(5)))
            System.out.println("Sell-by date test passed.");
        else
            System.out.println("Sell-by date test failed.");
        
        if(!milk.isTaxable())
            System.out.println("IsTaxable test passed.");
        else
            System.out.println("IsTaxable test failed.");

        if(milk.toString().contains("Milk"))
            System.out.println("toString() test passed.");
        else
            System.out.println("toString() test failed.");
    }

}