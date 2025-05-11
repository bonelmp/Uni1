package exercise3;

public class Calculator {
	public static double divide(double a, double b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Man darf nicht durch 0 teilen!");
			return Double.NaN;
		}

	}
	// ...

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.divide(3, 0));

		try {
			System.out.println(Calculator.divide(3, 0));
		} catch(ArithmeticException e) {
			System.out.println("Fehler bei der Berechnung");
		}
		//Die Behandlung der exception macht in der main mehr sinn, da die methode divide bloß eine Rechnung ausführen soll
		// Die andere Variante wäre sinnvoller, wenn man eine Methode schreibt welche eine Benutzeroberfläche für einen Nutzer hat
	}

}
