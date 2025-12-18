public abstract class Job{
    protected String title;
    protected String company;
    protected double pay;
    protected Location location; 

    public Job(String title, String company, double pay, Location location){
        this.title = title;
        this.company = company;
        this.pay = pay;
        this.location = location;
    }

    public String getTitle(){
        return title;
    }

    public String getCompany(){
        return company;
    }

    public double getPay(){
        return pay;
    }

    public Location getLocation(){
        return location;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCompany( String company){
        this.company = company;
    }

    public void setPay(double pay){
        this.pay = pay;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public abstract String getJobDetails();

    @Override 
    public String toString(){
        return String.format("Title: %s\nCompany: %s\nPay: $%.2f\nLocation: %s" , title, company, pay, location);
    }
}