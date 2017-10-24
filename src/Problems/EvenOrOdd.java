package Problems;
public class EvenOrOdd {
	public String evenOrOdd(int num) {

		int mod = num % 2;
		String result = "";
		if (mod == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "1 2 3 4";
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
		System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
	}
}