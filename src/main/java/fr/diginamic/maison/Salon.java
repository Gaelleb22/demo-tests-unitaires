package fr.diginamic.maison;

/**Classe objet représentant un salon
 * Hérite de la classe Piece
 * @author formation
 *
 */
public class Salon extends Piece {

	/** Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String toString() {
		return "SALON";
	}

}
