package ClassroomSystem;
public class Main {
    public static void main(String[] args) {
        
        // Classroom System

        ClassRoom room = new ClassRoom();

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);
        
        System.out.println("-------------------------");
        
        room.addStudents(student1);
        room.addStudents(student2);
        room.addStudents(student3);
        
        System.out.println("-------------------------");
        
        room.showStudens();
    }
}
