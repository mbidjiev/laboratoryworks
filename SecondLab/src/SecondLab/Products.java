package SecondLab;

public class Products {
	int cost;
	int shelfLife;
	boolean availability;
	private type type;
	
	public Products (int cost, int shelfLife, boolean availability) {
	this.cost = cost;
	this.shelfLife = shelfLife;
	this.availability = availability;
	this.type = type.Meat;
	}
	public void CheckProduct() {
		if (availability = false) {
			System.out.println("Product is not available.");
		}
		else {
		System.out.printf("%s is available. Cost - %s, shelf life - %s", type, cost, shelfLife);
		}
	}
}
