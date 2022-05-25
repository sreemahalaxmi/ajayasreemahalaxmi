import java.util.HashSet;
import java.util.Set;


public class Employee {
	
	 private int empId;
	 private String empName;
	 private int salary;
	 private String department;
	 
	 public Employee(int empId, String empName,int salary,String department) {
		 super();
		 this.empId = empId;
		 this.empName = empName;
		 this.salary=salary;
		 this.department=department;
	 }
	 
	 
	 public final int getEmpId() {
		 return empId;
	 }
	 
	 
	 public final void setEmpId(int empId) {
		 this.empId = empId;
	 }
	 
	 
	 public final String getEmpName() {
		 return empName;
	 }
	 
	 
	 public final void setEmpName(String empName) {
		 this.empName = empName;
	 }
	 
	 public final int getsalary() {
		 return salary;
	 }
	 
	 public final void setsalary(int salary) {
      this.salary = salary;
	 }
	 
	 public final String getdepartment() {
		 return department;
	 }
	 
	 
	  public final void setdepartment(String department) {
		  this.department = department;
	  }
	  
	 
	  public String toString() {
		  return "Employee [empId=" + empId + ",empName=" + empName + ",salary="+ salary + ",department "+ department +"]";
	  }
	  
	  
	  public int hashcode() {
		  return this.empId;
	  }
	  
	  
	  public boolean equals(Object obj) {
		  Employee employee = (Employee) obj;
		  if (employee.empId == this.empId) {
			  employee.setEmpName(this.empName);
			  employee.setsalary(this.salary);
			  employee.setdepartment(this.department);
		  }
		  
		
		      return true;
	      }  
	  //else
	      {
		  //return false;
	  }
	  
	  
	  public static void main(String[] args) {
		  Set<Employee> employee = new HashSet<>();
		  employee.add(new Employee(1, "Kavitha",500000,"cse"));
	      employee.add(new Employee(1, "Sunitha",500000,"cse"));
		  employee.add(new Employee(1, "Saniya",00000,"cse"));
		  employee.add(new Employee(2, "Sana",500000,"cse"));
		  employee.add(new Employee(2, "Aliya",500000,"cse"));
												  
		  System.out.println(employee);
	    }
		  
	 
    }
	 	 
	
 
          
     
