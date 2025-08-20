package Assignment1.employees;

public class Developer extends Employee {
    
    private String programmingLanguage;
    private int yearsOfExperience;
    String currentProject;
    
    public Developer(String name, int employeeId, double salary, String department,
                     String programmingLanguage, int yearsOfExperience, String currentProject) {
        super(name, employeeId, salary, department);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
        this.currentProject = currentProject;
    }
    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String getCurrentProject() {
        return currentProject;
    }
    
    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }
}