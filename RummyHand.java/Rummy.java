public class Rummy {
    
    public static void main(String[] args) {
        RummyHand hand = new RummyHand();
        hand.deal();

        System.out.println("Original hand:");
        hand.printHand();

        System.out.println("\nSorted by Rank then Suit:");
        hand.sortByRankSuit();
        hand.printHand();

        System.out.println("\nSorted by Suit then Rank:");
        hand.sortBySuitRank();
        hand.printHand();

        System.out.println("\nExtracted Matches:");
        RummyHand matches = hand.extractMatches();
        matches.printHand();

        System.out.println("\nExtracted Sequences:");
        RummyHand sequences = hand.extractSequences();
        sequences.printHand();
    }
        
    }
       