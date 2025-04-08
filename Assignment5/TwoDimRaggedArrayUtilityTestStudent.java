package Assignment5;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents test cases for a TwoDimRaggedArrayUtility object.
 * 
 * @author Ryan Ives
 * 
 */
public class TwoDimRaggedArrayUtilityTestStudent {
	private File file = new File("dataSet1.txt");
	private double [][] dataSet1;
	private File file2 = new File("dataSet2.txt");
	private double [][] dataSet2;
	private File file3 = new File("dataSet3.txt");
	private double [][] dataSet3;
	private File file4 = new File("dataSet4.txt");
	private double [][] dataSet4;
	private File file5 = new File("district3.txt");
	private double [][] district3;
	private File file6 = new File("district4.txt");
	private double [][] district4;
	private File file7 = new File("district5.txt");
	private double [][] district5;
	
	private File outFile = new File("outFile.txt");
	
	@Before
	public void setUp() throws Exception {
		dataSet1 = TwoDimRaggedArrayUtility.readFile(file);
		dataSet2 = TwoDimRaggedArrayUtility.readFile(file2);
		dataSet3 = TwoDimRaggedArrayUtility.readFile(file3);
		dataSet4 = TwoDimRaggedArrayUtility.readFile(file4);
		district3 = TwoDimRaggedArrayUtility.readFile(file5);
		district4 = TwoDimRaggedArrayUtility.readFile(file6);
		district5 = TwoDimRaggedArrayUtility.readFile(file7);
	}

