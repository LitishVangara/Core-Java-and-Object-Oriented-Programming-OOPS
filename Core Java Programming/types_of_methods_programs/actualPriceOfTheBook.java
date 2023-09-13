class actualPriceOfTheBook
{
	public static void book(int bookPrice, int gainOrProfit) 
	{
	    int actualPrice = bookPrice-gainOrProfit;
		System.out.println("Man sells the Book for = "+bookPrice+" Rupees");
		System.out.println("He got gain or profit of = "+gainOrProfit+" Rupees");
	    System.out.println("The Actual price of the Book is = "+actualPrice+" Rupees.");
	}
	public static void main(String[] args) 
	{
		book(170,25);
	}
}
