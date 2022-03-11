package exam01;

public class sample05 {

	public static void main(String[] args) {
		// 1 ~ 99 까지 반복문을 사용하여 반복 출력 하시요. ( 단 초기값 설정은 int i = 1 로 한다. )
		
		// 1 ~ 99 까지 반복문을 사용하여 반복 출력 하시요. ( 단 초기값 설정은 int i = 0 로 한다. )
		
		//1 ~ 99 까지 반복문을 사용하여 반복 출력 하시요. ( 단 짝수에 해당하는 값만 출력하시요. )
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------");
		
		for(int i = 0; i < 99; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("---------");
		
		for(int i = 2; i < 100; i+=2) {
			System.out.println(i);
			}
	}

}
