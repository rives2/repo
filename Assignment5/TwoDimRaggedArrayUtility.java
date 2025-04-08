

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: holds methods for analyzing a file
 * Due:04/08/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ryan Ives
*/

public class TwoDimRaggedArrayUtility 
{
	
	public static double getAverage(double[][] data)
	{
		double sum = 0;
		int total = 0;
		for (int r = 0; r < data.length; r++) 
		{
            for (int c = 0; c < data[r].length; c++) 
            {
                sum += data[r][c];
                total++;
            }
		}
		return sum/total;
	}
	
	public static double getColumnTotal (double [][] data, int col)
	{
		
		double sum = 0;

		for (double[] row : data) 
		{
            if (col < row.length) 
            {
                sum += row[col];
            }
        }
        return sum;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double highest = data[0][0];
		for (int r = 0; r < data.length; r++) 
		{
            for (int c = 0; c < data[r].length; c++) 
            {
                if (data[r][c] > highest)
                {
                	highest = data[r][c];
                }
            }
		}
		return highest;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
       double highest = Double.NEGATIVE_INFINITY;
        for (double[] row : data) 
        {
            if (col < row.length && row[col] > highest) 
            {
                highest = row[col];
            }
        }
        return highest;
	}
	
	public static int getHighestInColumnIndex (double [][] data, int col)
	{
		double highest = Double.NEGATIVE_INFINITY;
        int index = -1;
        for (int r = 0; r < data.length; r++) 
        {
            if (col < data[r].length && data[r][col] > highest) 
            {
                highest = data[r][col];
                index = r;
            }
        }
		return index;
	}
	
	public static double getHighestInRow (double [][] data, int row)
	{
		
		double highest = data[row][0];
		for(int c = 0; c <data[row].length; c++)
		{
			if(data[row][c] > highest)
			{
				highest = data[row][c];
			}
		}
		
		return highest;
	}
	
	public static int getHighestInRowIndex (double [][] data, int row)
	{
		
		double highest = data[row][0];
		int index = 0;
		for(int c = 0; c <data[row].length; c++)
		{
			if(data[row][c] > highest)
			{
				highest = data[row][c];
				index = c;
			}
		}
		
		return index;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double lowest = data[0][0];
		for (int r = 0; r < data.length; r++) 
		{
            for (int c = 0; c < data[r].length; c++) 
            {
                if (data[r][c] < lowest)
                {
                	lowest = data[r][c];
                }
            }
		}
		return lowest;
	}
	
	public static double getLowestInColumn(double[][] data, int col) 
	{
		double lowest = Double.POSITIVE_INFINITY;
		for (int r = 0; r < data.length; r++)
		{
			if (col < data[r].length) 
			{
				if (data[r][col] < lowest) 
				{
					lowest = data[r][col];
				}
			}
		}
		return lowest;
	}
	public static int getLowestInColumnIndex (double [][] data, int col)
	{
		 double lowest = Double.POSITIVE_INFINITY;
	        int index = -1;
	        for (int r = 0; r < data.length; r++) 
	        {
	            if (col < data[r].length && data[r][col] < lowest) 
	            {
	                lowest = data[r][col];
	                index = r;
	            }
	        }
	        return index;
	    }
	
	public static double getLowestInRow (double [][] data, int row)
	{
		
		double lowest = data[row][0];
		for(int c = 0; c <data[row].length; c++)
		{
			if(data[row][c] < lowest)
			{
				lowest = data[row][c];
			}
		}
		
		return lowest;
	}
	
	public static int getLowestInRowIndex (double [][] data, int row)
	{
		
		double lowest = data[row][0];
		int index = 0;
		for(int c = 0; c <data[row].length; c++)
		{
			if(data[row][c] < lowest)
			{
				lowest = data[row][c];
				index = c;
			}
		}
		
		return index;
	}
	
	public static double getRowTotal (double [][] data, int row)
	{
		
		double sum =0;
		for(int c = 0; c <data[row].length; c++)
		{
			sum += data[row][c];
		}
		
		return sum;
	}
	
	public static double getTotal(double[][] data)
	{
		double sum = 0;
		for (int r = 0; r < data.length; r++) 
		{
            for (int c = 0; c < data[r].length; c++) 
            {
                sum += data[r][c];
            }
		}
		return sum;
	}
	
	public static double [][] readFile(File file) throws FileNotFoundException
	{
		double [][] tempData = new double[10][10];
		Scanner sc = new Scanner(file);
		int row = 0;
		int [] column = new int[10];
		
		while (sc.hasNextLine())
		{
			String line = sc.nextLine();
			String [] temp = line.split(" ");
			double [] array = new double [temp.length];
			
			
			for(int i = 0; i < array.length; i++)
			{
				array[i] = Double.parseDouble(temp[i]);
			}
			column[row] = array.length;
			tempData[row] = array;
			row++;
		}
		
		double [][] data = new double[row][];
		for (int i=0; i<row; i++)
		{
			data[i] = new double[column[i]];
			data[i] = tempData[i];
		}
		
		sc.close();
		return data;
	}
	
	public static void writeToFile (double data[][], File outputFile) throws FileNotFoundException
	{
		PrintWriter writer =  new PrintWriter(outputFile);
		
		for (int r = 0; r < data.length; r++) 
		{
            for (int c = 0; c < data[r].length; c++) 
            {
                writer.print(data[r][c] + " ");
            }
            writer.println();
		}
		
		writer.close();
	}
}