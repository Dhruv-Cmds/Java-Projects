package LifeManager.v2_oop;

public class StudyTime extends UserInfo {
    public void sT (double weekly , double hours , String student){
        if (isStudent){

            weekly = 7 * hours;
            student = (weekly >= 40) ? "Beast mode" : "Needs focus";
            System.out.println(student);
        }
        else{ System.out.println("You are not a student.");
        }
    }
}