package LinkedList;


    public class MAIN {
        public static void main(String[] args) {
            LinkedList studentList = new LinkedList();

            // Insert students into the list
            studentList.insertLast(new Student(1, "John", "A", 20, 'M', 0, 8.5));
            studentList.insertLast(new Student(2, "James", "B", 22, 'F', 2, 6.7));
            studentList.insertLast(new Student(3, "Bo", "C", 21, 'M', 1, 9.2));
            studentList.insertLast(new Student(4, "Alice", "D", 23, 'F', 3, 7.8));


        }
    }


