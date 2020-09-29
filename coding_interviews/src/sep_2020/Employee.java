package sep_2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()  {
        return "Employee: " + name + " "+ age;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ferdis", 23);
        Employee emp2 = new Employee("Isa", 25);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(new Employee("Kaka", 35));
        employeeList.add(new Employee("Koko", 45));
        employeeList.add(new Employee("Papy", 30));
        employeeList.add(new Employee("Rwa", 50));
        employeeList.add(new Employee("Mimi", 32));

        List<Employee> sortedList = employeeList.stream()
                .filter(emp -> emp.getAge() > 25)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);


    }
}
