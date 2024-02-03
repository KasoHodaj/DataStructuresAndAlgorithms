package LinkedStackPackage;

public interface Stack {
    public int size( );
    // Returns the size of the Stack
    public boolean isEmpty( );
    // Returns true if the Stack is empty
    public boolean isFull( );
    // Returns true if the Stack is full
    public Object top( ) throws StackEmptyException;
    // Returns the top item of the Stack
    public void push(Object item) throws StackFullException;
    // Adds a new item into the Stack
    public Object pop( ) throws StackEmptyException;
// Removes the top item of the Stack
}
