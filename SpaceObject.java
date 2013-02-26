package comets;
import java.util.*;

public abstract class SpaceObject
{
	public static int playfieldWidth;
	public static int playfieldHeight; 
	
	public double xPos;
	public double yPos;
	public double xVel;
	public double yVel;
	public int size;
	
	public class Comet extends SpaceObject
	{
		double xpos = super.xPos;
		double ypos = super.yPos;
		double xvel = super.xVel;
		double yvel = super.yVel;
		
		public Comet(double xpos, double ypos, double xvel, double yvel)
		{
			this.xpos = xpos;
			this.ypos = ypos;
			this.xvel = xvel;
			this.yvel = yvel;
		}
		
		public class LargeComet extends Comet
		{
			
			double xpos = super.xpos;
			double ypos = super.ypos;
			double xvel = super.xvel;
			double yvel = super.yvel;
			
			public LargeComet LargeComet()
			{
				return null;
			}
		}
		
		public class MediumComet extends Comet
		{
			public MediumComet MediumComet()
			{
				return null;
			}
		}
		
		public class SmallComet extends Comet
		{
			public SmallComet SmallComet()
			{
				return null;
			}
			
			public Vector<Comet> explode()
			{
				return null;
			}
		}
		
		public Vector<Comet> explode()
		{
			return null;
		}
		
		public boolean overlapping (Ship s)
		{
			return false;
		}
	}
	
	public class Ship extends SpaceObject
	{
		double xpos = super.xPos;
		double ypos = super.yPos;
		double xvel = super.xVel;
		double yvel = super.yVel;
		
		public Ship(double xpos, double ypos, double xvel, double yvel){
			xpos = 0;
			ypos = 0;
			xvel = 0;
			yvel = 0;
		}
		
		public void rotateLeft()
		{
			
		}
		
		public void rotateRight()
		{
			
		}
		
		public double getAngle()
		{
			return 0;
		}
		
		public Shot fire()
		{
			
			return null;
		}
		
		public boolean overlapping (Comet c)
		{
			return false;
		}
	}
	
	public class Shot extends SpaceObject
	{
		public int size;
		
		public void add(Shot s)
		{
			
		}
		
		public void remove(int x)
		{
			
		}
		
		public Shot elementAt(int x)
		{
			return null;
		}
		
		public boolean overlapping (Comet c)
		{
			return false;
		}
	}
	
	public void move()
	{
		
	}
	
	public void accelerate()
	{
		
	}
	
	public double getRadius()
	{
		return 0;
	}
	
	public double getXPosition()
	{
		return 0;
	}
	
	public double getYPosition()
	{
		return 0;
	}

	public int getAge()
	{
		return 0;
	}
}

