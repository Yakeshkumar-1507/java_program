package phase2.module1;

class Employee{
    int id;
    String name;
    double salary;

    Employee(){
        System.out.println("Employee Object Created");
    }

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
        System.out.println("Employee salary : " + salary);
    }

}

class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 1;
        emp.name = "Jack";
        emp.salary = 5000;
        emp.display();

        System.out.println();
        Employee emp2 = new Employee(2,"Tony",7000);
        emp2.display();
    }
}
