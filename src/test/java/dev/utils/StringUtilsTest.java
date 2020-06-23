package dev.utils;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {
	
	@Test
	public void testLevenshteinDistanceMotsIdentiques() {
		int resultat = StringUtils.levenshteinDistance("identique", "identique");
		assertEquals(0, resultat);
	}
	
	@Test
	public void testLevenshteinDistanceAjoutUneLettre() {
		int resultat = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1, resultat);
	}
	
	@Test
	public void testLevenshteinDistanceSuppressionUneLettre() {
		int resultat = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1, resultat);
	}
	
	@Test
	public void testLevenshteinDistanceAjoutEtSuppressionUneLettre() {
		int resultat = StringUtils.levenshteinDistance("chien", "chine");
		assertEquals(2, resultat);
	}
	
	@Test
	public void testLevenshteinDistanceRemplacementUneLettre() {
		int resultat = StringUtils.levenshteinDistance("machins", "machine");
		assertEquals(1, resultat);
	}
	
	@Test
	public void testLevenshteinDistancePlusieursChangement() {
		int resultat = StringUtils.levenshteinDistance("antipode", "podometre");
		assertEquals(8, resultat);
	}
	
//	@Test (expected = NullPointerException.class)
//	public void testLevenshteinDistanceNull() {
//		int resultat = StringUtils.levenshteinDistance(null, "chine");
//	}
	
	@Test
	public void testLevenshteinDistanceUnNull() {
		int resultat = StringUtils.levenshteinDistance(null, "chine");
		assertEquals(0, resultat);
	}
	
	@Test
	public void testLevenshteinDistanceNull() {
		int resultat = StringUtils.levenshteinDistance(null, null);
		assertEquals(0, resultat);
	}

}
