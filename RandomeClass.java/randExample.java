import java.util.Random; 

public class randExample {

    public static void main(String[] args) {
        
        Random myRandom = new Random();
        for (int i = 0; i < 100; i++); 
        {
            System.out.println(myRandom.nextInt(11)+10);
        }

        System.out.printf("string contains both literal characters and format specifiers like %d for digits or %s for " +
        " strings, it can also contain escape characters like \t to  output. \n%d\t%5d", 1, "yes", 22, 45873);
        System.out.println();
        
    }

    
}