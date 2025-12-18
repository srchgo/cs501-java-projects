/****************************
 * Truck.java
 * Represents a shipping truck
 * @author Tammy Pirmann
 * @version 20210425
 ****************************/
import java.util.ArrayList;
public class Truck implements Fuelable {
  private String driver;
  private int range;
  private int capacity;
  private int weight;
  private int fuelGallons;
  private ArrayList<Pallet> cargo = new ArrayList<Pallet>();
   
  public Truck(){
    driver = "NA";
    range = 0;
    capacity = 0;
    weight = 0;
    fuelGallons = 0;
  }
  public Truck(String driver, int range, int capacity, int weight, int fuel){
    this.driver = driver;
    this.range = range;
    this.capacity = capacity;
    this.weight = weight;
    fuelGallons = fuel;
  }
  public Truck(String driver, int range, int capacity, int weight, int fuel, ArrayList<Pallet> cargo){
    this.driver = driver;
    this.range = range;
    this.capacity = capacity;
    this.weight = weight;
    fuelGallons = fuel;
    this.cargo = cargo;
  }
   
  public void addFuel(int fuel){  // change made according to 2 tanks of 50 
    if (fuelGallons + fuel > 100){
        fuelGallons = 100;
    } else {
        fuelGallons += fuel;
    }
  }
  public int getFuel(){
    return fuelGallons;
  }
  public boolean load(Pallet p){
    boolean fits;
    if ((capacity - p.getVolume()) > 0){
      fits = cargo.add(p);
      capacity -= p.getVolume();
    }
    else {
      fits = false;
    }
    return fits;  
  }  
  public Pallet unload(Pallet p){
    int loc = cargo.indexOf(p);
    if (loc == -1)
        return null; //change based on white box test
    int vol = p.getVolume();
    capacity += vol;
    return cargo.remove(loc);     
  }

  public void setDriver(String driver){
    this.driver = driver;
  }
  public String getDriver(){
    return driver;
  }
  public void setRange(int range){
    this.range = range;
  }
  public int getRange(){
   return range;
  }
  public void setCapacity(int capacity){
    this.capacity = capacity;
  }
  public int getCapacity(){
    return capacity;
  }  
  private void setWeight(int weight){
    this.weight = weight;
  }
  public int getWeight(){
    return weight;
  }
}

