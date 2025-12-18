/****************************
 * Van.java
 * Represents a self driving electric vehicle for pallet delivery
 * @author Tammy Pirmann
 * @version 20210425
 **************************/
import java.util.ArrayList;
public class Van {
  private int range;
  private int capacity;
  private ArrayList<Pallet> cargo = new ArrayList<Pallet>();
  
  public Van(){
    range = 0;
    capacity = 0;
  }
  public Van(int range, int capacity){
    this.range = range;
    this.capacity = capacity;
  }
  public Van(int range, int capacity, ArrayList<Pallet> cargo){
    this.range = range;
    this.capacity = capacity;
    double cargoCapacity = 0; 
    for (Pallet p : cargo)
        cargoCapacity += p.getVolume();
    if (cargoCapacity < capacity)
        this.cargo = cargo;
  }
  
  public int getCapacity()
  {
    return this.capacity;
  }

  public int getRange()
  {
    return this.range;
  }

  public ArrayList <Pallet> getCargo()
  {
    return this.cargo;
  }

  public boolean load(Pallet p){
    boolean fits;
    for (Pallet pallet : cargo)
    {
        if (pallet == p)
            return false;
    } 
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
        return null;
    int vol = p.getVolume();
    capacity += vol;
    return cargo.remove(loc);     
  }

  public String toString()
  {
    return "Capacity: " + this.capacity + " Range: " + this.range;
  }
}

