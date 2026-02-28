package ClassroomSystem.v1_basic;

public class Student {
    
    String name;
    int id;

    Student(String name , int id){
        this.name = name;
        this.id = id;
    }

    void showInfo(){
        System.out.println("Name: " + name + " Id: " + id);
    }
}
