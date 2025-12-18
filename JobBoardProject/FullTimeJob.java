public class FullTimeJob extends Job {
    private String benefits;

    public FullTimeJob (String title, String company, double pay, Location location, String benefits){
        super (title, company, pay, location);
        this.benefits = benefits;
    }

    public String getBenefits(){
        return benefits;
    }
    
    public void setBenefits(String benefits){
        this.benefits = benefits;
    }

    @Override
    public String getJobDetails(){
        return "Benefits: " + benefits;
    }

    @Override 
    public String toString(){
        return super.toString() + "\n" + getJobDetails();
    }
}
