package lpf.learn.acwing.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q795 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.nextLine();
        int v2 = sc.nextInt();

        List<Integer> array1 = strToIntArray(str1);

        List<Integer> value = mul(array1, v2);

        for (int i = value.size() - 1; i >= 0; i--) {
            System.out.print(value.get(i));
        }
    }

    private static List<Integer> mul(List<Integer> array1, int v2) {
        List<Integer> result = new ArrayList<>();
        int t = 0;

        for (int i = 0; i < array1.size() || t != 0; i++) {
            if (i < array1.size()) t += array1.get(i) * v2;

            result.add(t % 10);
            t /= 10;
        }
        while (result.size() > 1 && result.get(result.size() - 1) == 0) result.remove(result.size() - 1);

        return result;
    }

    private static List<Integer> strToIntArray(String str) {
        List<Integer> result = new ArrayList(str.length());
        for (int i = str.length() - 1, j = 0; i >= 0; i--,j++) {
            result.add(str.charAt(i) - '0');
        }
        return result;
    }
}
