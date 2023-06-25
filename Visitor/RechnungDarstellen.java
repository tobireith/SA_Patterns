package Klausurvorbereitung.Visitor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 12:09:50
 */
public class RechnungDarstellen extends Besucher {

	public RechnungDarstellen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	@Override
	public void besucheBuch(){
		// Hier wird die spezifische Logik für den Besuch eines Buches in der Rechnung implementiert
		System.out.println("Besuche Buch für Rechnung");
	}

	@Override
	public void besucheDatentraeger(){
		// Hier wird die spezifische Logik für den Besuch eines Datenträgers in der Rechnung implementiert
		System.out.println("Besuche Datenträger für Rechnung");
	}

	@Override
	public void besucheLaptop(){
		// Hier wird die spezifische Logik für den Besuch eines Laptops in der Rechnung implementiert
		System.out.println("Besuche Laptop für Rechnung");
	}
}//end RechnungDarstellen