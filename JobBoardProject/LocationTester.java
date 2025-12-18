public class LocationTester {
    public static void main(String[] args) {
        System.out.println("Testing Location class...");

        Location loc = new Location("Onsite");

        if (loc.getType().equals("Onsite"))
            System.out.println("getType passed.");
        else
            System.out.println("getType failed.");

        loc.setType("Remote");
        if (loc.getType().equals("Remote"))
            System.out.println("setType passed.");
        else
            System.out.println("setType failed.");

        System.out.println("toString output:");
        System.out.println(loc.toString());
    }
    
}
