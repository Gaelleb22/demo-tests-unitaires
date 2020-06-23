package fr.diginamic.maison;

/**Classe objet représentant une salle de bain
 * Hérite de la classe Piece
 * @author formation
 *
 */
public class SalleDeBain extends Piece {

	/** Constructeur
	 * @param superficie
	 * @param etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String toString() {
		return "SALLE DE BAIN";
	}

}
