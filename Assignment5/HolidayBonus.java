package Assignment5;

public class HolidayBonus {
	
	public HolidayBonus()
	{
		
	}
	
	public static double[] calculateHolidayBonus(double[][] data)
	{
		double [] listOfBonus = new double [10];
		double highest = 0.0;
		double lowest = 0.0;
		double bonus = 0.0;
		double totalBonus = 0.0;
		for(int r = 0; r < data.length; r++)
		{
			totalBonus = 0;
			for(int c = 0; c<data[r].length; c++)
			{
				highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, c);
				lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, c);
				if (r == highest && data[r][c] >= 0)
				{
					bonus = 5000;
				}
				else if (r == lowest && data[r][c] >= 0)
				{
					bonus = 1000;
				}
				else if (data[r][c] < 0 || c > data[r].length-1)
				{
					bonus = 0;
				}
				else
				{
					bonus = 2000;
				}
				totalBonus += bonus;
			}
			listOfBonus[r] = totalBonus;
		}
		return listOfBonus;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double total = 0;
		double [] listOfBonus = new double [10];
		double highest = 0.0;
		double lowest = 0.0;
		double bonus = 0.0;
		double totalBonus = 0.0;
		for(int r = 0; r < data.length; r++)
		{
			totalBonus = 0;
			for(int c = 0; c<data[r].length; c++)
			{
				highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, c);
				lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, c);
				if (r == highest && data[r][c] >= 0)
				{
					bonus = 5000;
				}
				else if (r == lowest && data[r][c] >= 0)
				{
					bonus = 1000;
				}
				else if (data[r][c] < 0 || c > data[r].length-1)
				{
					bonus = 0;
				}
				else
				{
					bonus = 2000;
				}
				totalBonus += bonus;
			}
			listOfBonus[r] = totalBonus;
			total += listOfBonus[r];
		}
		
		return total;
	}
}
