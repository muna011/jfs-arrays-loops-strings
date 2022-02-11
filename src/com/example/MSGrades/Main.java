package com.example.MSGrades;

public class Main {

    public static void main(String[] args) {

        MSGrades generationHigh = new MSGrades();
        System.out.println();

        System.out.println("Middle School Roster");
        System.out.println("====================");

        generationHigh.printStudents();
        System.out.println();

        for (String teacher : generationHigh.teachers){
            String teacherName="Teacher: "+teacher;
            System.out.println(teacherName);
        }

        System.out.println("\nStudent Grades:\n");
        for (int i=0; i < generationHigh.students.size(); i++) {
            generationHigh.printStudentGrades(i);
            System.out.println();
        }



    }


}
