package komis_samochodowy;

public class Vehicle implements IVehicle {
	private int ID;
	private String brand;
	private String color;
	private String model;
	private double price;
	private String type;
	protected Vehicle(int ID, String brand, String color, String model, double price, String type) {
		this.ID = ID;
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.price = price;
		this.setType(type);
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "Vehicle. \nBrand: " + brand + ", \nModel: " + model + ", \nColor: " + color + ", \nPrice: " + price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
