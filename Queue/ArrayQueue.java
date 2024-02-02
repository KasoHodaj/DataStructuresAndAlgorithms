package kaso;

public class ArrayQueue implements Queue{
	private final int CAPACITY = 100; 
	private int front,rear;
	private int cap;
	private Object [] queueArray;
	
	public ArrayQueue() {
		queueArray = new Object[CAPACITY];
		front = -1;
		rear = -1;
		cap = CAPACITY;
	}
	
	public ArrayQueue(int cap) {
		front = -1;
		rear = -1;
		this.cap = cap;
		queueArray = new Object[cap];
	}

	@Override
	public int size() { // An empty queue has a size of 0.
		if (isEmpty())
			return 0;
		return rear - front + 1; // If the queue is not empty, it calculates the size using the formula rear - front + 1
	}

	@Override
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	@Override
	public boolean isFull() {
		return rear + 1 == cap;
	}

	@Override
	public Object front() throws QueueEmptyException {
		if (isEmpty())
			throw new QueueEmptyException("Queue is empty");
		return queueArray[front];
	}

	@Override
	/*
	 * The enqueue method is a queue implementation and is responsible for adding an element
	 * to the rear of the queue.
	 */
	public void enqueue(Object item) throws QueueFullException {
		if (isFull()) // If the Queue is full, it throws the exception message
			throw new QueueFullException("Queue is full - Queue overflow");
		else if (isEmpty()) { //if the Queue is empty, then it sets both front and rear to '0'. 
			front = 0;		// and then the element is added on the first position of the array.
			rear = 0;
			queueArray[rear] = item;
		}
		else			// If the Queue is not empty, it increments the 'rear' index and adds the element at the next position
			queueArray[++rear] = item;
	}

	@Override 
	/*
	 * The enqueue method is a queue implementation and is responsible for removing an element
	 * from the front of the Queue.
	 */
	public Object dequeue() throws QueueEmptyException {
		if (isEmpty())  // If the Queue is empty it throws the exception msg "Queue underflow".
			throw new QueueEmptyException("Queue is empty - queue underflow");
		else if (front == rear) {
			int pos = front; 	// If the queue is not empty, it checks if the front and rear pointers are pointing to the same element.
			rear = -1;			//If they are, it means there is only one element in the queue. 
			front = -1;			// Then it sets both the front and the rear to '-1'.
			
			return queueArray[pos]; // Finally, it returns the retrieved element.
		}
		return queueArray[front++]; // If the Queue has more than one item, it retrieves the element at the front index
									// in the array and increments the front pointer.
	}
	
	
	
}
