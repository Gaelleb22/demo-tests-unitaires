package fr.diginamic.maison;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaisonTest {
	
	@Test
	public void testAjouterPieceWC() {
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		int nombreDePiece = maison.getPieces().length;
		assertEquals(1, nombreDePiece);
	}
	
	@Test
	public void testAjouterPieceMultiple() {
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		maison.ajouterPiece(new WC(2.0, 1));
		maison.ajouterPiece(new SalleDeBain(5.0, 1));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new Cuisine(5.0, 0));
		maison.ajouterPiece(new Chambre(10.0, 1));
		maison.ajouterPiece(new Chambre(10.0, 1));
		int nombreDePiece = maison.getPieces().length;
		assertEquals(7, nombreDePiece);
	}
	
	@Test
	public void testAjouterPieceNull() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		int nombreDePiece = maison.getPieces().length;
		assertEquals(0, nombreDePiece);
	}
	
	@Test
	public void testAjouterPieceEtageNegatif() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(10.0, -1));
		int nombreDePiece = maison.getPieces().length;
		assertEquals(0, nombreDePiece);
	}
	
	@Test
	public void testAjouterPieceSurfaceNegative() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(-10.0, 1));
		int nombreDePiece = maison.getPieces().length;
		assertEquals(0, nombreDePiece);
	}
	
	@Test
	public void testSuperficiePieceNomMinuscule() {
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		String superficie = maison.superficiePiece("wc");
		assertEquals("2.0", superficie);
	}
	
	@Test
	public void testSuperficiePieceOrthographeIncorrect() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(10.0, 0));
		String superficie = maison.superficiePiece("Chame");
		assertEquals("\"Piece inexistante\" ", superficie);
	}
	
	@Test
	public void testNombreDePieceNomMajuscule() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(10.0, 0));
		String nombre = maison.nombreDePiece("CHAMBRE");
		assertEquals("1", nombre);
	}
	
	@Test
	public void testNombreDePieceOrthographeIncorrect() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(10.0, 0));
		String nombre = maison.nombreDePiece("CHAM");
		assertEquals("\"Piece inexistante\" ", nombre);
	}
	
	@Test
	public void testSuperficieTotale0Piece() {
		Maison maison = new Maison();
		double superficie = maison.superficieTotale();
		assertEquals(0.0, superficie, 0);
	}
	
	@Test
	public void testSuperficieTotale() {
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		maison.ajouterPiece(new WC(2.0, 1));
		maison.ajouterPiece(new SalleDeBain(5.0, 1));
		double superficie = maison.superficieTotale();
		assertEquals(9.0, superficie, 0);
	}
	
	@Test
	public void testSuperficieEtage0Piece() {
		Maison maison = new Maison();
		double superficie = maison.superficieEtage(0);
		assertEquals(0.0, superficie, 0);
	}
	
	@Test
	public void testSuperficieEtage1() {
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		maison.ajouterPiece(new WC(2.0, 1));
		maison.ajouterPiece(new SalleDeBain(5.0, 1));
		double superficie = maison.superficieEtage(1);
		assertEquals(7.0, superficie, 0);
	}
	
	@Test
	public void testSuperficieEtageInexistant() {
		Maison maison = new Maison();
		maison.ajouterPiece(new WC(2.0, 0));
		maison.ajouterPiece(new WC(2.0, 1));
		maison.ajouterPiece(new SalleDeBain(5.0, 1));
		double superficie = maison.superficieEtage(5);
		assertEquals(0.0, superficie, 0);
	}

}
