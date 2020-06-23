package fr.diginamic.maison;

/**Classe objet représentant des WC
 * Hérite de la classe Piece
 * @author formation
 *
 */
public class WC extends Piece {

	/** Constructeur
	 * @param superficie
	 * @param etage
	 */
	public WC(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String toString() {
		return "WC";
	}

}
