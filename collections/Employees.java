
import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

class Employees {
	public static void main(String[] args)
	{
		 
		System.out.println(
			"Sorting on the basis of name ascending order");

		 
		TreeSet<Employee> gfg
			= new TreeSet<>((Employee e1, Employee e2)
								->
							- (e1.name).compareTo(e2.name));

		gfg.add(new Employee(1, "ram", 24,"IT"));
		gfg.add(new Employee(2, "krishna", 23,"IT"));
		gfg.add(new Employee(3, "sita", 26,"IT"));
		gfg.add(new Employee(4, "lakshman", 25,"IT"));
		gfg.add(new Employee(1, "Kavitha", 24,"IT"));
		gfg.add(new Employee(2, "Vanitha", 23,"IT"));
		gfg.add(new Employee(3, "Sunitha", 26,"IT"));
		gfg.add(new Employee(4, "Aliya", 25,"IT"));
		gfg.add(new Employee(1, "Sana", 24,"IT"));
		gfg.add(new Employee(2, "Shiva", 23,"IT"));

		for (Employee employee : gfg) {
			System.out.println(employee);
		}

		 
		System.out.println(
			"Sorting on the basis of name ascending order");

		TreeSet<Employee> gfg2 = new TreeSet<>(
			(Employee e1,
			Employee e2) -> e1.name.compareTo(e2.name));

		 
		gfg2.add(new Employee(1, "ram", 24,"IT"));
		gfg2.add(new Employee(2, "krishna", 23,"IT"));
		gfg2.add(new Employee(3, "sita", 26,"IT"));
		gfg2.add(new Employee(4, "lakshman", 25,"IT"));
		gfg2.add(new Employee(1, "Kavitha", 24,"IT"));
		gfg2.add(new Employee(2, "Vanitha", 23,"IT"));
		gfg2.add(new Employee(3, "Sunitha", 26,"IT"));
		gfg2.add(new Employee(4, "Aliya", 25,"IT"));
		gfg2.add(new Employee(1, "Sana", 24,"IT"));
		gfg2.add(new Employee(2, "Shiva", 23,"IT"));

		 
		for (Employee employee : gfg2) {
			System.out.println(employee);
		}
	}
}

class Employee {
	 

	public int id;
	public String name;
	public Integer age;
	public String Department;

	 
	Employee() {}

	 
	Employee(int id, String name, int age, String Department)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.Department = Department;
	}

	@Override public String toString()
	{
		return "" + this.id + " " + this.name + " "
			+ this.age + " " +  this.Department;
	}
}
