package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Jethica");
        student1.addGrade(70);
        student1.addGrade(60);
        student1.addGrade(65);

        Student student2 = new Student("Yethica");
        student2.addGrade(80);
        student2.addGrade(78);
        student2.addGrade(90);

        Student student3 = new Student("Bethica");
        student3.addGrade(45);
        student3.addGrade(60);
        student3.addGrade(98);

        Student student4 = new Student("Yassica");
        student4.addGrade(76);
        student4.addGrade(88);
        student4.addGrade(97);

        students.put("JethrowsTomatoes", student1);
        students.put("Yeththir", student2);
        students.put("OleBethy", student3);
        students.put("YassQween", student4);


        System.out.println("Welcome!\n");

        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String studentUser : students.keySet()) {
            System.out.printf("| %s |", studentUser);
        }

        Input userInput = new Input();

        boolean userConfirm = true;
        do{
            if(userConfirm){
                String userSearchInput = userInput.getString("\nWhat student would you like to see more info on?\n");
                if(students.containsKey(userSearchInput)){
                    Student studentName = students.get(userSearchInput);
                    double studentGradeAvg = studentName.getGradeAverage();
                    System.out.printf("Name: %s - GitHub Username: %s%nGrades:%dCurrent Grade Average: %.2f", studentName, userSearchInput, studentGradeAvg);
                    userConfirm = userInput.yesNo("\nWould you like to see another student?");
                } else {
                    System.out.printf("Sorry, no student found with GitHub username: %s", userSearchInput);
                    userConfirm = userInput.yesNo("\nWould you like to see another student?");
                }
            }
        } while (userConfirm);

        System.out.println("Goodbye and have a wonderful day!");

    }
}
