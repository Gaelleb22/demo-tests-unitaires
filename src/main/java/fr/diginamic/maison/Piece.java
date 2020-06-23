package fr.diginamic.maison;

/**Classe mère représentant une pièce dans une maison
 * @author formation
 *
 */
public abstract class Piece {
	
	/** superficie */
	private double superficie;
	/** étage */
	private int etage;
	
	/** Constructeur
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}

	@Override
	public String toString() {
		return null;
	}

	/** Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/** Setter
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}

}
