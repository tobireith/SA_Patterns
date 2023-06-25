package Klausurvorbereitung.Visitor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 12:09:51
 */
public class WarenkorbDarstellen extends Besucher {

	public WarenkorbDarstellen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	@Override
	public void besucheBuch(){
		// Hier wird die spezifische Logik für den Besuch eines Buches in dem Warenkorb implementiert
		System.out.println("Besuche Buch für Warenkorb");
	}

	@Override
	public void besucheDatentraeger(){
		// Hier wird die spezifische Logik für den Besuch eines Datenträgers in dem Warenkorb implementiert
		System.out.println("Besuche Datenträger für Warenkorb");
	}

	@Override
	public void besucheLaptop() {
		// Hier wird die spezifische Logik für den Besuch eines Laptops in dem Warenkorb implementiert
		System.out.println("Besuche Laptop für Warenkorb");
	}
}//end WarenkorbDarstellen