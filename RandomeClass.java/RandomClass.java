import java.util.Random; 

public class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random(); 
        int num = rand.nextInt(35) + 21;
        System.out.println("Using random class : " + num);
    }
    
}
