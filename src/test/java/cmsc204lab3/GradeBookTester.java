package cmsc204lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook g1, g2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(96);
		g1.addScore(78);
		g1.addScore(89);
		
		g2.addScore(67);
		g2.addScore(79);
		g2.addScore(90);
		g2.addScore(100);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("96.0 78.0 89.0"));
		assertTrue(g2.toString().equals("67.0 79.0 90.0 100.0"));
	}

	@Test
	void testGetScoreSize() {
		assertEquals(g1.getScoreSize(), 3);
		assertEquals(g2.getScoreSize(), 4);
	}

	@Test
	void testSum() {
		assertEquals(g1.sum(), 263);
		assertEquals(g2.sum(), 336);
	}

	@Test
	void testMinimum() {
		assertEquals(g1.minimum(), 78);
		assertEquals(g2.minimum(), 67);
	}

	@Test
	void testFinalScore() {
		assertEquals(g1.finalScore(), 185);
		assertEquals(g2.finalScore(), 269);
	}
}
