package dustmqwkd;

public class Circle {
	
	public final static double PI = 3.14;
	public double area(double radius)	{
		return radius * radius * PI;
	}
	
	// 원 둘레 -> 2ㅍr
	public double round(double radius)	{
		double result;
		result = 2 * PI * radius;
		return result;
	}
	
}
