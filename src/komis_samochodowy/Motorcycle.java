package komis_samochodowy;

public class Motorcycle extends Vehicle {

	private String engineType;
	
	Motorcycle(int ID, String brand, String color, String model, double price, String engineType) {
		super(ID, brand, color, model, price, VehicleType.MOTORCYCLE);
		
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}


