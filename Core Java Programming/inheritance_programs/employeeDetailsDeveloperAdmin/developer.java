class developer extends employee /*Sub class*/
{
	public String language;
	public developer(int id, String name, double annualIncome, String language)
	{
		super(id, name, annualIncome);
		this.language = language;
	}
	public void developerDetails()
	{
		System.out.println("-----------------------------Developer Details.----------------------------------");
		employeeDetails();
		System.out.println("Language = "+language);
		System.out.println("*****************************************************************");
		System.out.println("                                                                 ");
		System.out.println("                                                                 ");
	}
}
