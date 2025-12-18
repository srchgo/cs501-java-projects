/*Class Ingredient
 * Private fields: name, unit, calories, type 
 * Constructor to set all fields 
 * Set getters and setters for each field 
 * toString() method to return name, unit, calories 
 */

 public class Ingredient {

    private String name;
    private String unit;
    private double calories;
    private String type;

    public Ingredient (String name, String unit, double calories, String type){
        this.name = name;
        this.unit = unit;
        this.calories = calories;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getUnit(){
        return unit;
    }

    public double getCalories(){
        return calories;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return name + "(" + unit + ") - " + calories + " calories - " + type;
    }

 }