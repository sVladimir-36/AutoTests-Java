package org.example.lesson4;

public class Employee {
    //создали конструктор, в скобках описаны параметры, в фигурных скобках тело конструктора
    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

    Employee(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    public Employee(int identificator, String familia, int vozrast, double zarplata, String otdel) {
        id = identificator;
        surname = familia;
        age = vozrast;
        salary = zarplata;
        department = otdel;
    }
    //здесь задаем соответствующие переменные с указанием типов данных
    int id;
    String surname;
    int age;
    double salary;
    String department;
    //метод, который удваивает зарплату сотрудников
    double salaryXtwo() {
        salary = salary * 2;//или salary *= 2
        return salary;
    }

}
//новый класс
class EmployeeTest {
    public static void main(String[] args) {
        //создание объектов класса Employee, с указанием в параметрах конструктора данных по клиентам в соответствующих
        //форматах данных
        Employee Empl_1 = new Employee(1, "Ivanov", 23, 500, "Юридический");
        Employee Empl_2 = new Employee(2, "Семенов", 56, 1250.4, "Закупок");
//вызовы метода увеличения зарплаты для каждого клиента
        Empl_1.salaryXtwo();
        Empl_2.salaryXtwo();
//вывод увеличенной зарплаты для каждого клиента
        System.out.println("Увеличенная зарплата первого работника составляет: " + Empl_1.salary);
        System.out.println("Увеличенная зарплата второго работника составляет: " + Empl_2.salary);
    }
}
