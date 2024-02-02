package Ex1;

public class TestingClass {
    public static void main(String[] args){
        Lab lab = new Lab(15);
        lab.insertStudent(new Student(1001, "Jon", "Snow", 20, 'M', 5, 8.5));
        lab.insertStudent(new Student(1002, "Daenerys", "Targaryen", 22, 'F', 4, 7.2));
        lab.insertStudent(new Student(1003, "Tyrion", "Lannister", 21, 'M', 6, 9.0));
        lab.insertStudent(new Student(1004, "Arya", "Stark", 23, 'F', 3, 4.8));
        lab.insertStudent(new Student(1005, "Tormund", "Giantsbane", 19, 'M', 7, 4.0));
        lab.insertStudent(new Student(1006, "Sansa", "Stark", 20, 'F', 5, 7.5));
        lab.insertStudent(new Student(1007, "Jaime", "Lannister", 22, 'M', 6, 4.2));
        lab.insertStudent(new Student(1008, "Cersei", "Lannister", 21, 'F', 4, 7.9));
        lab.insertStudent(new Student(1009, "Jorah", "Mormont", 24, 'M', 8, 8.7));
        lab.insertStudent(new Student(1010, "Brienne", "of Tarth", 20, 'F', 5, 8.3));

        lab.deleteStudent(1005);
        lab.searchStudent(1005);
        lab.searchStudent(1008);
        lab.attendance();
        System.out.println("Number of students who passed :" + lab.passed());
        System.out.println("Number of students who didn't passed :" + lab.not_passed());
        System.out.println("Average grade of this lab :" + myRound2Digit(lab.avgGrade()));
    }
    public static double myRound2Digit(double num) {
        return ((int)(num * 100))/100.0;
    }
}
