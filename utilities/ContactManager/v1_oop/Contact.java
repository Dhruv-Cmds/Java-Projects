package ContactManager.v1_oop;

public class Contact {

    String name;
    String email;
    String phone;

    public  Contact (String name, String email, String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void display(){
        System.out.println(name + " | " + email + " | " + phone);
    }
}

