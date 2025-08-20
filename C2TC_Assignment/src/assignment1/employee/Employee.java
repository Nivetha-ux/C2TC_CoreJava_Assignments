package assignment1.employee;


	public class Employee {
	    private String name;       // private attribute
	    private int employeeId;    // private attribute
	    private double salary;     // private attribute

	    // Constructor
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getter and Setter methods
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Method to display employee details
	    public void displayDetails() {
	        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
	    }
	}

}
