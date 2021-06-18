package komis_samochodowy;

public class Motorcycle extends Vehicle {

	private String type;
	private String engineType;
	
	Motorcycle(int ID, String brand, String color, String model, double price, String type, String engineType) {
		super(ID, brand, color, model, price);
		
		this.type = type;
		this.type = engineType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}


