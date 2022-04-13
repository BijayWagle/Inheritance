/*child class fulltime 
* which shares attributes from parent class
 */
public class FullTime extends Employee {

	//constructor share from parent class employee
	public FullTime(String name, double salary, String ssn) {
		super(name, salary, ssn);
		// TODO Auto-generated constructor stub
	}
	
//method to calculate bonus
  double calculateBonus() {
	return (this.salary*15/100);
	//return bonus;
}
@Override
//method to calculate pay
public double getPay() {
	return(this.salary/26);
			
}
}


