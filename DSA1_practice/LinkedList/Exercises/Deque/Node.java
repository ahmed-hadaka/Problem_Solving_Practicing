package Exercises.Deque;

/**
 *
 * @AhmedHadaka
 */
public class Node {
    
    private int iData;
    private Node next;
    private Node previous;

    public Node(int iData) {
        this.iData = iData;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getiData() {
        return iData;
    }

    @Override
    public String toString() {
        return "iData= " + iData + ", ";
    }

}
