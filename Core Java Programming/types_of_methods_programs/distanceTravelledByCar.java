class distanceTravelledByCar
{
	public static void main(String[] args) 
	{
		findDistanceInMeters(120,3);
	}
	public static void findDistanceInMeters(int speed, int time)
	{
		int distanceInKiloMeters = findDistanceInKiloMeters(speed,time);
		int distanceInMeters = distanceInKiloMeters*1000;
		System.out.println("The Speed of Car is = "+speed+" Kilo Meters per Seconds");
		System.out.println("The Time to reach the Destination = "+time+" Hours");
		System.out.println("The Distance Travelled by Car is = "+distanceInMeters+" Meters");
	}
	public static int findDistanceInKiloMeters(int speed, int time)
	{
        int distanceInKiloMeters = speed*time;
		return distanceInKiloMeters;
	}
}
