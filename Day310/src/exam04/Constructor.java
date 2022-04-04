package exam04;

public class Constructor {
	
	public int num1;
	
	public Constructor()	{
		
	}
	
	public Constructor(int num1)	{
		this.num1 = num1;
		System.out.println("int");
	}

	public Constructor(byte b)	{
		System.out.println("int");
	}
}
