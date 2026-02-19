package ClassroomSystem;
public class ClassRoom {

    Student[] students = new Student[5];
    int counts = 0;

    void addStudents(Student s){
        if(counts >= students.length){
            System.out.println("Classroom is full.");
            return;
        }
        students[counts] = s;
        counts++;

        System.out.println(s.name + " added to classroom." );
    }
    void showStudens(){
        if(counts == 0){
            System.out.println("No Studens in classroom yet.");
            return;
        }

        System.out.println("Students in classroom: ");
        for (int i = 0 ; i < counts ; i++){
            students[i].showInfo();
        }
    }
}
