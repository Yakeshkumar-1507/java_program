package phase5.module1.module2;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;
    String dept;

    public Employee(String name, int salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class CustomStreamsExample {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Yakesh", 10000, "IT"),
                new Employee("Kumar", 20000, "Mech"),
                new Employee("Saranya", 10000, "CSE"),
                new Employee("kanshika", 30000, "IT")
        );

        java.util.List<Employee> itEmployees = employees.stream().filter(employee -> employee.getDept().equals("IT")).toList();
        itEmployees.forEach(employee -> System.out.println(employee.name + " " + employee.getSalary()));

        java.util.Map<String, Double> averageSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalary);
    }
}
