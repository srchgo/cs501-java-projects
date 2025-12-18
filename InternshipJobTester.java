public class InternshipJobTester {
    public static void main(String[] args) {
        System.out.println("Testing InternshipJob class...");

        Location loc = new Location("Remote");
        InternshipJob intern = new InternshipJob("Dev Intern", "TechX", 0.0, loc, 16);

        if (intern.getTitle().equals("Dev Intern"))
            System.out.println("getTitle passed.");
        else
            System.out.println("getTitle failed.");

        if (intern.getCompany().equals("TechX"))
            System.out.println("getCompany passed.");
        else
            System.out.println("getCompany failed.");

        if (intern.getPay()==0.0)
            System.out.println("getPay passed.");
        else
            System.out.println("getPay failed.");

        if (intern.getLocation().getType().equals("Remote"))
            System.out.println("getLocation passed.");
        else
            System.out.println("getLocation failed.");

        if (intern.getDurationWeeks()== 16)
            System.out.println("getDurationWeeks passed.");
        else
            System.out.println("getDurationWeeks failed.");

        System.out.println("toString Outout: ");
        System.out.println(intern.toString());

        System.out.println("getJobDetails Output: ");
        System.out.println(intern.getJobDetails());
    }
    
}
