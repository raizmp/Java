package Graphics;
interface Area
	{
		public double r(int l,int h);
		public double triangleArea(double l,double h);
		public double circleArea(double r);
		public double squareArea(int a);
	}
	public class Figures implements Area
	{
		public double r(int l,int h)
		{
			return(l*h);
		}
		public double triangleArea(double l,double h)
		{
			return(0.5*l*h);
		}
		public double squareArea(int a)
		{
			return(a*a);
		}
		public double circleArea(double r)
		{
			return(3.14*r*r);
		}
	}

	
	
