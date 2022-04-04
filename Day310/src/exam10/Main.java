package exam10;

public class Main {

	public static void main(String[] args) {
		NomalCustomer c1 = new NomalCustomer();
		
		PremiumCustomer p1 = new PremiumCustomer();
		
		c1.buy("루이비통" , 3000000);
		p1.buy("루이비통" , 3000000);
	}

}
