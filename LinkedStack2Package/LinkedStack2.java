package LinkedStack2Package;



public class LinkedStack2 implements Stack {
    private Node top;
    private int size;

    public LinkedStack2() {
        size = 0;
        top = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

   
    @Override
    public Object top() throws StackEmptyException {
        // Check if the stack is empty
        if (isEmpty())
            throw new StackEmptyException("Stack underflow");

        // Return the element at the top of the stack
        return top;
    }


    @Override
    public void push(Object item) {
        // Create a new node with the given item and the current top as its next node
        Node newNode = new Node(item, top);

        // Update the top reference to the newly added node
        top = newNode;

        // Increment the size of the stack
        size++;
    }

    @Override
    public Object pop() throws StackEmptyException {
        // Check if the stack is empty
        if (isEmpty())
            throw new StackEmptyException("Stack underflow");

        // Store the top node in a temporary variable
        Node returnNode = top;

        // Update the top reference to the next node in the stack
        top = top.getNext();

        // Decrement the size of the stack
        size--;

        // Return the item from the removed top node
        return returnNode.getItem();
    }

}
