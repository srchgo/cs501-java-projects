/****************************
 * Boat.java
 * Represents a shipping container boat
 * @author Tammy Pirmann
 * @version 20210425
 ****************************/
import java.util.ArrayList;
public class Boat implements Fuelable {
  private String captain;
  private int range;
  private int capacity;
  private int topSpeed;
  private int fuelGallons;
  private ArrayList<Pallet> cargo = new ArrayList<Pallet>();
   
  public Boat(){
    captain = "NA";
    range = 0;
    capacity = 0;
    topSpeed = 0;
    fuelGallons = 0;
  }
  public Boat(String captain, int range, int capacity, int speed, int fuel){
    this.captain = captain;
    this.range = range;
    this.capacity = capacity;
    topSpeed = speed;
    fuelGallons = fuel;
  }
  public Boat(String captain, int range, int capacity, int speed, int fuel, ArrayList<Pallet> cargo){
    this.captain = captain;
    this.range = range;
    this.capacity = capacity;
    topSpeed = speed;
    fuelGallons = fuel;
    this.cargo = cargo;
  }

  public void addFuel(int fuel){
    if (fuelGallons + fuel >= 100)
        fuelGallons = 100;
    fuelGallons += fuel;
  }
  public int getFuel(){
    return fuelGallons;
  }
  
  public String dock(){
    return "Docking procedures go here";
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
    int vol = p.getVolume();
    capacity += vol;
    return cargo.remove(loc);     
  }
  public void setCaptain(String cap){
    captain = cap;
  }
  public String getCaptain(){
    return captain;
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
  private void setTopSpeed(int speed){
    topSpeed = speed;
  }
  public int getTopSpeed(){
    return topSpeed;
  }
}

