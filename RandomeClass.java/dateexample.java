import java.util.Date;

public class dateexample {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        // Date date2 = date1; 
        
        System.out.println("Date1 is " + date1);
        System.out.println("Date2 is " + date2);
        System.out.println();
      
        date1.setTime(24*30*60*60*1000l); // sets date in milliseconds since Jan 1, 1970
        System.out.println("Date1 is " + date1);
        System.out.println("Date2 is " + date2);
        System.out.println();

        long msInYear = 1000*60*60*24*365l;
        date2.setTime(msInYear);
        System.out.println("Date1 is " + date1);
        System.out.println("Date2 is " + date2);
    }
  
}

