package exercise_3;

interface Switchable {
	// TODO: implement
	public void turnOn();

	public void turnOff();

	public boolean isOn();
}

interface Dimmable {
	public final int MAX_BRIGHTNESS = 100;

	public void setBrightness(int level);

	public int getBrightness();

	public default void dimToHalf() {
		setBrightness(MAX_BRIGHTNESS / 2);
	}
}

class Lamp implements Switchable, Dimmable {

	public boolean on;
	public int brightness;

	@Override
	public void turnOn() {
		this.on = true;
	}

	@Override
	public void turnOff() {
		this.on = false;
	}

	@Override
	public boolean isOn() {
		if (this.on) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getBrightness() {
		return this.brightness;

	}

	@Override
	public void setBrightness(int level) {
		if (this.on) {
			this.brightness = level;
		} else {
			System.out.println("Die Lampe ist nicht an.");
		}
		if (this.brightness < 0 || this.brightness > MAX_BRIGHTNESS) {
			System.out.println("Ungültiger Wert.");
		}

	}
}

class LampDemo {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		// turn on, set brightness, dim to half, print result
		lamp.turnOn();
		lamp.setBrightness(80);
		lamp.dimToHalf();
		System.out.println("Brightness: " + lamp.getBrightness());
	}
}
