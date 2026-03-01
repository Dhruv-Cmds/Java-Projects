package MiniUniversityManagementSystem.v1_basic;
public class Main{

    public static void main(String[] args) {

         //  Mini University Management System

        Student s1 = new Student("Alice Johnson", 20, 101, "Computer Science");
        
        Student s2 = new Student("Bob Smith", 21, 102, "Information Technology");
        Student s3 = new Student("Charlie Brown", 22, 103, "Mathematics");
        Student s4 = new Student("David Miller", 23, 104, "Physics");
        Student s5 = new Student("Emma Davis", 19, 105, "Biology");
        Student s6 = new Student("Liam Wilson", 20, 106, "Engineering");
        Student s7 = new Student("Sophia Taylor", 21, 107, "Business");
        Student s8 = new Student("Noah Anderson", 22, 108, "Chemistry");
        Student s9 = new Student("Olivia Thomas", 23, 109, "Psychology");
        Student s10 = new Student("Ethan Moore", 20, 110, "Economics");

        System.out.println("--------------------------------");
        s1.addFriend(s1);
        s1.addFriend(s2);
        s1.addFriend(s3);
        s1.addFriend(s4);
        s1.addFriend(s5);
        s1.addFriend(s6);
        s1.addFriend(s7);
        s1.addFriend(s8);
        s1.addFriend(s9);
        s1.addFriend(s10);

        System.out.println("--------------------------------");
        
        s1.displayInfo();
        System.out.println("--------------------------------");
        s2.displayInfo();
        System.out.println("--------------------------------");
        s3.displayInfo();
        System.out.println("--------------------------------");
        s4.displayInfo();
        System.out.println("--------------------------------");
        s5.displayInfo();
        System.out.println("--------------------------------");
        s6.displayInfo();
        System.out.println("--------------------------------");
        s7.displayInfo();
        System.out.println("--------------------------------");
        s8.displayInfo();
        System.out.println("--------------------------------");
        s9.displayInfo();
        System.out.println("--------------------------------");
        s10.displayInfo();
        System.out.println("--------------------------------");

        s1.showFriend();
    }
}