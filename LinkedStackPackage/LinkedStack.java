package LinkedStackPackage;

public class LinkedStack implements Stack {
    private LinkedList S;

    public LinkedStack( ) {
        S=new LinkedList();
    }

    @Override
    public int size() {
        return S.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
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

        // Retrieve the top element from the linked list
        Object tmp = S.removeFirst();

        // Re insert the element at the top of the stack
        S.insertFirst(tmp);

        // Return the top element
        return tmp;
    }


    @Override
    public void push(Object item) {
        // Insert the item at the top of the stack using the linked list
        S.insertFirst(item);
    }


    @Override
    public Object pop() throws StackEmptyException {
        // Check if the stack is empty
        if (isEmpty())
            throw new StackEmptyException("Stack underflow");
        else
            // Remove and return the item from the top of the stack using the linked list
            return S.removeFirst();
    }

}