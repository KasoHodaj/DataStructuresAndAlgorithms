package Ex1;

public class Lab {

    private Student [] students; //array type Student
    private int size;


    //Step 0: Create an array!
    //Lab lab = new Lab(15); == public Lab(15){...}
    public Lab(int size){
        this.size = size;
        students = new Student[size];
        for(int i=0; i<students.length; i++)
            students[i] = null;
    }


    public void insertStudent(Student s){
        int posToInsert = -1;
        for(int i=0; i<students.length; i++){
            if(students[i] == null){
                posToInsert = i;
                break;
            }
        }
        if(posToInsert == -1)
            System.out.println("Lab is full");
        else
            students[posToInsert] = s;
    }

    public void deleteStudent(int am){
        int i, k;
        boolean deleted = false;
        for(i=0; i<students.length; i++){
            if(am == students[i].getAm()){ //Search for a student with this id
                System.out.println("Deleting student: " + students[i].toString());  //Prints the student
                deleted = true;
                break;
            }
        }

        /*
        In an array of 10 elements, if i=5 then k=6 then the element at its right(of the deleted will move on the left
        replacing the previous element! Subsequently all the elements will move to the left!!
         */
        for(k=i+1; k< students.length; k++){ //To make the delete we must shift the elements one position to the left
            if(students[k] == null){
                students[k-1] = null;
                break;
            }
            students[k-1] = students[k];
        }
        if (k == students.length-1 && deleted)
            students[k-1] = null;
        if(!deleted)
            System.out.println("No student with this id");
    }

    public void searchStudent(int am){
        for(int i=0; i<students.length; i++){
            if(students[i] == null) { //To terminate the loop if its empty or not found
                System.out.println("No student with this ID");
                break;
            }
            if(students[i].getAm() == am){
                System.out.println("Student found: " + students[i].toString());
                return;
            }
        }
    }

    public void attendance(){
        for(int i=0; i< students.length; i++){
            if(students[i] == null){
                break;
            }
            System.out.println(students[i].parousiologio());
        }
    }

    public int passed(){
        int cnt = 0;
        for(int i=0; i<students.length; i++){
            if(students[i] == null){
                break;
            }
            if(students[i].getGrade() >=5){
                cnt++;
            }
        }
        return cnt;
    }

    public int not_passed(){
        int cnt = 0;
        for(int i=0; i<students.length; i++){
            if(students[i] == null){
                break;
            }
            if(students[i].getGrade() <5){
                cnt++;
            }
        }
        return cnt;
    }


    public double avgGrade(){
        double sum=0;
        int cnt=0;
        for(int i=0; i<students.length; i++) {
            cnt++;
            if (students[i] == null)
                return sum/cnt; // return 0
            sum += students[i].getGrade();
        }
        return  sum/cnt;
    }

}
