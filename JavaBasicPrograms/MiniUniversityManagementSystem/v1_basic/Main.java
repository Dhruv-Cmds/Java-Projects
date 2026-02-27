package MiniUniversityManagementSystem;
public class Main{

    public static void main(String[] args) {

         //  Mini University Management System

        Studend s1 = new Studend("Alice Johnson", 20, 101, "Computer Science");
        
        Studend s2 = new Studend("Bob Smith", 21, 102, "Information Technology");
        Studend s3 = new Studend("Charlie Brown", 22, 103, "Mathematics");
        Studend s4 = new Studend("David Miller", 23, 104, "Physics");
        Studend s5 = new Studend("Emma Davis", 19, 105, "Biology");
        Studend s6 = new Studend("Liam Wilson", 20, 106, "Engineering");
        Studend s7 = new Studend("Sophia Taylor", 21, 107, "Business");
        Studend s8 = new Studend("Noah Anderson", 22, 108, "Chemistry");
        Studend s9 = new Studend("Olivia Thomas", 23, 109, "Psychology");
        Studend s10 = new Studend("Ethan Moore", 20, 110, "Economics");
        
        System.out.println("--------------------------------");
        s1.addFriend(s1);
        System.out.println("--------------------------------");
        s1.addFriend(s2);
        System.out.println("--------------------------------");
        s1.addFriend(s3);
        System.out.println("--------------------------------");
        s1.addFriend(s4);
        System.out.println("--------------------------------");
        s1.addFriend(s5);
        System.out.println("--------------------------------");
        s1.addFriend(s6);
        System.out.println("--------------------------------");
        s1.addFriend(s7);
        System.out.println("--------------------------------");
        s1.addFriend(s8);
        System.out.println("--------------------------------");
        s1.addFriend(s9);
        System.out.println("--------------------------------");
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