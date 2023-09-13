class class1
{
	public String bottleMaterial;
	public String brandName;
	public double quantity;
	public int bottlePrice;
	public String bottleTagLine;
	public class1 (String bottleMaterial, String brandName, double quantity, int bottlePrice, String bottleTagLine)
	{
		this.bottleMaterial = bottleMaterial;
		this.brandName = brandName;
		this.quantity = quantity;
		this.bottlePrice = bottlePrice;
		this.bottleTagLine = bottleTagLine;
	}
	public void details()
	{
		System.out.println("Details of the Water Bottle : ");
		System.out.println("Material of the Water Bottle = "+bottleMaterial);
		System.out.println("Brand Name of the Water Bottle = "+brandName);
		System.out.println("Quantity of the Water in Bottle = "+quantity+"Liters.");
		System.out.println("Price of the Water Bottle = "+bottlePrice+"Rs.");
		System.out.println("TagLine of the Water Bottle = "+bottleTagLine);
		System.out.println("-------------------------------------------------");
	}
}
class waterBottle
{
	public static void main(String[] args) 
	{
		class1 o1 = new class1("Steel.", "Bisleri.", 1.5, 20, "Water is not tasteless! Feel it.");
		class1 o2 = new class1("Plastic.", "Kinley.", 2.9, 30, "As sparkling as your own self.");
		class1 o3 = new class1("Metal.", "AquaWater.", 2.5, 25, "Make your taste buds go crazy.");
		o1.details();
		o2.details();
		o3.details();
	}
}
