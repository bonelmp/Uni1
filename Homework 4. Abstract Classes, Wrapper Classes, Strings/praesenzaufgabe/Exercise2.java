package praesenzaufgabe;

public class Exercise2 {
	public abstract class Vehicle {
		protected String id;
		protected double maxLoad; // kg

		public Vehicle(String id, double maxLoad) {
			this.id = id;
			this.maxLoad = maxLoad;
		}

		/**
		 * @return maximum distance (km) the vehicle can travel with current energy
		 */
		public abstract double getRange();

		/**
		 * @return fuel (or energy) needed in litres/kWh to drive the given distance
		 *         (km)
		 */
		public abstract double fuelNeeded(double distance);
	}

	// ---------- Interface for fuel-driven vehicles ----------
	public interface Refuelable {
		void refuel(double liters);

		double getFuelLevel();

		/**
		 * Default helper: can the vehicle travel 'distance ' km with current fuel?
		 * Works for any Refuelable that also extends Vehicle.
		 */
		default boolean canReach(double distance) {
			if (this instanceof Vehicle v) {
				return v.getRange() >= distance;
			}
			return false;
		}
	}

	// ---------- Interface for battery-driven vehicles ----------
	public interface Electrified {
		double MAX_BATTERY_KWH = 120.0;

		void charge(double kWh);

		double getBatteryLevel();
	}

	// ---------- Concrete Truck ----------
	public class Truck extends Vehicle implements Refuelable {
		// TODO: add attributes , constants and implement required methods
		private final double 

		public Truck(String id, double maxLoad, double tankCapacity) {
			super(id, maxLoad);
			// TODO: initialise attributes
			this.tankCapacity = tankCapacity;

		}
		// TODO: implement Vehicle + Refuelable methods
		@Override
		public double getRange() {
			return maxLoad;
			
		}
		@Override
		public double getFuel() {
			return maxLoad; 
		}
		public void refuel (double liters) {
			
		}
		@Override
		public double getFuelLevel() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public double fuelNeeded(double distance) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	// ---------- Concrete Electric Van ----------
	public class EVan extends Vehicle implements Electrified {
		// TODO: add attributes , constants and implement required methods
		public double batteryCapacity;
		public EVan(String id, double maxLoad, double batteryCapacity) {
			super(id, maxLoad);
			// TODO: initialise attributes
			this.batteryCapacity = batteryCapacity;
		}
		// TODO: implement Vehicle + Electrified methods
		public double getRange() {
			return
		}
		public double fuelNeeded(double distance) {
			return
		}
		@Override
		public void charge(double kWh) {
			if(this.batteryCapacity + khW > 120.0) {
				
			}
			
		}
		@Override
		public double getBatteryLevel() {
			// TODO Auto-generated method stub
			return this.batteryCapacity;
		}
		//Am besten noch Methode can reach anlegen
	}

	// ---------- Demo ----------
	public class FleetDemo {
		public static void main(String[] args) {
			// TODO: create a Truck and an EVan, test methods as described
		}
	}
	//Wann abstrakte Klassen verwenden und wann Interfaces
	//Interfaces sind allgemeiner, es können mehrere Implementiert werden
	//Abstrakte Methoden hat man schon ein Objekt wo man weiss das es erben wird. Es kann nur eine geerbt werden
	//Abstrakte Methoden können nicht final sein

}
