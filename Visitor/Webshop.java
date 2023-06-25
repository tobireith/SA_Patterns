package Klausurvorbereitung.Visitor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 12:09:55
 */
public class Webshop {

	public ContainerProdukte m_ContainerProdukte;
	public Besucher m_Besucher;

	public Webshop(){
		m_ContainerProdukte = new ContainerProdukte();
		m_Besucher = new RechnungDarstellen(); // Setze den Besucher auf RechnungDarstellen
	}

	public void finalize() throws Throwable {

	}

	public void produkteBesuchen(){
		// Beispielhafte Produkte erstellen
		Buch buch = new Buch();
		Datentraeger datentraeger = new Datentraeger();
		Laptop laptop = new Laptop();

		// Produkte dem Container hinzufügen
		m_ContainerProdukte.m_Produkt = buch;
		m_ContainerProdukte.m_Produkt.nimmEntgegen(m_Besucher);

		m_ContainerProdukte.m_Produkt = datentraeger;
		m_ContainerProdukte.m_Produkt.nimmEntgegen(m_Besucher);

		m_ContainerProdukte.m_Produkt = laptop;
		m_ContainerProdukte.m_Produkt.nimmEntgegen(m_Besucher);
	}

	public static void main(String[] args) {
		// Erstelle den Webshop
		Webshop webshop = new Webshop();

		// Erzeuge Produkte und setze den Besucher
		webshop.produkteBesuchen();

		// Beispielhafte Verwendung des Besuchers
		Besucher besucher = new WebseiteDarstellen();
		webshop.m_Besucher = besucher;
		webshop.produkteBesuchen();

		// Beispielhafte Verwendung des Besuchers
		besucher = new WarenkorbDarstellen();
		webshop.m_Besucher = besucher;
		webshop.produkteBesuchen();
	}
}//end Webshop