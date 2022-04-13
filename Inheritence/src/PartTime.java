/*child class part time
 *that shares attributes from parent class  
 */
public class PartTime extends Employee {
	//attributes only share by the class(private)
private int hoursPerWeek;

//constructor 
public PartTime(String name, double salary, String ssn, int hoursPerWeek) {
	super(name, salary, ssn);
	this.hoursPerWeek = hoursPerWeek;
}
@Override
//get pay method to calculate the pay
public double getPay() {
	
	return this.salary*hoursPerWeek;
	
}
}
