public class JobTester {
    public static void main(String[] args) {
        System.out.println("Testing Job class (via FullTimeJob subclass)...");

        Location testLocation = new Location ("Remote");

        FullTimeJob job = new FullTimeJob("UX Designer", "Google", 130000.0, testLocation, "Health + Stock Options");

        if (job.getTitle().equals("UX Designer")) 
            System.out.println("getTitle Passed.");
        else
            System.out.println("getTitle failed.");

        if (job.getCompany().equals("Google"))
            System.out.println("getCompany Passed.");
        else
            System.out.println("getCompany failed.");

        if (job.getPay()==130000.0)
            System.out.println("getPay Passed.");
        else
            System.out.println("getPay failed.");

        if (job.getLocation().getType().equals("Remote"))
            System.out.println("getLocation Passed.");
        else
            System.out.println("getLocation failed.");

        job.setTitle("Frontend Developer");
        job.setCompany("Meta");
        job.setPay(125000.0);
        job.setLocation(new Location("Hybrid"));

        if  (job.getTitle().equals("Frontend Developer")) 
        System.out.println("setTitle Passed.");
        else
        System.out.println("setTitle failed.");

    if (job.getCompany().equals("Meta"))
        System.out.println("seCompany Passed.");
    else
        System.out.println("setCompany failed.");

    if (job.getPay()==125000.0)
        System.out.println("setPay Passed.");
    else
        System.out.println("setPay failed.");

    if (job.getLocation().getType().equals("Hybrid"))
        System.out.println("setLocation Passed.");
    else
        System.out.println("setLocation failed.");

    System.out.println("toString output: ");
    System.out.println(job.toString());

    }
    
}
