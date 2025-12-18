/* Start main method
 * Create three EBook objects with title, author, format, location, isOwned and isRead 
 * Print details before reading for book 1,2 and 3 using toString()
 * End of main method
 */


public class EBookTracker {

    public static void main(String[] args) {
        
        //create three Ebooks 
        EBook book1 = new EBook("Atomic Habits", "James Clear" , "EPUB", "Cloud", true, false);
        EBook book2 = new EBook("The Alchemist", "Paulo Coelho" , "PDF", "phone", false, true);
        EBook book3 = new EBook("Clean Code", "Robert C. Martin" , "MOBI", "Cloud", true, true);

        // Print details before marking as read
        System.out.println("Details of Book 1:");
        System.out.println(book1);

        // Print other books
        System.out.println("\nDetails of Book 2:");
        System.out.println(book2);

        System.out.println("\nDetails of Book 3:");
        System.out.println(book3);


    }
    
}

