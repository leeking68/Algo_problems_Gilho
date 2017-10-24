package Problems;
import java.util.LinkedList;

public class No49 {

	public static void main(String args[]) {

		LinkedList list = new LinkedList();

		String[] A = { "A", "B", "C", "D", "E" };

		for (int i = 0; i < A.length; i++) {
			list.add(A[i]);
		}

		for (int i = 0; i < A.length; i++) {

			list.add(A[i]);

			list.poll();

			System.out.println(A[i] + "추�? " + list);

		}

		System.out.println("result   :   " + list);
	}

}
