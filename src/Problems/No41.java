package Problems;

//����
//������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����� �� ���� �����̴�.
//
//push X: ���� X�� ť�� �ִ� �����̴�.
//pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ť�� ����ִ� ������ ������ ����Ѵ�.
//empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

import java.util.Scanner;

public class No41 {

	static int que[] = new int[1000];
	static int start = 0;
	static int end = 0;

	public void push(int n) {
		que[end] = n;
		end++;

	}

	public void pop(int n) {

		if (end == 0) {
			System.out.println("-1");
		}

		System.out.println(":" + que[start]);

		for (int i = 1; i < n; i++) {
			que[i - 1] = que[i];
			que[end - 1] = 0;
			end--;

		}

	}

	public void size() {

		System.out.println("" + end);

	}

	public void empty() {

		if (end == 0) {
			System.out.println("" + 1);
		}
		System.out.println("" + 0);

	}

	public void front() {

		if (end == 0) {
			System.out.println("" + (-1));
		}

		System.out.println("" + que[start]);

	}

	public void back() {

		if (end == 0) {
			System.out.println("" + (-1));
		}

		System.out.println("" + que[end - 1]);

	}

	public static void main(String args[]) {

		No41 no = new No41();

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {

			String str = in.next();

			// int start = 0;
			// int end = 0;

			switch (str) {

			case "push": {
				no.push(in.nextInt());
				break;
			}

			case "pop": {
				no.pop(n);
				break;
			}

			case "size": {
				no.size();
				break;
			}

			case "empty": {
				no.empty();
				break;
			}

			case "front": {
				no.front();
				break;
			}

			case "back": {
				no.back();
				break;
			}
			}

		}

	}
}
