
import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: holds test cases for HoldidayBonus class
 * Due:04/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ryan Ives
*/
public class HolidayBonusTestStudent 
{

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

	@Before
	public void setUp() throws Exception 
	{
		dataSet1 = TwoDimRaggedArrayUtility.readFile(file);
		dataSet2 = TwoDimRaggedArrayUtility.readFile(file2);
		dataSet3 = TwoDimRaggedArrayUtility.readFile(file3);
		dataSet4 = TwoDimRaggedArrayUtility.readFile(file4);
		district3 = TwoDimRaggedArrayUtility.readFile(file5);
		district4 = TwoDimRaggedArrayUtility.readFile(file6);
		district5 = TwoDimRaggedArrayUtility.readFile(file7);
	}

	@After
	public void tearDown() throws Exception 
	{
		dataSet1 = null;
		dataSet2 = null;
		dataSet3 = null;
		dataSet4 = null;
		district3 = null;
		district4 = null;
		district5 = null;
	}

	@Test
	public void testCalculateHolidayBonus() 
	{
		try 
		{
			double[] result = HolidayBonus.calculateHolidayBonus(district5);
			assertEquals(16000.0, result[0], .001);
			assertEquals(5000.0, result[1], .001);
			assertEquals(10000.0, result[2], .001);
			assertEquals(12000.0, result[3], .001);
			assertEquals(11000.0, result[4], .001);
			assertEquals(16000.0, result[5], .001);
			
			double[] result1 = HolidayBonus.calculateHolidayBonus(dataSet4);
			assertEquals(5000.0, result1[0], .001);
			assertEquals(5000.0, result1[1], .001);
			assertEquals(5000.0, result1[2], .001);
			assertEquals(7000.0, result1[3], .001);
			
			double[] result3 = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(3000.0, result3[0], .001);
			assertEquals(4000.0, result3[1], .001);
			assertEquals(15000.0, result3[2], .001);
			
			double[] result4 = HolidayBonus.calculateHolidayBonus(dataSet2);
			assertEquals(14000.0, result4[0], .001);
			assertEquals(1000.0, result4[1], .001);
			assertEquals(4000.0, result4[2], .001);
			assertEquals(13000.0, result4[3], .001);
			
			double[] result5 = HolidayBonus.calculateHolidayBonus(dataSet3);
			assertEquals(14000.0, result5[0], .001);
			assertEquals(1000.0, result5[1], .001);
			assertEquals(4000.0, result5[2], .001);
			assertEquals(13000.0, result5[3], .001);
			
			double[] result6 = HolidayBonus.calculateHolidayBonus(district3);
			assertEquals(17000.0, result6[0], .001);
			assertEquals(4000.0, result6[1], .001);
			assertEquals(12000.0, result6[2], .001);
			assertEquals(9000.0, result6[3], .001);
			assertEquals(6000.0, result6[4], .001);
			assertEquals(16000.0, result6[5], .001);
			
			double[] result7 = HolidayBonus.calculateHolidayBonus(district4);
			assertEquals(8000.0, result7[0], .001);
			assertEquals(3000.0, result7[1], .001);
			assertEquals(12000.0, result7[2], .001);
			assertEquals(9000.0, result7[3], .001);
			assertEquals(14000.0, result7[4], .001);
			assertEquals(21000.0, result7[5], .001);
		} catch (Exception e) 
		{
			fail("This should not have caused an Exception");
		}

	}


	@Test
	public void testCalculateTotalHolidayBonus() 
	{
		try
		{
		assertEquals(70000.0, HolidayBonus.calculateTotalHolidayBonus(district5), .001);
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet4), .001);
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet2), .001);
		assertEquals(32000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet3), .001);
		assertEquals(64000.0, HolidayBonus.calculateTotalHolidayBonus(district3), .001);
		assertEquals(67000.0, HolidayBonus.calculateTotalHolidayBonus(district4), .001);
		} catch (Exception e) 
		{
			fail("This should not have caused an Exception");
		}
	}
}

