package Problems;
//30/28 �ٽ�Ǯ��
import java.util.Arrays;

public class No30 {

	public static void main(String args[]) {

		String[] input = { "a", "b", "c", "d", "e", "f", "g", "h" };

		String arr1[] = new String[(input.length/3)+1];
		String arr2[] = new String[(input.length/3)+1];
		String arr3[] = new String[(input.length/3)+1];
		int cnt = 0;
		for (int i = 0; i < input.length; i+=3) {
			
			arr1[cnt] = input[i];
			
			if ((i + 1) < input.length) {
				arr2[cnt] = input[i + 1];
			}

			if ((i + 2) < input.length) {
				arr3[cnt] = input[i + 2];
			}
			
//			i += 2;
			cnt++;
			
			if ((i + 3) > (input.length - 1)) {
				System.out.println("" + Arrays.deepToString(arr1) + "," + Arrays.deepToString(arr2) + ""
						+ Arrays.deepToString(arr3));
				return;
			}

		}

	}
}
