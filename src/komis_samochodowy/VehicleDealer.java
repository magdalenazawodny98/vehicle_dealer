package komis_samochodowy;

import java.util.ArrayList;
import java.util.List;

public class VehicleDealer {
	private List<Vehicle> vehicleList;
	private VehicleDealer() {
		vehicleList = new ArrayList<>();
	}
	
	public List<Vehicle> getVehicleList(){
		return vehicleList;
	}
	
	public void addVehicleToList(Vehicle vehicle) {
		vehicleList.add(vehicle); 
	}
}
