package session5;

public class PayPalPayment implements PaymentProvider {
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid" + amount + "$");

	}

	class CreditCardPayment implements PaymentProvider {

		@Override
		public void pay(double amount) {
			// TODO Auto-generated method stub
			System.out.println("Paid" + amount + "$");

		}

	}
	class CheckoutService {
		private PaymentProvider provider;
		
		public CheckoutService (PaymentProvider provider) {
			this.provider = provider;
		}
		
		public void processPayment(double amount) {
			provider.pay(amount);
		}
	}

	
	public static void main(String[] args) {
		

	}
	// 1) Zahlen und Process nicht in einer Klasse
	// 2) Open-Closed Principle, da man einfach neue Zahlungsmethoden hinzufügen kann
	// 3) Wir arbeiten mit den abstrakten Methoden und nicht zwingend mit den Klassen
	// 4) Wir setzen nicht vorraus, das gewisse Methoden die z.B nur PayPal hätte auch die Kreditkarte hat

}
