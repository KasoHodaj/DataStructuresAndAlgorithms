package LinkedStackPackage;

public class Node {

    //Instance fields
    private Object data;
    private Node next;

    public Node(){};
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Instance methods
    public Object getItem( ){
        return data;
    }
    public Node getNext( ){
        return next;
    }
    public void setItem(Object d){
        this.data = data;
    }
    public void setNext(Node n){
        this.next = next;
    }
    public String toString( ){
        return "Data = " + data;
    }
}
