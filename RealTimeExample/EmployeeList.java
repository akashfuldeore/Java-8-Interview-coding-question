package RealTimeExample;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeList {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        // Q.1 How many male and female employees are there in the organization?
        Map<String, Long> NoOgEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(NoOgEmployee);
        System.out.println("===================================");
        // Q.2 Print the name of all departments in the organization?
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("===================================");
        employeeList.stream().map(Employee::getGender).distinct().forEach(System.out::println);
        System.out.println("===================================");
        // Q.3 What is the average age of male and female employees?
        Map<String, Double> avgAgeEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        System.out.println(avgAgeEmployee);
        System.out.println("===================================");
        // Q.4 Get the details of highest paid employee in the organization?
        System.out.println("===================================");
        // Q.5 Get the names of all employees who have joined after 2015?
        // Q.6 Count the number of employees in each department?
        // Q.7 What is the average salary of each department?
        // Q.8 Get the details of youngest male employee in the product development
        // department?
        // Q.9 Who has the most working experience in the organization?
         Optional<Employee> seniorEmployee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
         Employee seniorMostEmployee = seniorEmployee.get();
         System.out.println("Name of Employee ="+ seniorMostEmployee.getName());
         System.out.println("======================");
        // Q.10 How many male and female employees are there in the sales and marketing
        // team?
        // Q.11 What is the average salary of male and female employees?
        // Q.12 List down the names of all employees in each department?
        // Q.13 What is the average salary and total salary of the whole organization?
        // Q.14 Separate the employees who are younger or equal to 25 years from those
        // employees who are older than 25 years.
        // Q.15 Who is the oldest employee in the organization? What is his age and
        // which department he belongs to?
        // Q.16 Count the Number of Employee Name Start with A
        Employee emp = employeeList.stream().filter(employe -> "Ali Baig".equals(employe.getName())).findAny()
                .orElse(null);
        System.out.println(emp);
    }
}
