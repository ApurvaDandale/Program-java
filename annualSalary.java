package Day16;

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;      
        this.name = name;
    }
}
class Employee extends User {
    double salary;

    public Employee(int id, String name, double salary) {
    	super(id,name);
    	this.salary=salary;
    }
    
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class annualSalary {

	public static void main(String[] args) {
		        Employee e = new Employee(1, "Anil ", 5000.0);
		        double annualSalary = e.calculateAnnualSalary();
		        System.out.println("The annual salary of " + e.name + " is:" + annualSalary);
	}
}
