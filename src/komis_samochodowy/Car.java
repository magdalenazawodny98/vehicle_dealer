package komis_samochodowy;

public class Car extends Vehicle {

	private String type;
	private String fuelType;
	
	Car(int ID, String brand, String color, String model, double price, String type, String fuelType) {
		super(ID, brand, color, model, price);
		
		this.type = type;
		this.type = fuelType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
