class employee
{
	public int id;
	public String name;
	public double annualIncome;
	public String language;
	public String type;
	public employee(int id, String name, double annualIncome, String type, String language)
	{
		this.id = id;
		this.name = name;
		this.annualIncome = annualIncome;
		this.type = type;
		this.language = language;
	}
	public void details()
	{
		System.out.println("-------------------------Employee Details.-----------------------");
		System.out.println("Employee ID : "+id+".");
		System.out.println("Name : "+name);
		System.out.println("Package : "+annualIncome+"Lakhs");
		if (language == "Malayanam" || language == "Telugu" || language == "Hindi" || language == "English" || language == "Tamil")
		{
		    System.out.println("Language : "+language);
		}
		if (type == "Administrative Manager." || type == "Business Manager." || type == "Administrative Officer.")
		{
		    System.out.println("Admin Type : "+type);
		}
		System.out.println("*****************************************************************");
		System.out.println("                                                                 ");
		System.out.println("                                                                 ");
	}
}
class developer extends employee
{
	public developer(int id, String name, double annualIncome, String language)
	{
	    super(id, name, annualIncome, null, language);
	}
}
class admin extends employee
{
	public admin(int id, String name, double annualIncome, String type)
	{
	    super(id, name, annualIncome, type, null);
	}
}
class employeeDetails1 
{
	public static void main(String[] args) 
	{
		admin o1 = new admin(220221, "Litish.", 5.5, "Administrative Manager.");
		admin o2 = new admin(220222, "Lahari.", 6.5, "Administrative Officer.");
		admin o3 = new admin(230218, "BaBa.", 9.2, "Business Manager.");
		developer o4 = new developer(220221, "Litish.", 5.5, "Telugu");
		developer o5 = new developer(220222, "Lahari.", 6.5, "Telugu");
		developer o6 = new developer(210245, "Lohith.", 8.1, "Hindi");
		o1.details();
		o2.details();
		o3.details();
		o4.details();
		o5.details();
		o6.details();
	}
}
