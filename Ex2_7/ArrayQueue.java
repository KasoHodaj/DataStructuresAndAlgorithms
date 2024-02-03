package Ex2_7;

public class ArrayQueue implements Queue{
    private final int CAPACITY = 100;
    private Object[] myArr;
    private int front,rear;
    private int cap;

    public ArrayQueue(){}

    public ArrayQueue(int cap){
        this.cap = cap;
        front = -1;
        rear = -1;
        myArr = new Object[cap];
    }

    @Override
    public int size() {
        if(isEmpty())
            throw new QueueEmptyException("Queue is empty");
        return rear - front + 1;
    }

    @Override
    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    @Override
    public boolean isFull() {
        return rear + 1 == cap;
    }

    @Override
    public Object front() throws QueueEmptyException {
        if(isEmpty())
            throw new QueueEmptyException("Queue is emoty");
        return myArr[front];
    }

    @Override
    public void enqueue(Object item) throws QueueFullException {
        if(isFull())
            throw new QueueFullException("Queue overflow, cannot enqueue from a full queue");
        else if(isEmpty()){
            front = 0;
            rear = 0;
            myArr[rear] =  item;
        }
        else
            myArr[++rear] = item;
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if(isEmpty())
            throw new QueueEmptyException("Queue underflow: Cannot dequeue from an empty queue");
        else if(rear == front){
            int pos = front;
            front = -1;
            rear = -1;
            return myArr[pos];
        }
        else
            return myArr[front++];
    }

    public void printQ(){
        if(isEmpty())
            throw new QueueEmptyException("Queue is empty");
        for(int i=front; i<=rear; i++){
            System.out.println(myArr[i]);
        }
    }
}
