package Ex2_7;

public interface Queue {
    public int size( );
    // Returns the size of the queue
    public boolean isEmpty( );
    // Returns true if the queue is empty
    public boolean isFull();
    // Returns true if the queue is full
    public Object front( ) throws QueueEmptyException;
    // Returns the first element of the queue
    public void enqueue(Object item) throws QueueFullException;
    // Adds an element at the end of the queue
    public Object dequeue( ) throws QueueEmptyException;
// Removes and returns the first element of the queue
}
