package lpf.learn.acwing.exercise;

import java.util.Scanner;

public class Q793 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] array1 = strToIntArray(str1);
        int[] array2 = strToIntArray(str2);


        int[] value = add(array1, array2);

        for (int i = value.length - 1; i >= 0; i--) {
            System.out.print(value[i]);
        }
    }

    private static int[] add(int[] array1, int[] array2) {
        if (array1.length < array2.length) {
            return add(array2, array1);
        }

        int[] result = new int[array1.length];
        int t = 0;

        for (int i = 0; i < array1.length; i++) {
            t += array1[i];
            if (i < array2.length) t += array2[i];

            result[i] = t % 10;
            t /= 10;
        }
        if (t != 0) {
            int[] newResult = new int[array1.length + 1];
            System.arraycopy(result, 0 , newResult, 0, array1.length);
            newResult[array1.length] = t;
            result = newResult;
        }

        return result;
    }


    private static int[] strToIntArray(String str) {
        int[] result = new int[str.length()];
        for (int i = str.length() - 1, j = 0; i >= 0; i--,j++) {
            result[j] = (str.charAt(i) - '0');
        }
        return result;
    }
}
