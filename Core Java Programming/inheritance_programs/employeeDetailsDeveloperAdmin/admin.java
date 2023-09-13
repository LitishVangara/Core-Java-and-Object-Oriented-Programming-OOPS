class admin extends employee /*Sub class*/
{
	public String type;
	public admin(int id, String name, double annualIncome, String type)
	{
		super(id, name, annualIncome);
		this.type = type;
	}
	public void adminDetails()
	{
		System.out.println("-----------------------------Admin Details.----------------------------------");
		employeeDetails();
		System.out.println("Type = "+type);
		System.out.println("*****************************************************************");
		System.out.println("                                                                 ");
		System.out.println("                                                                 ");
	}
}
