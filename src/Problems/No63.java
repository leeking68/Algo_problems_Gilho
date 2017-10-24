package Problems;
//���� 1912��   ���̳��� ���α׷��� 

import java.util.Scanner;

//https://www.acmicpc.net/problem/1912
public class No63 {
    static int n;
    static int[] array;
    static int[] cache;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        n = Integer.parseInt(scan.nextLine().trim());

        array = new int[n];
        cache = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println(consecutiveArrayCal());
    }

    static public int consecutiveArrayCal() {
        cache[0] = array[0];
        int max = cache[0];
        for (int i = 1; i < array.length; i++) {
            cache[i] = Math.max(array[i], array[i] + cache[i - 1]);
            System.out.println("what"+Math.max(array[i], array[i] + cache[i - 1]));
            cache[i] = Math.max(array[i], cache[i]);
            System.out.println("array:  "+array[i]+"  cache:  "+cache[i]+" i  :"+i);

            if (max < cache[i])
                max = cache[i];
        }
        return max;
    }
}


