public class InternshipJob extends Job {
    private int durationWeeks;

    public InternshipJob (String title, String company, double pay, Location location, int durationWeeks){
        super (title, company, pay, location);
        this.durationWeeks = durationWeeks;
    }

    public int durationWeeks(){
        return durationWeeks;
    }
    
    public void durationWeeks(int durationWeeks){
        this.durationWeeks = durationWeeks;
    }

    public int getDurationWeeks(){
        return durationWeeks;
    }

    public void setDurationWeeks(int durationWeeks){
        this.durationWeeks = durationWeeks;
    }

    @Override
    public String getJobDetails(){
        return "Internship duration: " + durationWeeks + "weeks";
    }

    @Override 
    public String toString(){
        return super.toString() + "\n" + getJobDetails();
    }
}
