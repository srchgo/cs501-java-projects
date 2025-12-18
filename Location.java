public class Location {
    private String type;

    public Location(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return type;
    }
    
}
