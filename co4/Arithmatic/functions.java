package Arithmatic;

interface Operations
	{
		public double add(int a,int b);
		public double sub(int a,int b);
		public double mul(int a,int b);
		public double div(double a,double b);
	}
	public class functions implements Operations
	{
		public double add(int a, int b)
		{
			return(a+b);
		}
		public double sub(int a,int b)
		{
			return(a-b);
		}
		public double mul(int a,int b)
		{
			return(a*b);
		}
		public double div(double a,double b)
		{
			return(a/b);
		}
	}
		
