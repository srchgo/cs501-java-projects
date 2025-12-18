/*Make a FoodItem: - After it is made, store:
     - brand, cost, location, intended and actual stock, and sell-by date
     It can provide you with the following information: 
     - its brand name 
     - its price 
     - its intended stock quantity 
     - its actual stock quantity
     - where it is
     The sell-by date and the fact that it is not taxable
     It can be described as a series of specifics
 */


import java.time.LocalDate;


public class FoodItem implements Item{
    private String brand;
    private double price;
    private int desiredStock;
    private int actualStock;
    private String location;
    private LocalDate sellByDate;

    public FoodItem (String brand, double price, int DesiredStock, int actualStock, String location, LocalDate sellByDate){
        this.brand = brand;
        this.price = price;
        this.desiredStock = DesiredStock;
        this.actualStock = actualStock;
        this.location = location;
        this.sellByDate = sellByDate;
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
        return false;
    }

    public LocalDate getSellByDate(){
        return sellByDate;
    }

    public String toString(){
        return brand + " (Food), $ " + price + " ,stock: " + actualStock + "/" + desiredStock + ", sell by: " + sellByDate + ", location: " + location;
    }
}
    