import java.util.Scanner;

public class TrimCompare {

    static int[] findTrimIndex(String text) {
        int start = 0, end = text.length() - 1;
        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    static String substringUsingCharAt(String text, int s, int e) {
        String res = "";
        for (int i = s; i < e; i++) res += text.charAt(i);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = findTrimIndex(text);
        String userTrim = substringUsingCharAt(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println("Matched? " + userTrim.equals(builtIn));
    }
}
