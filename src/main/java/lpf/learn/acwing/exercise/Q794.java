package lpf.learn.acwing.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q794 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int compare = compare(str1, str2);

        List<Integer> array1 = strToIntArray(str1);
        List<Integer> array2 = strToIntArray(str2);

        List<Integer> value = null;

        if (compare >= 0) {
            value = sub(array1, array2);
        } else {
            value = sub(array2, array1);
            System.out.print("-");
        }

        for (int i = value.size() - 1; i >= 0; i--) {
            System.out.print(value.get(i));
        }
    }

    private static List<Integer> sub(List<Integer> array1, List<Integer> array2) {
        List<Integer> result = new ArrayList<>();
        int t = 0;

        for (int i = 0; i < array1.size(); i++) {
            t = array1.get(i) - t;
            if (i < array2.size()) t -= array2.get(i);

            result.add((t + 10) % 10);

            t = t < 0 ? 1 : 0;
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) result.remove(result.size() - 1);

        return result;
    }

    private static int compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return str1.length() - str2.length();
        }
        for (int i = 0; i < str1.length(); i++) {
            int temp = str1.charAt(i) - str2.charAt(i);
            if (temp != 0) return temp;
        }
        return 0;
    }


    private static List<Integer> strToIntArray(String str) {
        List<Integer> result = new ArrayList(str.length());
        for (int i = str.length() - 1, j = 0; i >= 0; i--,j++) {
            result.add(str.charAt(i) - '0');
        }
        return result;
    }
}
