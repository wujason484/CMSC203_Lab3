import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook gradeBook1;
	private GradeBook gradeBook2;
	@BeforeEach
	void setUp() throws Exception {
		gradeBook1=new GradeBook(5);
		gradeBook2=new GradeBook(5);
		gradeBook1.addScore(98.6);
		gradeBook1.addScore(65.7);
		gradeBook2.addScore(72.3);
		gradeBook2.addScore(86.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1=null;
		gradeBook2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradeBook1.toString().equals("98.6 65.7 "));
		assertTrue(gradeBook2.toString().equals("72.3 86.5 "));
		assertEquals(2,gradeBook1.getScoreSize());
		assertEquals(2,gradeBook2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(164.3,gradeBook1.sum(),.0001);
		assertEquals(158.8,gradeBook2.sum(),.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(65.7,gradeBook1.minimum(),.001);
		assertEquals(72.3,gradeBook2.minimum(),.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(98.6,gradeBook1.finalScore(),.001);
		assertEquals(86.5,gradeBook2.finalScore(),.001);
	}
}
