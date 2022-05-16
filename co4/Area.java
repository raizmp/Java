import Graphics.*;
public class Area
{
	public static void main(String[] args)
	{
		Figures s = new Figures();
		System.out.println("area of rectangle is.."+ s.r(5,5));
		System.out.println("area of triangle is.."+ s.triangleArea(2.0,5.0));
		System.out.println("area of square is.."+ s.squareArea(8));
		System.out.println("area of circle is.."+ s.circleArea(5.0));
	}
}
	
		
