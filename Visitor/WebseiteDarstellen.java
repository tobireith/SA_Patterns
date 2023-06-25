package Klausurvorbereitung.Visitor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 12:09:53
 */
public class WebseiteDarstellen extends Besucher {

	public WebseiteDarstellen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	@Override
	public void besucheBuch(){
		// Hier wird die spezifische Logik für den Besuch eines Buches in der Webseite implementiert
		System.out.println("Besuche Buch für Webseite");
	}

	@Override
	public void besucheDatentraeger(){
		// Hier wird die spezifische Logik für den Besuch eines Datenträgers in der Webseite implementiert
		System.out.println("Besuche Datenträger für Webseite");
	}

	@Override
	public void besucheLaptop() {
		// Hier wird die spezifische Logik für den Besuch eines Laptops in der Webseite implementiert
		System.out.println("Besuche Laptop für Webseite");
	}
}//end WebseiteDarstellen