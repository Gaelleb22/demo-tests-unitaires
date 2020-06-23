package fr.diginamic.maison;

/**Classe objet représentant une cuisine
 * Hérite de la classe Piece
 * @author formation
 *
 */
public class Cuisine extends Piece {

	/** Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String toString() {
		return "CUISINE";
	}

}
