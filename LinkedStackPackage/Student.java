package LinkedStackPackage;


public class Student {
    private int am;
    private String name;
    private String surname;
    private double age;
    private char gender;
    private int absences;
    private double grade;

    public Student(){}

    public Student(int am, String name, String surname, double age,
                   char gender, int absences, double grade){
        this.am = am;
        this.name = name;
        this.surname = surname;
        this.age= age;
        this.gender = gender;
        this.absences = absences;
        this.grade = grade;
    }

    public void setAm(int am){
        this.am = am;
    }
    public int getAm(){
        return am;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


    public String parousiologio(){
        return "am=" + am +
                ", surname='" + surname  +
                ", name='" + name +
                ", absences=" + absences +
                ", grade=" + grade;
    }

    @Override
    public String toString() {
        return
                "am=" + am +
                        ", name='" + name  +
                        ", surname='" + surname  +
                        ", age=" + age +
                        ", gender=" + gender +
                        ", absences=" + absences +
                        ", grade=" + grade;
    }
}
