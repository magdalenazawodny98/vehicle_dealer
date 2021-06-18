package komis_samochodowy;

import java.util.List;

public abstract class VehicleDealerAbstract {
	public abstract List<Vehicle> filterVehicles(List<Vehicle> vehList, String filterType);
}
