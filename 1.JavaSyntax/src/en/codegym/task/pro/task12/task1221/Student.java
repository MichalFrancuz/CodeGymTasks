package en.codegym.task.pro.task12.task1221;

//Generics and students
//        The UniversityDepartment class has a printStudentNames(ArrayList) method, which takes a list of objects and displays their names. But at present the program won't compile.
//        Your task is to fix this bug. To do this, you need to correct the signature of the printStudentNames(ArrayList) method so that it only accepts a list of Student objects (use a generic type).
//        The main method is not checked.
//
//
//        Requirements:
//        1. Correct the signature of the printStudentNames method so that it only accepts a list of students.
//        2. Do not change the implementation of the printStudentNames method.

public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
