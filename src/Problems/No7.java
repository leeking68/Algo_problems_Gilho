package Problems;
import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num;
		System.out.println("num : ");
		num = in.nextInt();

		while (num >= 10) {
			int sum = 0;

			while (num > 0) {

				sum += num % 10;

				num /= 10;
			}
			System.out.println("sum=" + sum);

			num = sum;

		} 
	}

}
