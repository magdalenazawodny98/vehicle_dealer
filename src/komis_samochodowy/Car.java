package komis_samochodowy;

public class Car extends Vehicle {

	private String type;
	
	Car(int ID, String brand, String color, String model, double price, String type) {
		super(ID, brand, color, model, price);
		
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
