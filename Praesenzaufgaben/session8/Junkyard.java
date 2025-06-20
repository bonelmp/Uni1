package session8;
import java.util.ArrayList;
import java.util.Collection;

public class Junkyard {
	ArrayList<Vehicle> destroyed = new ArrayList <Vehicle>();
	
	public <T extends Vehicle> void destroyVehicle(Collection<? extends Vehicle> vehicles ) {
		for (Vehicle vehicle : vehicles) {
			if(vehicle.hasTuv == false) {
				destroyed.add(vehicle);
				vehicles.remove(vehicle);
			}
		}
	}

}
