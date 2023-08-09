package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public int addGrade(int grade){
        this.grades.add(grade);
        return grade;
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        int sumOfGrades = 0;
        for (Integer grade : grades) {
            sumOfGrades += grade;
        }
        int averageGrade = sumOfGrades / grades.size();
        return averageGrade;
    }
    public String toString(){
        return this.name;
    }

}
