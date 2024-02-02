package kaso;

public class ArrayStack implements Stack{
	public static final int CAPACITY = 100;
	private Object [] arr;
	private int top;
	private int cap;
	
	public ArrayStack( ) {
		this(CAPACITY);
	}
	
	public ArrayStack(int cap) {
		top = -1;
		this.cap = cap;
		arr = new Object[cap];
	}
	
	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top + 1 == cap;
	}

	@Override
	public Object top() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("cannot return top , stack is empty");
		return arr[top];
	}
	
	public void prinStack() {
		if (isEmpty())
			System.out.println("Stack is empty");
		for (int i = top ; i >= 0 ; i--) 
			System.out.println(arr[i]);
	}

	@Override
	public void push(Object item) throws StackFullException {
		if (isFull())
			throw new StackFullException("cannot push , stack is full");
		arr[++top] = item;
	}

	@Override
	public Object pop() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("cannot pop , stack is empty");
		return arr[top--];
	}
}
