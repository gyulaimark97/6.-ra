
import java.time.LocalDate;

public class Employee {

	
	static LocalDate currentDate = java.time.LocalDate.now();
	
	
	 private String employeeName;
	 private long salary;
	 private LocalDate birthday;
	
	 static int retiringYear=65;
	 
	 
	public Employee(String employeeName,long salary, LocalDate birthday) {
		this.salary=salary;
		this.employeeName=employeeName;
		this.birthday=birthday;
		
	}
	
	public Employee(String employeeName, LocalDate birthday) {
		this(employeeName,10000*(currentDate.getYear()-birthday.getYear()),birthday);
	}
	

	
	
	// set get 
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int remainingYears() {
		return retiringYear-currentDate.getYear()-birthday.getYear();
	}

	public int getAge() {
		return currentDate.getYear()-birthday.getYear();
	}


	public static int getRetiringYear() {
		return retiringYear;
	}

	public static void setRetiringYear(int retiringYear) {
		Employee.retiringYear = retiringYear;
	}
	
	
	
	
	
	public void incSalary(long incrase) {
		
		this.salary+=incrase;
	}

	
	public String toString() {
		return "Salary: "+ this.salary + " Name: "+ this.employeeName+ " Age: "+ (currentDate.getYear()-birthday.getYear()) + " Remaining years: " +remainingYears();
	}
	
	
	public boolean isInSalaryRange(long salaryStart, long salaryEnd) {
		
		if(this.salary>=salaryStart && this.salary<=salaryEnd) {
			return true;
		}
		else 
			return false;
	}
	
	
	
	public long getTax() {
		return (long) (this.salary*0.16);
	}
	
	
	public boolean hasHigherSalary (Employee employee) {
		
		if(this.salary>employee.salary)
			return true;
		else
			return false;
	}
	
	public static Employee hasMoreYearsUntilRetiring(Employee employee1, Employee employee2) {
		if(employee1.remainingYears()>employee2.remainingYears())
			return employee1;
		else 
			return employee2;
	}
	
	public String empBirthday() {
		return this.getEmployeeName()+","+ this.getAge()+ birthday.getMonth().name()+ birthday.getDayOfMonth();
	}
	
	
}
