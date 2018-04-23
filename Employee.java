/*//4. WAP to calculate net salary of employee, take basic salary of employee and calculate
 HRA 30% of basic salary, 
DA 20% of the basic salary, 
TA 10% of the basic salary and 
Net salary is sum up of basic salary+ allowances-pf.
 Pf is 1400 fix. **/
 
 import java.util.Scanner;
 class Employee
 {

	public static void main(String args[])
	{

	int hra;  //30%
	int da;   //20%
	int ta;   //10%
	int pf = 1400;
	int netsalary;
	int basicsalary;
	
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter your basic salary");
		basicsalary = scanner.nextInt();

		hra = (basicsalary * 30) /100;
		da = (basicsalary * 20) /100;
		ta = (basicsalary * 10) /100;
		netsalary = basicsalary+hra+da+ta-pf;
		
		System.out.println("HRA is " + hra);
		System.out.println("DA is " + da);
		System.out.println("TA is " + ta);
		System.out.println("Your Net Salary is " + netsalary);
		
		
	}
}

