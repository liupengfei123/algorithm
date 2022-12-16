package lpf.learn.acwing.exercise;

import java.util.*;

public class Q796 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.nextLine();
        int v2 = sc.nextInt();

        List<Integer> array1 = strToIntArray(str1);

        List<Integer> value = div(array1, v2);

        for (int i = value.size() - 2; i >= 0; i--) {
            System.out.print(value.get(i));
        }

        System.out.println();
        System.out.println(value.get(value.size() - 1));
    }

    private static List<Integer> div(List<Integer> array1, int v2) {
        List<Integer> result = new ArrayList<>();
        int t = 0;

        for (int i = array1.size() - 1; i >= 0; i--) {
            t = t * 10 + array1.get(i);

            result.add(t / v2);
            t %= v2;
        }

        Collections.reverse(result);

        while (result.size() > 1 && result.get(result.size() - 1) == 0) result.remove(result.size() - 1);

        result.add(t);
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
