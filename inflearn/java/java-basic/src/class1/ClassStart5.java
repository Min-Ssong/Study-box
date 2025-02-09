package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "student2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for(int i = 0; i < students.length; i++){
            System.out.println("name : " + students[i].name + " age : " + students[i].age + " grade : " + students[i].grade);
        }
        System.out.println();
        for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("name : " + s.name + " age : " + s.age + " grade : " + s.grade);
        }
        System.out.println();
        for (Student s : students) {
            System.out.println("name : " + s.name + " age : " + s.age + " grade : " + s.grade);
        }
    }
}
