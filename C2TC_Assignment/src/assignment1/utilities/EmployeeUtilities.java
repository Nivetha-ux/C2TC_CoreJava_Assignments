package assignment1.utilities;


	public class EmployeeUtilities {

	    // Method to give bonus
	    public void giveBonus(Employee emp, double bonus) {
	        double newSalary = emp.getSalary() + bonus;
	        emp.setSalary(newSalary);
	        System.out.println("Bonus added! New Salary: " + newSalary);
	    }

	    // Method to compare salaries
	    public void compareSalary(Employee emp1, Employee emp2) {
	        if (emp1.getSalary() > emp2.getSalary()) {
	            System.out.println(emp1.getName() + " has a higher salary than " + emp2.getName());
	        } else if (emp1.getSalary() < emp2.getSalary()) {
	            System.out.println(emp2.getName() + " has a higher salary than " + emp1.getName());
	        } else {
	            System.out.println(emp1.getName() + " and " + emp2.getName() + " have equal salaries.");
	        }
	    }
	}


