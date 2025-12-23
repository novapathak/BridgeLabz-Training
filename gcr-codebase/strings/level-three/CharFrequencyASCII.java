import java.util.Scanner;
public class CharFrequencyASCII {
	// method to calcxulate frequency
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }
        String[][] result = new String[count][2];
        int k = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[k][0] = Character.toString((char) i);
                result[k][1] = Integer.toString(freq[i]);
                k++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
		
		//Create scanner object to take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = findFrequency(text);
        System.out.println("Character  Frequency");
		
		//Print result
        for (String[] row : freq) {
            System.out.println(row[0] + "          " + row[1]);
        }
    }
}
