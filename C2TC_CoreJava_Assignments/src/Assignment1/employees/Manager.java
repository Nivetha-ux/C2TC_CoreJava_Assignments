package Assignment1.employees;

public class Manager extends Employee {
    
    private int teamSize;
    private String managementLevel;
    String budgetResponsibility;
 
    public Manager(String name, int employeeId, double salary, String department, 
                   int teamSize, String managementLevel, String budgetResponsibility) {
    	super(name, employeeId, salary, department);
    	this.teamSize = teamSize;
        this.managementLevel = managementLevel;
        this.budgetResponsibility = budgetResponsibility;
    }
    
    public int getTeamSize() {
        return teamSize;
    }
    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    public String getManagementLevel() {
        return managementLevel;
    }
    
    public void setManagementLevel(String managementLevel) {
        this.managementLevel = managementLevel;
    }
    
    public String getBudgetResponsibility() {
        return budgetResponsibility;
    }
    
    public void setBudgetResponsibility(String budgetResponsibility) {
        this.budgetResponsibility = budgetResponsibility;
    }
    
    @Override
    protected double calculateAnnualBonus() {
        double baseBonus = super.calculateAnnualBonus();
        double teamBonus = teamSize * 1000; // $1000 per team member
        return baseBonus + teamBonus;
    }
    
    @Override
    public String toString() {
        return String.format("Manager[ID: %d, Name: %s, Department: %s, Salary: $%.2f, " +
                           "Team Size: %d, Management Level: %s]", 
                           getEmployeeId(), getName(), getDepartment(), getSalary(),
                           teamSize, managementLevel);
    }
}
