import java.util.ArrayList;

public class VanTester {

    public static void main(String[] args) {

        ArrayList <Pallet> myCargo = new ArrayList <Pallet>();
        Pallet myPallet = new Pallet(3, 3, 3, "Drexel", "Penn State"); 
        Pallet secondPallet = new Pallet(4, 3, 6, "Philly", "Tokyo");
        Pallet newPallet = new Pallet(6, 6, 6, "Philly", "San Diego");

        myCargo.add(myPallet); 
        myCargo.add(secondPallet);

        Van deafaultVan = new Van(); 
        Van myVan = new Van(200, 500); 
        Van thirdVan = new Van(200, 300, myCargo);
        Van smallVan = new Van(100, 50, myCargo);

        if (deafaultVan.getCapacity() == 0 && deafaultVan.getRange() == 0)
            System.out.println("Default Van constructor passed.");
        else 
            System.out.println("Default Van Constructor failed");

        if (myVan.getCapacity() == 500 && myVan.getRange() == 200)
            System.out.println("Constructor with range and capacity passed.");
        else 
            System.out.println("Constructor with range and capacity faied.");
        
        if (thirdVan.getRange() == 200 && thirdVan.getCapacity() == 300 && thirdVan.getCargo() == myCargo)
            System.out.println("Constructor with range, capacity and cargo ArrayList passed");
        else 
            System.out.println("Constructor with range, capacity and cargo ArrayList failed");
        
        if (smallVan.getRange() == 100 && smallVan.getCapacity() == 50 && smallVan.getCargo().isEmpty())
            System.out.println("Costructor with range, capacity and cargo ArrayList that is too big passed.");
        else    
            System.out.println("Costructor with range, capacity and cargo ArrayList that is too big failed.");

        if (deafaultVan.load(secondPallet))
            System.out.println("Loading a van with no capacity failed.");
        else   
            System.out.println("Loading a van with no capacity passed.");
        
        if (thirdVan.load(newPallet))
            System.out.println("Loading a van with capacity passed.");
        else    
            System.out.println("Loading a van with capacity failed.");

        if (thirdVan.load(myPallet))
            System.out.println("Loading a van with a pallet that is already on the van failed.");
        else   
            System.out.println("Loading a van with a pallet that is already on the van passed.");

        if (thirdVan.unload(myPallet) == myPallet)
            System.out.println("Unloading a pallet that exists passed");
        else 
            System.out.println("Unloading a pallet that exists failed");

        if (smallVan.unload(newPallet) == null)
            System.out.println("Unloading a pallet that does not exists passed");
        else
            System.out.println("Unloading a palled that does not exist failed");

        if (myVan.toString().equals("Capacity: 500 Range: 200"))
            System.out.println("toString() passed.");
        else
            System.out.println("toString() failed.");



        
    }
    
}

