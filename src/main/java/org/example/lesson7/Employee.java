package org.example.lesson7;

import java.util.Arrays;

public class Employee {
    //создали конструктор, в скобках описаны параметры, в фигурных скобках тело конструктора

    public Employee(int id2) {
        id = id2;
    }


    private Employee(String surname3 ) {
        surname = surname3;
    }

    Employee(double zarplata) {
        salary = zarplata;

    }
    //здесь задаем соответствующие переменные с указанием типов данных
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    }

//новый класс
class EmployeeTest {
    public static void main(String[] args) {
        //создание объектов класса Employee, с указанием в параметрах конструктора данных по клиентам в соответствующих
        //форматах данных
        //Employee Empl_1 = new Employee(1, "Ivanov", 23, 500, "Юридический");
        //Employee Empl_2 = new Employee(2, "Семенов", 56, 1250.4, "Закупок");
//вызовы метода увеличения зарплаты для каждого клиента

//вывод увеличенной зарплаты для каждого клиента
        //System.out.println("Увеличенная зарплата первого работника составляет: " + Empl_1.salary);
        //System.out.println("Увеличенная зарплата второго работника составляет: " + Empl_2.salary);
    }
}
