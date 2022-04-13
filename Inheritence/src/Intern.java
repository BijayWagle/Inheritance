/*child class that derived from parent class 
 * and shares the attributes
 */
public class Intern extends Employee {
	
	//private attributes 
	 private int hoursPerWeek ;
	 private String university; 
	 private boolean isPaid=true;
	 
	 //constructor 
	public Intern(String name, double salary, String ssn, int hoursPerWeek, String university, boolean isPaid) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
		this.university = university;
		this.isPaid = isPaid;
	}
	//getter and setter
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}


	@Override
	//method to calculate the pay
	public double getPay() {
	if(this.isPaid){
		
		return this.salary*this.hoursPerWeek*2;
		
		}
	
	else {
		return 0.0;
		
	}
	}
}
