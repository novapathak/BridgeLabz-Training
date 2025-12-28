import java.util.Scanner;

public class TrimCompare {

    public static int[] findTrimIndex(String text) {
        int start = 0, end = text.length() - 1;
        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substringUsingCharAt(String text, int s, int e) {
        String res = "";
        for (int i = s; i < e; i++) res += text.charAt(i);
        return res;
    }

    public static void main(String[] args) {
		//Create scanner object to take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = findTrimIndex(text);
        String userTrim = substringUsingCharAt(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println("Matched? " + userTrim.equals(builtIn));
    }
}
