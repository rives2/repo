

/*
 * Class: CMSC203 
 * Instructor: Monshi
 * Description: Methods for properties for the plot
 * Due: 04/22/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ryan Ives
*/

public class Plot {

	private int depth;
	private int width;
	private int x;
	private int y;
	
	public Plot()
	{
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
		
	}
	
	public Plot (int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot) {
	    this.x = otherPlot.x;
	    this.y = otherPlot.y;
	    this.width = otherPlot.width;
	    this.depth = otherPlot.depth;
	}
	
	public int getDepth()
	{
		return depth;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public boolean overlaps(Plot plot)
	{
		int a = this.x + this.width;
		int b = this.y + this.depth;
		int c = plot.getX() + plot.getWidth();
		int d = plot.getY() + plot.getDepth();

		
		if(((plot.getX() < a && plot.getX() > this.x) || (plot.getY() < b && plot.getY() > this.y)) || ((plot.getX() < this.x && c > this.x) || 
				plot.getY() < this.y && d > this.y) || ((plot.getX() >= this.x && plot.getX() <= a) && (plot.getY() >= this.y && plot.getY() <= b) &&
						(c <= a && d <= b)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean encompasses(Plot plot)
	{
		int a = this.x + this.width;
		int b = this.y + this.depth;
		int c = plot.getX() + plot.getWidth();
		int d = plot.getY() + plot.getDepth();
		
		if(((plot.getX() >= this.x && plot.getX() <= a) && (plot.getY() >= this.y && plot.getY() <= b)) && (c <= a && d <= b))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return x + "," + y + "," + width + "," + depth;
	}
}
