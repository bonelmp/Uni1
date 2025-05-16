package ex2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class FractionTest {
	
	
	void Kehrwert() { 
		Fraction test = new Fraction(1, 2);
		test.Kehrwert();
		assertEquals(2, test.getZaehler());
		assertEquals(1, test.getNenner());
		//Methode hat gibt nicht wirklich den Kehrwert wieder, also kein Objekt und man darf nicht durch 0 teilen
		//Konstruktor war nicht ganz richtig
	}
	
	void multiplikation() {
		Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        f1.multiplikation(f2);
        assertEquals(3, f1.getZaehler());
        assertEquals(8, f1.getNenner());
        //Fehler hier ist, dass man nicht mit den Nenner/Zaehler des Übergabeparamters multipliziert
	}
	
	void addition() {
		Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        f1.addition(f2);
        assertEquals(5, f1.getZaehler());
        assertEquals(4, f1.getNenner());
        //Sie werden nicht auf einen gemeinsamen Nenner gebracht
	}
	@Test
	void kuerzen() {
		Fraction f1 = new Fraction(5, 10);
		f1.kuerzen();
		assertEquals(1, f1.getZaehler());
		assertEquals(2, f1.getNenner());
		//Es wird durch den ggT nicht geteilt und dies ist der Fehler
	}

}
