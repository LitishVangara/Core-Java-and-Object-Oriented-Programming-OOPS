class employeeDetails 
{
	public static void main(String[] args) 
	{
		developer o1 = new developer(220221, "Litish.", 5.5, "Core Java.");
		developer o2 = new developer(220222, "Lahari.", 6.5, "Core Java.");
		developer o3 = new developer(210245, "Lohith.", 8.1, "Advanced Java.");
		admin o4 = new admin(220221, "Litish.", 5.5, "Administrative Manager.");
		admin o5 = new admin(220222, "Lahari.", 6.5, "Administrative Officer.");
		admin o6 = new admin(230218, "BaBa.", 9.2, "Business Manager.");
		o1.developerDetails();
		o2.developerDetails();
		o3.developerDetails();
		o4.adminDetails();
		o5.adminDetails();
		o6.adminDetails();
	}
}
