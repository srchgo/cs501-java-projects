/* Make an item that isn't food:
     - After creation, save:
     - location, desired stock, price, and brand
     It can inform you of:
     The brand name, price, desired stock quantity, actual stock quantity, and location of the product in question
     (no sell-by date, just returns nothing) that it IS taxed
     It can be described as a series of specifics
*/


import java.time.LocalDate;

public class NonFoodItem implements Item {
    private String brand;
    private double price;
    private int desiredStock;
    private int actualStock;
    private String location;

    public NonFoodItem (String brand, double price, int desiredStock, int actualStock, String location){
        this.brand = brand;
        this.price = price;
        this.desiredStock = desiredStock;
        this.actualStock = actualStock;
        this.location = location;
    }

    public String getBrand(){
        return brand;
    }

    public double getPrice(){
        return price;
    }

    public int getDesiredQty(){
        return desiredStock;
    }

    public int getStock(){
        return actualStock;
    }
    
    public String getLocation(){
        return location;
    }
    
    public boolean isTaxable(){
        return true;
    }

    public LocalDate getSellByDate(){
        return null;
    }

    public String toString(){
        return brand + "(Non-Food), $ " + price + ", stock: " + actualStock + "/" + desiredStock + ", location: " + location;
    }
}
    

