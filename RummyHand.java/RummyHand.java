import java.util.*;

public class RummyHand {
    private LinkedListNode head;

    public void deal() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        List<Card> deck = new ArrayList<>();

        for (String suit : suits) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new Card(rank, suit));
            }
        }

        Collections.shuffle(deck);

        for (int i = 0; i < 5; i++) {
            append(deck.get(i));
        }
    }

    public void append(Card card) {
        LinkedListNode newNode = new LinkedListNode(card);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printHand() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void sortByRankSuit() {
        List<Card> temp = toList();
        temp.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        fromList(temp);
    }

    public void sortBySuitRank() {
        List<Card> temp = toList();
        temp.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getRank));
        fromList(temp);
    }

    private List<Card> toList() {
        List<Card> list = new ArrayList<>();
        LinkedListNode current = head;
        while (current != null) {
            list.add(current.getData());
            current = current.getNext();
        }
        return list;
    }

    private void fromList(List<Card> list) {
        head = null;
        for (Card card : list) {
            append(card);
        }
    }

    public RummyHand extractMatches() {
        Map<Integer, List<Card>> rankGroups = new HashMap<>();
        LinkedListNode current = head;
        while (current != null) {
            Card card = current.getData();
            rankGroups.computeIfAbsent(card.getRank(), k -> new ArrayList<>()).add(card);
            current = current.getNext();
        }

        RummyHand matches = new RummyHand();
        for (List<Card> group : rankGroups.values()) {
            if (group.size() >= 3) {
                for (Card c : group) {
                    matches.append(c);
                }
            }
        }
        return matches;
    }

    public RummyHand extractSequences() {
        List<Card> sorted = toList();
        sorted.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getRank));

        RummyHand sequences = new RummyHand();
        List<Card> sequence = new ArrayList<>();

        for (int i = 0; i < sorted.size(); i++) {
            Card current = sorted.get(i);
            if (sequence.isEmpty()) {
                sequence.add(current);
            } else {
                Card last = sequence.get(sequence.size() - 1);
                if (current.getSuit().equals(last.getSuit()) && current.getRank() == last.getRank() + 1) {
                    sequence.add(current);
                } else if (current.getSuit().equals(last.getSuit()) && current.getRank() == last.getRank()) {
                    continue; // Skip duplicate ranks in same suit
                } else {
                    if (sequence.size() >= 3) {
                        for (Card c : sequence) {
                            sequences.append(c);
                        }
                    }
                    sequence.clear();
                    sequence.add(current);
                }
            }
        }

        if (sequence.size() >= 3) {
            for (Card c : sequence) {
                sequences.append(c);
            }
        }

        return sequences;
    }
}