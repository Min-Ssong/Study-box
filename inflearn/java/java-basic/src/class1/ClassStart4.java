package class1;

import java.util.Arrays;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "student2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("name : " + students[0].name + " age : " + students[0].age + " grade : " + students[0].grade);
        System.out.println("name : " + students[1].name + " age : " + students[1].age + " grade : " + students[1].grade);
    }
}
