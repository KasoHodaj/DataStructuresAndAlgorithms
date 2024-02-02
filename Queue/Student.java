package kaso;


public class Student {
	private int am;
	private String name;
	private String surname;
	private int age;
	private char gender;
	private int parousies;
	private double grade;
	
	public Student() {
	}
	
	public Student(int am, String name, String surname, int age, char gender, int parousies, double grade) {
		this.am = am;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.parousies = parousies;
		this.grade = grade;
	}

	public int getAm() {
		return am;
	}

	public void setAm(int am) {
		this.am = am;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getParousies() {
		return parousies;
	}

	public void setParousies(int parousies) {
		this.parousies = parousies;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "am=" + am + ", name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender
				+ ", parousies=" + parousies + ", grade=" + grade;
	}
}
