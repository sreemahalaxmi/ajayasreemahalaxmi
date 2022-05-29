class Employee
{
	public void methodEmployee()
	{
		System.out.println("method of class Employee");
	}
}
class Manager extends Employee
{
	public void methodManager()
	{
		System.out.println("method of class Manager");
	}
}
class Labour extends Employee
{
	public void methodLabour()
	{
		System.out.println("method of class Labour");
	}
}
class JavaExample
{
	public static void main(String args[])
	{
		Manager obj1= new Manager();
		Labour obj2= new Labour();
		
		
		
		
		obj1.methodEmployee();
		obj2.methodEmployee();
	}
}
class salary{
	{
		double grossSalary=10000;
		double incomeTax=1000;
		double providentFund=800;
		double professionalTax=500;
		double netSalary=grossSalary-(incomeTax+providentFund+professionalTax);
		System.out.println("Net salary is="+netSalary);
	}
}