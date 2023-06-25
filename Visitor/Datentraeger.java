package Klausurvorbereitung.Visitor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 12:09:44
 */
public class Datentraeger extends Produkt {

	public Datentraeger(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param b
	 */
	public void nimmEntgegen(Besucher b){
		b.besucheDatentraeger();
	}
}//end Datentraeger