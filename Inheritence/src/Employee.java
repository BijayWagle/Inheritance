/*Bijay Wagle
 * parent abstract class 
 */
public  abstract class Employee {
	
	//attributes
	protected String name;
	protected double salary;
	protected String ssn;
	protected final int employeeId;
	//static variable
	static int nextID=1;
	//constructor
	public Employee(String name, double salary, String ssn) {
		//super();
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
		this.employeeId=nextID++;
				
	}
	//method to get employee id
	public int getEmployeeId() {
		return employeeId;
	}
	//abstract method get pay
	public abstract double getPay();
	
	//to string
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", ssn=" + ssn + ", employeeId=" + employeeId + "]";
	}

}
