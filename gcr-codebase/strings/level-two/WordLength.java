import java.util.Scanner;

public class WordLength {

    static int findLength(String s) {
        int i = 0;
        try { while (true) s.charAt(i++); }
        catch (Exception e) { return i; }
    }

    static String[][] wordLength(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String[][] table = wordLength(words);

        System.out.println("WORD\tLENGTH");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
