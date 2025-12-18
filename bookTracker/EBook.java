/* Start EBook class
 * Create private variables: title, author, format, location, isOwned, isRead
 * Create a constructor to set all these values when a new EBook is made 
 * Write getters and setters for each variable(to get or change value)
 * Write toString() method to print book info:
 * if isOwned is true, say "Owns the book"
 * if false, say "Does not own the book"
 * if isRead is true, say "Completed"
 * if false, say "want to read"
 * end of EBook class 
 */

public class EBook {

    private String title;
    private String author;
    private String format;
    private String location;
    private boolean isOwned;
    private boolean isRead;
  

    // Constructor
    public EBook(String title, String author, String format, String location, boolean isOwned, boolean isRead) {
        this.title = title;
        this.author = author;
        this.format = format;
        this.location = location;
        this.isOwned = isOwned;
        this.isRead = isRead;
        
    }
    
    // setters and getters 
    public String getTitle (){
        return title; 
    }

    public void setTitle (String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor (String author){
        this.author = author;
    }

    public String getFormat (){
        return format;
    }
    
    public void setFormat(String format){
        this.format = format;
    }

    public String getLocation (){
        return location;
    }

    public void setLocation (String location){
        this.location = location;
    }

    public Boolean getIsOwned (){
        return isOwned;
    }

    public void setIsOwned (boolean owned){
        isOwned = owned;
    }

    public Boolean getIsRead (){
        return isRead;
    }

    public void setIsRead (boolean read){
        isRead = read;
    }

    
    // Mark book as read
    public String toString() {
        String ownership = isOwned? "Owns the book" : "Does not own the book";
        String readingStatus = isRead ? "Completed" : "Want to read";

        return "\nTitle: " + title + 
               "\nAuthor: " + author +
               "\nFormat: " + format +
               "\nLocation: " + location +
               "\nOwned: " + ownership +
               "\nRead: " + readingStatus;
           
    }


}
