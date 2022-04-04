package dustmqwkd;

import java.util.Scanner;

public class dustmq01 {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10)	{
			i += 1;
			if(i % 3 == 0)	{
				System.out.println("i -> " + i);
			}else	{
				continue;
			}
		}
	}
}
