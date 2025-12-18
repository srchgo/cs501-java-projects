public class FullTimeJobTester {
    public static void main(String[] args) {
        System.out.println("Testing FullTimeJob class...");

        Location loc = new Location("Hybrid");
        FullTimeJob job = new FullTimeJob("Software engineer", "OpenAI", 120000.0, loc, "Health + PTO");

        if (job.getTitle().equals("Software engineer"))
            System.out.println("getTitle passed.");
        else 
            System.out.println("getTitle failed.");

        if (job.getCompany().equals("OpenAI"))
            System.out.println("getCompany passed.");
        else
            System.out.println("getCompany failed.");
        
        if (job.getPay() == 120000.0)
            System.out.println("getPay passed.");
        else
            System.out.println("getPay failed.");
        
        if (job.getLocation().getType().equals("Hybrid"))
            System.out.println("getLocation passed.");
        else
            System.out.println("getLocation failed.");
        
        if (job.getBenefits().equals("Health + PTO"))
            System.out.println("getBenefits passed.");
        else
            System.out.println("getBenefits failed.");

        System.out.println("toString Output: ");
        System.out.println(job.toString());

        System.out.println("getJobDetails Output: ");
        System.out.println(job.getJobDetails());

    }
    
}
