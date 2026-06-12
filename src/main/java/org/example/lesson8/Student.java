package org.example.lesson8;

public class Student {
    String name;
    int cource;
    //статичная переменная, доступная любому обьекту в данном классе
    static int count;

    public Student(String name2, int cource2) {
        count++;
        name = name2;
        cource = cource2;
        System.out.println("Student # " + count + " sozdan");
    }
//статичный метод
    public static void showCount() {
        System.out.println(count);
    }

    public void showInfo() {
        System.out.println("Some info");
    }


}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Dima", 4);
        Student st3 = new Student("Masha", 2);
    }
}
