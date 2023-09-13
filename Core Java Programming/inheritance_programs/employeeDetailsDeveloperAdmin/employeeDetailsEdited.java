import java.util.Scanner;
class employeeDetails
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		developer[] o = new developer[3];
		admin[] o2 = new admin[3];
		for(int i=0; i<3; i++){
			System.out.println("Enter developer id: ");
			int num = scanner.nextInt();
			System.out.println("Enter developer Name: ");
			String name = scanner.next();
			System.out.println("Enter annual income in lakhs: ");
			double income = scanner.nextDouble();
			System.out.println("Enter Programming Language for developer: ");
			scanner.nextLine();
			String lang = scanner.nextLine();
			o[i] = new developer(num,name,income,lang);
		}
		for(int i=0; i<3; i++){
			System.out.println("Enter admin id: ");
			int num = scanner.nextInt();
			System.out.println("Enter admin Name: ");
			String name = scanner.next();
			System.out.println("Enter annual income in lakhs: ");
			double income = scanner.nextDouble();
			System.out.println("Enter type for admin: ");
			scanner.nextLine();
			String type = scanner.nextLine();
			o2[i] = new admin(num,name,income,type);
		}
		for(int i=0; i<3; i++){
			o[i].developerDetails();
		}
		for(int i=0; i<3; i++){
			o2[i].adminDetails();
		}
	}
}
