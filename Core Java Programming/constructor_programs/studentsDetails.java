class class1
{
	public static String college = "Osmania University.";
	public static String samedepartment = "BSc.";
	public static double samePackage = 7.9;
	public String studentName;
	public double differentPercentage;
	public String differentCompany;
	public class1 (String x, double y, String z)
	{
		studentName = x;
		differentPercentage = y;
		differentCompany = z;
	}
	public void details()
	{
		System.out.println("Student Name : "+studentName);
		System.out.println("College : "+college);
		System.out.println("Department : "+samedepartment);
		System.out.println("Percentage : "+differentPercentage);
		System.out.println("Company : "+differentCompany);
		System.out.println("Package : "+samePackage);
		System.out.println("---------------------------------------------------");
	}
}
class studentsDetails
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1("Lohith.", 96.7, "Microsoft.");
		class1 o2 = new class1("Litish.", 92.6, "Google.");
		class1 o3 = new class1("BaBa.", 89.5, "Apple.");
		o1.details();
		o2.details();
		o3.details();
	}
}
