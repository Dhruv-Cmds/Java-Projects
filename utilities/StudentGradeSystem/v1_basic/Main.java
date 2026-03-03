package StudentGradeSystem.v1_basic;

import java.util.Scanner;

public  class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        //    Ask how many students
        int studentCount;
        System.out.print("How many Students?: ");
        studentCount = scanner.nextInt();

        scanner.nextLine();

        //    Store names in one array
        String[] studentName;
        studentName = new String[studentCount];

        double[] grades;
        grades = new double[studentCount];

        for(int i = 0; i < studentCount; i++){
            System.out.print("Enter student name: ");
            studentName[i] = scanner.nextLine();

            //    Store grades in another array
            System.out.print("Enter grades: ");
            grades[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        //    Highest grade + student name
        double highestGrade = grades[0];
        double studentAverage = 0;
        double sum = 0;
        int passedStudent = 0;
        int failedStudent = 0;
        String topStudentName = studentName[0];

        for(int i = 0; i < studentCount; i++){

            sum += grades[i];

            if(grades[i] > highestGrade){
                highestGrade = grades[i];
                topStudentName = studentName[i];
            }

            //    How many passed (>= 50)
            if(grades[i] >= 50){
                passedStudent++;
            }

            if(grades[i] < 50){
                failedStudent++;
            }

            //    Class average
            studentAverage = sum / studentCount;

        }

        System.out.println("--------------------");
        System.out.println("===== RESULTS =====:");
        System.out.printf("Highest Grade: %.2f - Student: %s%n", highestGrade, topStudentName);
        System.out.printf("Class Average: %.2f%n" , studentAverage);
        System.out.println("Total Passed Students: " + passedStudent);
        System.out.println("Total Failed Students: " + failedStudent);

        scanner.close();
    }
}