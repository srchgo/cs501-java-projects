import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class JobBoardApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Job> jobList = new ArrayList<>();
        Boolean running = true;

        System.out.println("Welcome to your easy job tracker - The Job Board!");

        while (running) {
            System.out.println("\nChoose an option from below: ");
            System.out.println("1.Add Full-Time job ");
            System.out.println("2. Add Internship");
            System.out.println("3. View all jobs");
            System.out.println("4. Exit");

            int choice = -1;

            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Invalid Input. Please enter a number between 1 to 4.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    try{
                        System.out.println("Enter job title: ");
                        String title = scanner.nextLine();
                        System.out.println("Enter company name: ");
                        String company = scanner.nextLine();
                        System.out.println("Enter pay: ");
                        double pay = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter Location (Remote/Onsite/Hybrid): ");
                        String locationType = scanner.nextLine();
                        Location location = new Location(locationType);
                        System.out.println("Enter Benefits (comma-seperated): ");
                        String benefits = scanner.nextLine();

                        Job fullTime = new FullTimeJob(title, company, pay, location, benefits);
                        jobList.add(fullTime);
                        System.out.println("Fulltime job added successfully!");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid Input. Please try again.");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Enter job title: ");
                        String title = scanner.nextLine();
                        System.out.println("Enter company name: ");
                        String company = scanner.nextLine();
                        System.out.println("Enter pay: ");
                        double pay = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter Location (Remote/Onsite/Hybrid): ");
                        String locationType = scanner.nextLine();
                        Location location = new Location(locationType);
                        System.out.println("Enter duration in weeks: ");
                        int duration = scanner.nextInt();
                        scanner.nextLine();

                        Job internship = new InternshipJob(title, company, pay, location, duration);
                        jobList.add(internship);
                        System.out.println("Internship job added successfully!");

                    } catch (InputMismatchException e){
                        System.out.println("Invalid input. please try again.");
                    }
                    break;

                case 3:
                    if (jobList.isEmpty()) {
                        System.out.println("No Joba added yet.");
                    } else {
                        System.out.println("\nAll Jobs: ");
                        for (Job job : jobList) {
                            System.out.println("------------");
                            System.out.println(job.toString());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Job Board!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please chose between 1 and 4.");
            }
            
        }
        scanner.close();
    }
}