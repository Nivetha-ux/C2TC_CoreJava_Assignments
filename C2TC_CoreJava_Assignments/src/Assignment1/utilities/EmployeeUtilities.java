package Assignment1.utilities;

import Assignment1.employees.Developer;
import Assignment1.employees.Employee;
import Assignment1.employees.Manager;

public class EmployeeUtilities {
   
    private static Employee[] employees = new Employee[100]; // Fixed size array
    private static int employeeCount = 0; // Track number of employees
    
    static final String UTILITY_VERSION = "1.0";
    
    private EmployeeUtilities() {
        
    }
    
    public static boolean addEmployee(Employee employee) {
        
        if (employee != null && employee.getEmployeeId() > 0 && employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
            System.out.println("Employee "+employeeCount+" added Successfully!");
            return true;
        }
        System.out.println("Failed to add Employee!");
        return false;
    }
    
    public static Employee findEmployeeById(int employeeId) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }
    
    public static double calculateTotalSalaryExpense() {
        double totalSalary = 0.0;
        for (int i = 0; i < employeeCount; i++) {
            totalSalary += employees[i].getSalary(); // Accessing private attribute via public getter
        }
        return totalSalary;
    }
    
    public static Manager[] getAllManagers() {
        Manager[] managers = new Manager[employeeCount]; // Temporary array
        int managerCount = 0;
        
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] instanceof Manager) {
                managers[managerCount] = (Manager) employees[i];
                managerCount++;
            }
        }
        
        Manager[] result = new Manager[managerCount];
        for (int i = 0; i < managerCount; i++) {
            result[i] = managers[i];
        }
        return result;
    }
    
    public static Developer[] getAllDevelopers() {
        Developer[] developers = new Developer[employeeCount]; 
        int developerCount = 0;
        
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] instanceof Developer) {
                developers[developerCount] = (Developer) employees[i];
                developerCount++;
            }
        }
        
        Developer[] result = new Developer[developerCount];
        for (int i = 0; i < developerCount; i++) {
            result[i] = developers[i];
        }
        return result;
    }
    
    public static void displayAllEmployees() {
        System.out.println("=== All Employees ===");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i].toString()); // Using public toString method
        }
    }
    
    public static double calculateAverageSalaryByDepartment(String department) {
        double totalSalary = 0.0;
        int deptEmployeeCount = 0;
        
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getDepartment().equals(department)) {
                totalSalary += employees[i].getSalary();
                deptEmployeeCount++;
            }
        }
        
        return deptEmployeeCount == 0 ? 0.0 : totalSalary / deptEmployeeCount;
    }
    
    static int getManagerCount() {
        int managerCount = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] instanceof Manager) {
                managerCount++;
            }
        }
        return managerCount;
    }
    
    public static int getDeveloperCount() {
        int developerCount = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] instanceof Developer) {
                developerCount++;
            }
        }
        return developerCount;
    }
    
    protected static int getEmployeeCount() {
        return employeeCount;
    }
    
    static String generateSystemReport() {
        StringBuilder report = new StringBuilder();
        report.append("Employee System Report\n");
        report.append("======================\n");
        report.append("Total Employees: ").append(employeeCount).append("\n");
        report.append("Total Salary Expense: $").append(String.format("%.2f", calculateTotalSalaryExpense())).append("\n");
        report.append("Managers: ").append(getManagerCount()).append("\n");
        report.append("Developers: ").append(getDeveloperCount()).append("\n");
        report.append("Utility Version: ").append(UTILITY_VERSION).append("\n");
        return report.toString();
    }
}
