public class Card {
    private int rank;
    private String suit;

    public Card(int rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public String toString(){
        String [] rankNames = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        return rankNames [rank] + "of" + suit;
    }
}