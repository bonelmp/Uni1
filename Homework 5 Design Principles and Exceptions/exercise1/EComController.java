package exercise1;

public class EComController {

	public static void main(String[] args) throws MissingShippingInfoException, InvalidShippingInfoException, InvalidCustomerException {
		try {
			ShippingInfo info = new ShippingInfo(" Munich", 80331, "Germany ");
		
		Profile profile = new Profile(info);
		Customer customer = new Customer(profile, -1);
		System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getCity());
		}
		catch (MissingShippingInfoException | InvalidShippingInfoException | InvalidCustomerException e) {
			 System.out.println("Fehler bei der Kundenverarbeitung: " + e.getMessage());
		}

		// 2) Es handelt sich hier nicht um Dependency Injektion, da ich hier die
		// Abhängigkeiten manuell erstelle
		// 3) Der Code bricht den Law of Demeter, da hier ein Objekt nicht mit seinen
		// direkten "Freunden" kommuniziert bei Zeile 9.
		// Alternativ hätte man es so machen können, dass bei get.Profile() auch die
		// shippingInfo und die Stadt ausgegeben werden
	}
	//What generally happens if an exception is thrown but not caught?
// Das Programm wird einfach abgebrochen und eine Fehlermeldung wird angezeigt
	
	//Discuss the advantage of catching specific exceptions (e.g., InvalidShippingInfoException)
	//rather than just catching a general Exception.
//Dadurch weiß man direkt, was am Programm falsch ist, da man die illegal exception selsbt erstellt hat
	
	//Explain when a try with resources should be used an what its advantages are.
// Man solltetry with resources nutzen, wenn man mit etwas arbeitet, was nach dem benutzen geschlossen werden sollte z.B FileInputStream

}

class InvalidShippingInfoException extends Exception {
	public InvalidShippingInfoException(String message) {
		super(message);
	}

}

class MissingShippingInfoException extends Exception {
	public MissingShippingInfoException(String message) {
		super(message);
	}

}

class InvalidCustomerException extends Exception {
	public InvalidCustomerException(String message) {
		super(message);
	}

}

class Customer {
	private Profile profile;
	private int id;

	public Customer(Profile profile, int id) throws InvalidCustomerException {
		this.profile = profile;
		this.id = id;
		if(profile == null) {
			throw new InvalidCustomerException("Das Profil darf nicht leer sein.");
		}
		if(id < 0) {
			throw new InvalidCustomerException("Bitte geben Sie eine richtige ID ein.");
		}
		
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

class Profile {
	private ShippingInfo shippingInfo;

	public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
		this.shippingInfo = shippingInfo;
		if (shippingInfo == null) {
			throw new MissingShippingInfoException("Bitte füllen Sie die Shipping Info aus.");
		}
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

}

class ShippingInfo {
	private String city, country;
	private int zip;

	public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
		this.city = city;
		this.country = country;
		this.zip = zip;
		if (city == null || city.trim().isEmpty()) {
		    throw new InvalidShippingInfoException("Stadt darf nicht leer sein.");
		}
		if (zip < 0) {
			throw new InvalidShippingInfoException("Bitte geben Sie eine richtige Postleitzahl an.");
		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}
