package exercise1;

public class ShapeFactory {

	public static Shape fromString(String input) {
		if (input == null || !input.contains(":")) {
			throw new IllegalArgumentException("Ungültiger Input");
		}

		String[] parts = input.split(":", 2);
		String type = parts[0].trim();
		String params = parts[1].trim();

	}
}
