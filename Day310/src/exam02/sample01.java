package exam02;

public class sample01 {

	public static void main(String[] args) {
		/*
		 * 배열의 크기가 10인 배열을 선언하고 10 ~ 1 까지의 값으로
		 * 초기화 하도록 한다.
		 */
		
		int[] arr1 = new int[10];
		int init = 10;
		
		for(int i = 0; i < 10; i++) {
			arr1[i] = init--;
			System.out.print(arr1[i] + "\t");
		}
		System.out.print("\n");
		
		/*
		 * 배열의 크기가 10인 배열을 선언하고 2부터 시작해여 짝수값에 해당하는 값으로 초기화 한다.
		 */
		
		int[] arr2 = new int[10];
		init = 2;
		for(int i = 0; i < 10; i++) {
			arr2[i] = init;
			init += 2;
			System.out.print(arr2[i] + "\t");
		}
		System.out.print("\n");
		
		/*
		 * 배열의 크기가 5인 실수배열을 선언하고 1부터 시작해여 0.5씩 중가.
		 */
		
		double[] arr3 = new double[5];
		double init2 = 1;
		for(int i = 0; i < 5; i++) {
			arr3[i] = init2;
			init2 += 0.5;
			System.out.print(arr3[i] + "\t");
		}
		System.out.print("\n");
		
		/*
		 * 배열의 크기가 5인 문자배열을 선언하고 'A' ~ 'E'.
		 */
		
		char[] arr4 = new char[5];
		
		for(int i = 0; i < 5; i++) {
			arr4[i] = (char)('A'+i);
		}	
		for(int i = 0; i < 5; i++) {
			System.out.print(arr4[i] + "\t");
		}
		System.out.print("\n");
	}

}
