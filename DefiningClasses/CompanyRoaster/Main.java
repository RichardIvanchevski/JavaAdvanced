package CompanyRoaster;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Employee>> employees = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] informationParts = scanner.nextLine().split("\\s+");
            String department = informationParts[3];
            String name = informationParts[0];
            double salary = Double.parseDouble(informationParts[1]);
            String position = informationParts[2];
            employees.putIfAbsent(department, new ArrayList<>());
            Employee employee = new Employee(name, salary, position);

            if (informationParts.length == 6) {
                employee.setEmail(informationParts[4]);
                employee.setAge(Integer.parseInt(informationParts[5]));

            } else if (informationParts.length == 5) {
                if (informationParts[4].contains("@")) {
                    employee.setEmail(informationParts[4]);
                } else {
                    employee.setAge(Integer.parseInt(informationParts[4]));
                }
            }
            employees.get(department).add(employee);
        }
        averageSalary(employees);
    }

    private static void averageSalary(Map<String, List<Employee>> employees) {
        double maxAvgSalary = employees.values().stream()
                .mapToDouble(employeeList -> employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0))
                .max().orElse(0);

        String departmentWithMaxAvgSalary = employees.entrySet().stream()
                .filter(e -> e.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(0) == maxAvgSalary)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");

        System.out.println("Highest Average Salary: " + departmentWithMaxAvgSalary);

        List<Employee> maxAvgSalaryDepartmentEmp = employees.get(departmentWithMaxAvgSalary);

        maxAvgSalaryDepartmentEmp.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        maxAvgSalaryDepartmentEmp.forEach(System.out::println);


    }
}
