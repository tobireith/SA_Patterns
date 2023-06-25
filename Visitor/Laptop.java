package Klausurvorbereitung.Visitor;


/**
 * @author capis
 * @version 1.0
 * @created 25-Jun-2023 12:09:46
 */
public class Laptop extends Produkt {

	public Laptop(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param b
	 */
	public void nimmEntgegen(Besucher b){
		b.besucheLaptop();
	}
}//end Laptop