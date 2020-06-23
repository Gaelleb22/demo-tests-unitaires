package fr.diginamic.maison;

/**Classe objet représentant une maison composée d'un tableau de type Piece
 * @author formation
 *
 */
public class Maison {
	
	/** pieces de la maison */
	private Piece[] pieces;

	/** Constructeur
	 * 
	 */
	public Maison() {
		this.pieces = new Piece[0];
	}
	
	/**méthode permettant d'ajouter une Piece au tableau
	 * @param nouvellePiece
	 * @return tableau pieces
	 */
	public Piece[] ajouterPiece(Piece nouvellePiece) {
		if(nouvellePiece == null) {
			System.out.println("Veuillez ajouter une piècce");
		}
		else if(nouvellePiece.getSuperficie()<=0 || nouvellePiece.getEtage()<0) {
			System.out.println("Attention, données incohérentes ! La superficie et les étages ne peuvent pas être négatifs.");
		}
		else {
			Piece[] temp = new Piece[pieces.length+1];
			for (int i=0; i<pieces.length; i++) {
				temp[i] = pieces[i];
			}
			temp[temp.length-1] = nouvellePiece;
			pieces = temp;
		}
		return pieces;
	}
	
	/**Méthode de calcul de la superficie totale de la maison
	 * @return superficie
	 */
	public double superficieTotale() {
		double superficie=0;
		for (int i=0; i<pieces.length; i++) {
			superficie += pieces[i].getSuperficie();
		}
		return superficie;
	}
	
	/**Méthode de calcul de la superficie d'un étage donné
	 * @param etage
	 * @return superficie
	 */
	public double superficieEtage(int etage) {
		double superficie=0;
		for (int i=0; i<pieces.length; i++) {
			if(etage == pieces[i].getEtage()) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}
	
	/**Méthode de calcul de la superficie des piéces d'un type donné
	 * @param nom de la piéce
	 * @return superficie
	 */
	public String superficiePiece(String nomPiece) {
		double superficie=0;
		String stSuperficie = null;
		if(nomPiece.equalsIgnoreCase("chambre") || nomPiece.equalsIgnoreCase("cuisine") || nomPiece.equalsIgnoreCase("salle de bain") || nomPiece.equalsIgnoreCase("salon") || nomPiece.equalsIgnoreCase("wc")) {
			for(int i=0; i<pieces.length; i++) {
				if(nomPiece.equalsIgnoreCase(pieces[i].toString())) {
					superficie += pieces[i].getSuperficie();
				}
			}
		stSuperficie = String.valueOf(superficie);
		}
		else {
			stSuperficie = "\"Piece inexistante\" ";
		}
		return stSuperficie;
	}
	
	/**Méthode de calcul du nombre de piéce d'un type donné
	 * @param nom de la piéce
	 * @return nombre
	 */
	public String nombreDePiece(String nomPiece) {
		int nombreDePiece = 0;
		String nombre = null;
		if(nomPiece.equalsIgnoreCase("chambre") || nomPiece.equalsIgnoreCase("cuisine") || nomPiece.equalsIgnoreCase("salle de bain") || nomPiece.equalsIgnoreCase("salon") || nomPiece.equalsIgnoreCase("wc")) {
			for(int i=0; i<pieces.length; i++) {
				if(nomPiece.equalsIgnoreCase(pieces[i].toString())) {
					nombreDePiece +=1;
				}
			}
		nombre = String.valueOf(nombreDePiece);
		}
		else {
			nombre = "\"Piece inexistante\" ";
		}
		return nombre;
	}

	/** Getter
	 * @return the pieces
	 */
	public Piece[] getPieces() {
		return pieces;
	}

	/** Setter
	 * @param pieces the pieces to set
	 */
	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

}
