class batting
{
	public static int overs = 6; 
	public void bat()
	{
		System.out.println("Batting for 20 overs.");
		bowling o1 = new bowling();
		System.out.println(o1.balls);
	}
}
class bowling
{
	public int balls = 11;
	public static void bowl()
	{
		System.out.println("Balls for an over.");
		System.out.println(batting.overs);
	}
}
class batBowl 
{
	public static void main(String[] args) 
	{
		batting o1 = new batting();
		o1.bat();
		bowling.bowl();
	}
}