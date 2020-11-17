package FifthLab;

public class Helicopter extends Tech{
	String model;
	double maxHeight;
	boolean isCombat;
	
	public Helicopter (String model, String country, int speed, int mass, double maxHeight, boolean isCombat) {
		this.maxHeight = maxHeight;
		this.country = country;
		this.speed = speed;
		this.mass = mass;
		this.model = model;
		this.isCombat = isCombat;
	}
	public void HelicInfo() {
		System.out.printf("Helicopter model '%s'\n", model);
		if(isCombat == true) System.out.println("Type - combat helicopter");
		else System.out.println("Type - civil helicopter\n");
		System.out.printf("Country - %s\n", country);
		System.out.printf("Maximal speed - %s\n", speed);
		System.out.printf("Mass - %s\n", mass);
		System.out.printf("Maximal height - %s\n", maxHeight);
	}
}