	@After
	public void tearDown() throws Exception {
		dataSet1 = null;
		dataSet2 = null;
		dataSet3 = null;
		dataSet4 = null;
		district3 = null;
		district4 = null;
		district5 = null;
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(4.5,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
		assertEquals(5.417,TwoDimRaggedArrayUtility.getAverage(dataSet2),.001);
		assertEquals(5.942,TwoDimRaggedArrayUtility.getAverage(dataSet3),.001);
		assertEquals(-0.3,TwoDimRaggedArrayUtility.getAverage(dataSet4),.001);
		assertEquals(3.149,TwoDimRaggedArrayUtility.getAverage(district3),.001);
		assertEquals(3567.101,TwoDimRaggedArrayUtility.getAverage(district4),.001);
		assertEquals(40303.386,TwoDimRaggedArrayUtility.getAverage(district5),.001);
	}
	
	@Test
	public void testGetColumnTotal() {
		assertEquals(11,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0),.001);
		assertEquals(9.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 1),.001);
		assertEquals(7.5,TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 3),.001);
		assertEquals(2.6,TwoDimRaggedArrayUtility.getColumnTotal(dataSet4, 3),.001);
		assertEquals(16.7,TwoDimRaggedArrayUtility.getColumnTotal(district3, 0),.001);
		assertEquals(28293.42,TwoDimRaggedArrayUtility.getColumnTotal(district4, 3),.001);
		assertEquals(111906.9,TwoDimRaggedArrayUtility.getColumnTotal(district5, 5),.001);
		
	}
	
	@Test
	public void testGetHighestInArray() {
		assertEquals(8.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet1),.001);
		assertEquals(11.0,TwoDimRaggedArrayUtility.getHighestInArray(dataSet2),.001);
		assertEquals(11.6,TwoDimRaggedArrayUtility.getHighestInArray(dataSet3),.001);
		assertEquals(8.2,TwoDimRaggedArrayUtility.getHighestInArray(dataSet4),.001);
		assertEquals(8.26,TwoDimRaggedArrayUtility.getHighestInArray(district3),.001);
		assertEquals(8935.26,TwoDimRaggedArrayUtility.getHighestInArray(district4),.001);
		assertEquals(89352.68,TwoDimRaggedArrayUtility.getHighestInArray(district5),.001);
		
		
	}
	
	@Test
	public void testGetHighestInColumn() {
		assertEquals(6.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0),.001);
		assertEquals(6.0,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet2, 1),.001);
		assertEquals(9.3,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet3, 2),.001);
		assertEquals(2.6,TwoDimRaggedArrayUtility.getHighestInColumn(dataSet4, 3),.001);
		assertEquals(4.50,TwoDimRaggedArrayUtility.getHighestInColumn(district3, 1),.001);
		assertEquals(6598.23,TwoDimRaggedArrayUtility.getHighestInColumn(district4, 5),.001);
		assertEquals(48962.34,TwoDimRaggedArrayUtility.getHighestInColumn(district5, 0),.001);
		
		
	}
	
	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(2.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0),.001);
		assertEquals(3.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet2, 1),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet3, 2),.001);
		assertEquals(3.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet4, 3),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(district3, 1),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(district4, 5),.001);
		assertEquals(2.0,TwoDimRaggedArrayUtility.getHighestInColumnIndex(district5, 0),.001);
		
	}
	
	@Test
	public void testGetHighestInRow() {
		assertEquals(3.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 0),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSet2, 1),.001);
		assertEquals(8.1,TwoDimRaggedArrayUtility.getHighestInRow(dataSet3, 2),.001);
		assertEquals(7.3,TwoDimRaggedArrayUtility.getHighestInRow(dataSet4, 3),.001);
		assertEquals(5.48,TwoDimRaggedArrayUtility.getHighestInRow(district3, 3),.001);
		assertEquals(5499.29,TwoDimRaggedArrayUtility.getHighestInRow(district4, 2),.001);
		assertEquals(75324.57,TwoDimRaggedArrayUtility.getHighestInRow(district5, 0),.001);
	}
	
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(2.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 0),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2, 1),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet3, 2),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet4, 2),.001);
		assertEquals(2.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(district3, 4),.001);
		assertEquals(3.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(district4, 0),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getHighestInRowIndex(district5, 1),.001);
		
	}
	
	@Test
	public void testGetLowestInArray() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(dataSet1),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInArray(dataSet2),.001);
		assertEquals(1.7,TwoDimRaggedArrayUtility.getLowestInArray(dataSet3),.001);
		assertEquals(-7.5,TwoDimRaggedArrayUtility.getLowestInArray(dataSet4),.001);
		assertEquals(-5.48,TwoDimRaggedArrayUtility.getLowestInArray(district3),.001);
		assertEquals(-3.24,TwoDimRaggedArrayUtility.getLowestInArray(district4),.001);
		assertEquals(12536.54,TwoDimRaggedArrayUtility.getLowestInArray(district5),.001);
		
	}
	
	@Test
	public void testGetLowestInColumn() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0),.001);
		assertEquals(2.0,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 3),.001);
		assertEquals(1.7,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet3, 1),.001);
		assertEquals(-7.5,TwoDimRaggedArrayUtility.getLowestInColumn(dataSet4, 1),.001);
		assertEquals(3.43,TwoDimRaggedArrayUtility.getLowestInColumn(district3,4),.001);
		assertEquals(4592.45,TwoDimRaggedArrayUtility.getLowestInColumn(district4, 5),.001);
		assertEquals(12536.54,TwoDimRaggedArrayUtility.getLowestInColumn(district5, 0),.001);
		
		
	}
	
	@Test
	public void testGetLowestInColumnIndex() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0),.001);
		assertEquals(2.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 1),.001);
		assertEquals(3.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet3, 3),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet4, 0),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(district3, 2),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(district4, 4),.001);
		assertEquals(3.0,TwoDimRaggedArrayUtility.getLowestInColumnIndex(district5, 3),.001);
		
	}
	
	@Test
	public void testGetLowestInRow() {
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0),.001);
		assertEquals(5.0,TwoDimRaggedArrayUtility.getLowestInRow(dataSet2, 1),.001);
		assertEquals(2.7,TwoDimRaggedArrayUtility.getLowestInRow(dataSet3, 3),.001);
		assertEquals(-7.5,TwoDimRaggedArrayUtility.getLowestInRow(dataSet4, 2),.001);
		assertEquals(2.38,TwoDimRaggedArrayUtility.getLowestInRow(district3, 5),.001);
		assertEquals(2.29,TwoDimRaggedArrayUtility.getLowestInRow(district4, 2),.001);
		assertEquals(22563.87,TwoDimRaggedArrayUtility.getLowestInRow(district5, 5),.001);
		
	}
	
	@Test
	public void testGetLowestInRowIndex() {
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0),.001);
		assertEquals(0.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet2, 1),.001);
		assertEquals(3.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet3, 3),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet4, 2),.001);
		assertEquals(2.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(district3, 5),.001);
		assertEquals(1.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(district4, 2),.001);
		assertEquals(2.0,TwoDimRaggedArrayUtility.getLowestInRowIndex(district5, 5),.001);
		
	}
	
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
		assertEquals(12.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet2,2),.001);
		assertEquals(28.5,TwoDimRaggedArrayUtility.getRowTotal(dataSet3,3),.001);
		assertEquals(-0.2,TwoDimRaggedArrayUtility.getRowTotal(dataSet4,3),.001);
		assertEquals(10.79,TwoDimRaggedArrayUtility.getRowTotal(district3,4),.001);
		assertEquals(29000.01,TwoDimRaggedArrayUtility.getRowTotal(district4,5),.001);
		assertEquals(254936.69,TwoDimRaggedArrayUtility.getRowTotal(district5,0),.001);
	}
	
	@Test
	public void testGetTotal() {
		assertEquals(36.0,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
		assertEquals(65.0,TwoDimRaggedArrayUtility.getTotal(dataSet2),.001);
		assertEquals(71.3,TwoDimRaggedArrayUtility.getTotal(dataSet3),.001);
		assertEquals(-3.3,TwoDimRaggedArrayUtility.getTotal(dataSet4),.001);
		assertEquals(85.03,TwoDimRaggedArrayUtility.getTotal(district3),.001);
		assertEquals(99878.82,TwoDimRaggedArrayUtility.getTotal(district4),.001);
		assertEquals(1168798.18,TwoDimRaggedArrayUtility.getTotal(district5),.001);
		
	}
	
	@Test
	public void testReadFile() throws FileNotFoundException {
		assertArrayEquals(dataSet1,TwoDimRaggedArrayUtility.readFile(file));
		assertArrayEquals(dataSet2,TwoDimRaggedArrayUtility.readFile(file2));
		assertArrayEquals(dataSet3,TwoDimRaggedArrayUtility.readFile(file3));
		assertArrayEquals(dataSet4,TwoDimRaggedArrayUtility.readFile(file4));
		assertArrayEquals(district3,TwoDimRaggedArrayUtility.readFile(file5));
		assertArrayEquals(district4,TwoDimRaggedArrayUtility.readFile(file6));
		assertArrayEquals(district5,TwoDimRaggedArrayUtility.readFile(file7));
		
	}
	
	@Test
	public void testWriteToFile() throws FileNotFoundException {
		TwoDimRaggedArrayUtility.writeToFile(dataSet1, outFile);
		assertArrayEquals(dataSet1,TwoDimRaggedArrayUtility.readFile(outFile));
		TwoDimRaggedArrayUtility.writeToFile(dataSet2, outFile);
		assertArrayEquals(dataSet2,TwoDimRaggedArrayUtility.readFile(outFile));
		TwoDimRaggedArrayUtility.writeToFile(dataSet3, outFile);
		assertArrayEquals(dataSet3,TwoDimRaggedArrayUtility.readFile(outFile));
		TwoDimRaggedArrayUtility.writeToFile(dataSet4, outFile);
		assertArrayEquals(dataSet4,TwoDimRaggedArrayUtility.readFile(outFile));
		TwoDimRaggedArrayUtility.writeToFile(district3, outFile);
		assertArrayEquals(district3,TwoDimRaggedArrayUtility.readFile(outFile));
		TwoDimRaggedArrayUtility.writeToFile(district4, outFile);
		assertArrayEquals(district4,TwoDimRaggedArrayUtility.readFile(outFile));
		TwoDimRaggedArrayUtility.writeToFile(district5, outFile);
		assertArrayEquals(district5,TwoDimRaggedArrayUtility.readFile(outFile));
		
	}
}

