/*child class derived from parent class
 * and share the attributes
 */
public class Consultant extends Employee {
	
	//private attributes
private int contactPeriodInMonth;

//constructor using private and parent class attributes
public Consultant(String name, double salary, String ssn, int contactPeriodInMonth) {
	super(name, salary, ssn);
	this.contactPeriodInMonth = contactPeriodInMonth;
}

//getter and setter
public int getContactPeriodInMonth() {
	return contactPeriodInMonth;
}

public void setContactPeriodInMonth(int contactPeriodInMonth) {
	this.contactPeriodInMonth = contactPeriodInMonth;
}
@Override
//method to calculate pay
public double getPay() {
	return this.salary/this.contactPeriodInMonth/2;
	
}
}
