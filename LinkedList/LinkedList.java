package LinkedList;

public class LinkedList implements List {

    Node firstNode;
    private Node lastNode;

    public LinkedList() {
        firstNode = null;
        lastNode = null;
    }


    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public int size() {
        if (isEmpty()) //Check if the List is Empty
            return 0;

        int cnt = 0; //Initialize Counter and Current Node
        Node current = firstNode;

        while (current.getNext() != null) { //Traverse the List and Count Elements
            cnt++;
            current = current.getNext(); //Update the current node (current) to its next node
        }
        return cnt;
    }

    @Override
    public void insertFirst(Object data) { //ΕΙΣΟΔΟΣ ΣΤΟΙΧΕΙΟΥ ΑΠΟ ΤΗΝ ΑΡΧΗ ΤΗΣ ΛΙΣΤΑΣ
        if (isEmpty()) { // If the list is empty, create a new node and make it both the first and last node.
            firstNode = new Node(data, null);
            lastNode = firstNode;
        } else { // If the list is not empty, create a new node and insert it at the beginning of the list.
            Node newNode = new Node(data, null);
            newNode.setNext(firstNode); // Set the next reference of the new node to the current first node.
            firstNode = newNode; // Update the first node to be the new node.
        }
    }

    @Override
    public void insertLast(Object data) { //ΕΙΣΟΔΟΣ ΣΤΟΙΧΕΙΟΥ ΑΠΟ ΤΟ ΤΕΛΟΣ ΤΗΣ ΛΙΣΤΑΣ
        if (isEmpty()) { // If the list is empty, create a new node and make it both the first and last node.
            firstNode = new Node(data, null);
            lastNode = firstNode;
        } else { // If the list is not empty, create a new node and insert it at the end of the list.
            Node newNode = new Node(data, null);
            lastNode.setNext(newNode); // Set the next reference of the current last node to the new node.
            lastNode = newNode; // Update the last node to be the new node.
        }
    }

    @Override
    public Object removeFirst() throws ListEmptyException { //ΑΦΑΙΡΕΣΗ ΣΤΟΙΧΕΙΟΥ ΑΠΟ ΤΗΝ ΑΡΧΗ ΤΗΣ ΛΙΣΤΑΣ
        if (isEmpty()) //Check if the List is Empty
            throw new ListEmptyException("List is empty!!!");
        Object tmp = firstNode.getItem(); //Store Data of the First Node
        if (firstNode == lastNode) { //Check if there is only one Node in the List
            firstNode = null;
            lastNode = null; //the list is now empty
        } else //If there is more than one node in the list
            firstNode = firstNode.getNext(); //Update firstNode to be the next node in the list,
        // removing the current first node from the list

        return tmp; //Return the data stored in the temporary variable,
        // This is the data of the node that was removed from the front of the list
    }

    @Override
    public Object removeLast() throws ListEmptyException { //ΑΦΑΙΡΕΣΗ ΣΤΟΙΧΕΙΟΥ ΑΠΟ ΤΟ ΤΕΛΟΣ ΤΗΣ ΛΙΣΤΑΣ
        if (isEmpty())  //Check if empoty
            throw new ListEmptyException("list is empty !!!");
        Object tmp = lastNode.getItem(); //Store the data of the last node
        if (firstNode == lastNode) { //Check if there is only one node in the list
            firstNode = null;
            lastNode = null; //Now list is empty
        } else {
            Node curr = firstNode; //Create a temporary variable curr
            while (curr.getNext() != lastNode)
                curr.setNext(curr.getNext()); //This loop essentially moves curr to the node just before the last node
            lastNode = curr; //Update lastNode to be curr
            curr.setNext(null); //Set the next reference of the new last node to null,
            // effectively removing the current last node from the list
        }

        return tmp; //return the data stored in the temporary variable,
        // This is the data of the node that was removed from the end of the list
    }



    public void traverseList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node curr = firstNode;
        while (curr != null) {
            System.out.println(curr.getItem());
            curr = curr.getNext();
        }
    }

}
