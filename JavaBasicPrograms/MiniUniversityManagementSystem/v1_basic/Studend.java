package MiniUniversityManagementSystem;

public class Studend {

    String name;
    int age;
    int id;
    String course;

    
    Studend(String name , int age , int id , String course){
        this.name = name;
        this.age = age;
        this.id = id;
        this.course = course;
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Id No: " + id);
        System.out.println("Course: " + course);
    }
    
    Studend[] friends = new Studend[10];
    int friendCount = 0;

    void addFriend(Studend s){
        if (friendCount >= friends.length) {
            System.out.println("Friend list is full." );
            return;
        }
        
        friends[friendCount] = s;
        friendCount++;

        System.out.println(s.name + " added as friend.");
    }
    
    void showFriend(){
        if(friendCount == 0){
            System.out.println("No friends yet.");
            
            return;
        }
        else{
            System.out.println("You have total " + friendCount + " friends: ");
            System.out.println("--------------------------------");
        }

        for (int i = 0 ; i < friendCount; i++){
            System.out.println("- " + friends[i].name);
        }
    }
}