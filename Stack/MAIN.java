package kaso;

public class MAIN {
	public static void main(String[] args) {
		Student student1 = new Student(1, "John", "Doe", 20, 'M', 5, 85.5);
		Student student2 = new Student(2, "Jane", "Smith", 22, 'F', 3, 78.2);
		Student student3 = new Student(3, "Bob", "Johnson", 19, 'M', 7, 92.0);
		ArrayStack myStack = new ArrayStack(2);
		try {
			myStack.push(student1);
			myStack.push(student2);
			myStack.push(student3);
		}
		catch (StackFullException e) {
			System.out.println("Stack got full before inserting all students");
		}
		
		try {
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			System.out.println("Size of stack :" + myStack.size());
			System.out.println("Is the stack empty ? " + myStack.isEmpty());
			System.out.println("Is the stack full ? " + myStack.isFull());
		}
		catch (StackEmptyException e) {
			System.out.println("Could not remove a student because the stack is empty.");
		}
		
	}
}
