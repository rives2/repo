package JUNIT_TESTING;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook grade1;
	private GradeBook grade2;
	
	@BeforeEach
	void setUp() {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(90);
		grade1.addScore(80);
		grade1.addScore(70);
		grade1.addScore(75);
		grade1.addScore(82);
		
		grade2.addScore(60);
		grade2.addScore(75);
		grade2.addScore(88);
		grade2.addScore(99);
		grade2.addScore(100);
		}

	@AfterEach
	void tearDown(){
		grade1 = null;
		grade2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(grade1.toString().equals("90.0 80.0 70.0 75.0 82.0 "));
		assertTrue(grade2.toString().equals("60.0 75.0 88.0 99.0 100.0 "));
		assertEquals(5, grade1.getScoreSize());
		assertEquals(5, grade2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(397, grade1.sum(), .0001);
		assertEquals(422, grade2.sum(), .0001);
		
	}

	@Test
	void testMinimum() {
		assertEquals(70.0, grade1.minimum(), .001);
		assertEquals(60.0, grade2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(327, grade1.finalScore());
		assertEquals(362, grade2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5, grade1.getScoreSize());
		assertEquals(5, grade2.getScoreSize());
	}

	@Test
	void testToString() {
		assertTrue(grade1.toString().equals("90.0 80.0 70.0 75.0 82.0 "));
		assertTrue(grade2.toString().equals("60.0 75.0 88.0 99.0 100.0 "));
	}

}
