class class1
{
	public static String company = "Infosys.";
	public String employeeName;
	public String differentDepartment;
	public double differentPackage;
	public class1 (String x, String y, double z)
	{
		employeeName = x;
		differentDepartment = y;
		differentPackage = z;
	}
	public void details()
	{
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Company : "+company);
		System.out.println("Department : "+differentDepartment);
		System.out.println("Package : "+differentPackage);
		System.out.println("---------------------------------------------------");
	}
}
class employeeDetails
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1("Lohith.", "President.", 8.5);
		class1 o2 = new class1("Litish.", "Manager.", 5.8);
		class1 o3 = new class1("BaBa.", "SalesMan.", 4.25);
		o1.details();
		o2.details();
		o3.details();
	}
}
