package kaso;

public class MAIN {
	public static void main(String[] args) {
		Student s1 = new Student(12345, "John Doe", "Smith", 20, 'M', 85, 90.5);
		Student s2 = new Student(67890, "Mary Jane", "Johnson", 21, 'F', 90, 88.2);
		Student s3 = new Student(34567, "Peter Jones", "Brown", 22, 'M', 95, 89.7);
		Student s4 = new Student(23456, "Elizabeth White", "Williams", 19, 'F', 80, 92.4);
		Student s5 = new Student(13579, "David Miller", "Davis", 23, 'M', 75, 86.9);
		ArrayQueue myQ = new ArrayQueue();
		myQ.enqueue(s1);myQ.enqueue(s2);myQ.enqueue(s3);myQ.enqueue(s4);myQ.enqueue(s5);
		System.out.println(myQ.dequeue());
		System.out.println(myQ.front());
	}
}
