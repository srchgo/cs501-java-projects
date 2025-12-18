public class LinkedListNode {

    Card data;
    LinkedListNode next;

    public LinkedListNode(Card data){
        this.data = data;
        this.next = null;
    }

    public Card getData() {
        return data;

    }

    public LinkedListNode getNext(){
        return next;
    }

    public void setNext(LinkedListNode next){
        this.next = next;
    }
    
}
