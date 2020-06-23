package fr.diginamic.maison;

/**Classe objet représentant une chambre
 * Hérite de la classe Piece
 * @author formation
 *
 */
public class Chambre extends Piece {

	/** Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String toString() {
		return "CHAMBRE";
	}

}
