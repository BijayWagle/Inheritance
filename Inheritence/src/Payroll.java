/*main  method to take user choice input and calculate the pay
 * of the employee type
 */
import java.util.Scanner;
public class Payroll {
	
	//array that holds 6 employee
	static Employee[] arrayEmployees=new Employee[6];
	
	//method to get print menu
	public static String printMenu() {
		return "Employee types\n\t1. Full-time" + "\n\t2. Part-time\n\t3. Intern\n"+ "\n\t4. Consultant"
	+ "\n\t0. Exit system";
		
	}
	public static void main(String []args) {
		
		//local variable
	int count=0;
	int userChoice;
	String name;
	String ssn;
	double salary;
	int hoursPerWeek;
	String university;
	int contract;
	boolean paid=true;
	
	//scanner input
	Scanner input= new Scanner(System.in);
	
	
//Employee newEmployees;	
	//loop starts here
	do {
		System.out.println("Enter type of employee :"+printMenu());
		userChoice=input.nextInt();
		input.nextLine();
		//runs the condition if user choice is 1
//		FullTime newEmployees;
		if(userChoice==1) {
			System.out.println("Enter employee name");
			name=input.nextLine();
			System.out.println("What is your SSN:");
			ssn=input.nextLine();
			
			System.out.println("What is your salary:");
			salary=input.nextDouble();
			
			FullTime e1=new FullTime(name,salary,ssn);
			arrayEmployees[count]=e1;
			count ++;
			
		}		
		//run the condition if user choice is 2
		else if (userChoice==2) {
			System.out.println("Eneter employee name");
			name=input.nextLine();
			
			System.out.println("What is your SSN:");
			ssn=input.nextLine();
			
			System.out.println("What is your salary:");
			salary=input.nextDouble();
			
			System.out.println("how many hours per week doe sthe employee work");
			hoursPerWeek=input.nextInt();
			
			PartTime e2=new PartTime(name,salary,ssn,hoursPerWeek);
			arrayEmployees[count]=e2;
			count++;
			}
		//runs the condition if user choice is 3
		else if(userChoice==3) {
			System.out.println("Is it a paid internship? (true/false):");
			paid = input.nextBoolean();

			System.out.println("Enter employee name:");
			name=input.nextLine();
			input.nextLine();			
			System.out.println("What is your SSN:");
			ssn=input.nextLine();
			
			System.out.println("What is your salary:");
			salary=input.nextDouble();
			
			System.out.println("how many hours per week doe sthe employee work");
			hoursPerWeek=input.nextInt();
			
			input.nextLine();
			System.out.println("What is the name of the University");
			university=input.nextLine();
			
			Intern e3=new Intern(name,salary,ssn,hoursPerWeek,university,paid);
            arrayEmployees[count]=e3;
            count++;

		}
		//runs the condition if user choice is 4
		else if(userChoice==4){
			System.out.println("Enter employee name");
			name=input.nextLine();
			
			System.out.println("What is your SSN:");
			ssn=input.nextLine();
	
			input.nextLine();
			System.out.println("What is your salary:");
			salary=input.nextDouble();
			
			System.out.println("How many months of contarct:");
			contract=input.nextInt();
			
			Consultant e4=new Consultant(name,salary,ssn,contract);
			arrayEmployees[count]=e4;
			count++;
					}
		}
	//comes out of loop if the condition is not matched
      while(userChoice!=0 && count!=2);
	
	System.out.println("payroll for each employee in employees array is");
	
	for(int i=0; i<count;i++) {
		System.out.println(arrayEmployees[i].getEmployeeId()+":"+arrayEmployees[i].getPay());
	
	}
	input.close();
	}


}
	
	

	
	




