package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    final ArrayList<String> students = new ArrayList<>();
    private final ArrayList<Integer> mathGrades = new ArrayList<>();
    private final ArrayList<Integer> scienceGrades = new ArrayList<>();
    private final ArrayList<Integer> englishGrades= new ArrayList<>();

    public MSGrades(){
        // Add some students and their grades to the array lists
        students.add(0, "Bob Miller");
        students.add(1, "Kimono Jackson");
        mathGrades.add(0, 35);
        mathGrades.add(1, 97);
        scienceGrades.add(0, 50);
        scienceGrades.add(1, 95);
        englishGrades.add(0, 45);
        englishGrades.add(1, 78);

    }

    public void printStudents(){
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void printStudentGrades(int studentIndex){
        System.out.println(students.get(studentIndex));
        System.out.println("====================");
        System.out.println("Math: " + mathGrades.get(studentIndex));
        System.out.println("Science: " + scienceGrades.get(studentIndex));
        System.out.println("English: " + englishGrades.get(studentIndex));
    }
}
