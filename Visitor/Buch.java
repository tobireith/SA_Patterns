package Klausurvorbereitung.Visitor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 12:09:40
 */
public class Buch extends Produkt {

	public Buch(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param b
	 */
	public void nimmEntgegen(Besucher b){
		b.besucheBuch();
	}
}//end Buch