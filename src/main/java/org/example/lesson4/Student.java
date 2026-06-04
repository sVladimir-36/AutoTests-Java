package org.example.lesson4;

//создали публичный класс, который совпадает с названием файла
public class Student {
    //описываем конструктор, содержащий все параметры
    Student (int id1, String name1, String surname1, int educYear1, double avgMathScore1, double avgEconomicScore1, double avgLanguageScore1) {
        //присваиваем переменным соответствующие значения параметров
        id = id1;
        name = name1;
        surname = surname1;
        educationYear = educYear1;
        avgMathScore = avgMathScore1;
        avgEconomicScore = avgEconomicScore1;
        avgLanguageScore = avgLanguageScore1;
    }
    //описываем конструктор, содержащий четыре параметра, используя вызов первого конструктора внутри второго
    // с помощью this
    Student (int id2, String name2, String surname2, int educYear2) {
        this (id2, name2, surname2, educYear2, 0, 0, 0);
    }
    //описываем конструктор, без параметров, он ничего не принимает
    Student () {
    }
    // Задаем параметры обьекта в классе Студент с указанием типов данных
    int id;
    String name;
    String surname;
    int educationYear;
    double avgMathScore;
    double avgEconomicScore;
    double avgLanguageScore;
}
//создали еще один класс
class StudentTest {
    //создал метод который возвращает результат (return), и рассчитывает среднее арифметическое
//введенных переменных, после чего выводит на экран результат
    double avgArithmeticGrade (Student St_) {
        double avgGrade = (St_.avgMathScore + St_.avgEconomicScore + St_.avgLanguageScore)/3;
        System.out.println("Средняя арифметическая оценка студента " + St_.name + " " + St_.surname + ": " + avgGrade);
        return avgGrade;
    }
    void avrGradeInfo() {
        System.out.println();
    }
    //данный класс содержит метод main
    public static void main(String[] args) {
//здесь создаем три разных обьекта Student
        //с конструктором без параметров
        Student St_1 = new Student();
        //с конструктором в котором указаны все параметры
        Student St_2 = new Student(2, "Roman", "Sven", 2017, 3.3, 4.1, 5);
        //с конструктором в котором указаны 4 параметра
        Student St_3 = new Student(55, "Dima", "Plushkin", 2000);
//прописываем параметры первого обьекта
        St_1.id = 12;
        St_1.name = "Oleg";
        St_1.surname = "Petrov";
        St_1.educationYear = 2007;
        St_1.avgMathScore = 4.3;
        St_1.avgEconomicScore = 3.9;
        St_1.avgLanguageScore = 5.0;
//прописываем параметры второго обьекта- теперь не нужно , т.к. параметры прописаны в конструкторе
        //St_2.id = 125;
        //St_2.name = "Roman";
        //St_2.surname = "Sven";
        //St_2.educationYear = 2017;
        //St_2.avgMathScore = 3.3;
        //St_2.avgEconomicScore = 4.1;
        //St_2.avgLanguageScore = 5.0;
//прописываем параметры третьего обьекта- первые четыре закоментил, т.к. они указаны в конструкторе
        //St_3.id = 55;
        //St_3.name = "Dima";
        //St_3.surname = "Plushkin";
        //St_3.educationYear = 2000;
        St_3.avgMathScore = 3.0;
        St_3.avgEconomicScore = 3.9;
        St_3.avgLanguageScore = 4.7;
//считаем среднюю оценку по трем предметам
        //double firstStudAvfScore = (FirstStudent.avgMathScore + FirstStudent.avgEconomicScore + FirstStudent.avgLanguageScore)/3;
        //double secondStudAvfScore = (SecondStudent.avgMathScore + SecondStudent.avgEconomicScore + SecondStudent.avgLanguageScore)/3;
        //double thirdStudAvfScore = (ThirdStudent.avgMathScore + ThirdStudent.avgEconomicScore + ThirdStudent.avgLanguageScore)/3;
//выводим рассчитанные выше значения, округляем их до двух знаков с помощью конструкции String.format("%.2f", value)
        //System.out.println("Средняя арифметическая оценка " + FirstStudent.name + " " + FirstStudent.surname + " равна " +  String.format("%.2f", firstStudAvfScore));
        //System.out.println("Средняя арифметическая оценка " + SecondStudent.name + " " + SecondStudent.surname + " равна " +  String.format("%.2f",secondStudAvfScore));
        //System.out.println("Средняя арифметическая оценка " + ThirdStudent.name + " " + ThirdStudent.surname + " равна " +  String.format("%.2f", thirdStudAvfScore));

//вызов метода для рассчета среднего арифметического и вывод результата
        StudentTest StTest = new StudentTest();
        StTest.avgArithmeticGrade(St_1);
        StTest.avgArithmeticGrade(St_2);
        StTest.avgArithmeticGrade(St_3);
    }
}

