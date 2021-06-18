package komis_samochodowy;

public class Car extends Vehicle {

	private String fuelType;
	
	Car(int ID, String brand, String color, String model, double price, String fuelType) {
		super(ID, brand, color, model, price, VehicleType.CAR);
		
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
