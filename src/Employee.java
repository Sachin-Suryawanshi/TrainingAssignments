
public class Employee {
	int empid;
	String empName;
	double salary;
	
	public Employee() {
		
	}



	public Employee(int empid,String empName)
	{
		this.empid=empid;
		this.empName=empName;
	}
	


	public Employee(int empid, String empname, double sal) {
		this(empid,empname);
		salary = 50000;
	}
	
	public void show() {
		System.out.println("Employee ID :" + empid);
		System.out.println("Employee Name :" + empName);
		System.out.println("Salary :" + salary);
	}

}
