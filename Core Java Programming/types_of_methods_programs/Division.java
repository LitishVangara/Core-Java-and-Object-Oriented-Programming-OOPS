class Division 
{
	public static void findTime(int distance, int speed) 
	{
		int time=distance/speed;
		System.out.println("Length of the Bridge is = "+distance+" m");
		System.out.println("Boy Walking speed is = "+speed+" m/sec");
	    System.out.println("The Time taken by the boy to cross the Bridge is "+time+" sec.");
	}
	public static void main(String[] args) 
	{
		findTime(150,5);
	}
}
