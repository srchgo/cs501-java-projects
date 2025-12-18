import java.util.ArrayList;

public class TruckTester {

    public static void main(String[] args) {
        
        ArrayList<Pallet> myCargo = new ArrayList<>();
        Pallet myPallet = new Pallet(3,3,3, "Drexel","Penn State");
        Pallet secondPallet = new Pallet(4,3,6,"Philly","Tokyo");
        Pallet newPallet = new Pallet(6,6,6, "Philly","San Diego");

        myCargo.add(myPallet);
        myCargo.add(secondPallet);

        Truck defaulTruck = new Truck();
        Truck myTruck = new Truck("Alex", 300,700,1000,50);
        Truck thirdTruck = new Truck("Alex", 300,700,1000,50, myCargo);

        if(defaulTruck.getCapacity()== 0 && defaulTruck.getRange() == 0 && defaulTruck.getFuel() == 0)
            System.out.println("Default truck constructor passed.");
        else
            System.out.println("Default truck constructor failed.");

        if(myTruck.getCapacity() == 700 && myTruck.getRange() == 300 && myTruck.getFuel() == 50)
            System.out.println("Constructor with driver, range, capacity, weight, fuel passed.");
        else
            System.out.println("Constructor with driver, range, capacity, weight, fuel failed.");

        if(thirdTruck.getCapacity() == 700 && thirdTruck.getRange() == 300 && thirdTruck.getFuel() == 50)
            System.out.println("Constructor with driver, range, capacity, weight, fuel, cargo passed.");
        else
            System.out.println("Constructor with driver, range, capacity, weight, fuel, cargo failed.");

        myTruck.addFuel(20);
        if(myTruck.getFuel() == 70)
            System.out.println("addFuel() method passed.");
        else
            System.out.println("addFuel() method failed.");

        if(myTruck.load(newPallet))
            System.out.println("Loading pallet into truck passed.");
        else
            System.out.println("Loading pallet into truck failed.");

        myTruck.addFuel(50);
        if (myTruck.getFuel() == 100)
            System.out.println("addFuel() cap at 100 gallons passed.");
        else
            System.out.println("addFuel() cap at 100 gallons failed.");

        myTruck.addFuel(10);
        if (myTruck.getFuel()== 100) 
            System.out.println("addFuel() no overfill beyond 100 paased.");
        else
            System.out.println("addFuel() no overfill beyond 100 failed.");
        
        Truck smallTruck = new Truck("Sam", 200, 10, 800, 20);

        if(!smallTruck.load(newPallet))
            System.out.println("Loading oallet into small truck (too small) passed.");
        else
            System.out.println("Loading oallet into small truck (too small) failed.");
        
        if(myTruck.unload(newPallet)== newPallet)
            System.out.println("Unloading pallet that exists passed.");
        else
            System.out.println("Unloading pallet that exists failed.");

        if(smallTruck.unload(newPallet)== null)
            System.out.println("Unloading pallet that doesnt exists passed.");
        else
            System.out.println("Unloading pallet that doesnt exists failed.");
        
        myTruck.setDriver("Jordan");
        if (myTruck.getDriver().equals("Jordan"))
            System.out.println("set/getDriver passed.");
        else
            System.out.println("set/getDriver failed.");

        myTruck.setRange(500);
        if(myTruck.getRange()== 500)
            System.out.println("set/getRange passed.");
        else
            System.out.println("set/getRange failed.");
        
        myTruck.setCapacity(800);
        if(myTruck.getRange()== 800)
            System.out.println("set/getCapacity passed.");
        else
            System.out.println("set/getCapacity failed.");

        if(myTruck.getWeight()== 1000)
            System.out.println("getWeight passed.");
        else
            System.out.println("getWeight failed.");
    }
}