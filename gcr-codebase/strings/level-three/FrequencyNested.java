import java.util.Scanner;
public class FrequencyNested {
	
	//Method to check frequency
    public static String[] frequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
		//Stores result
        String[] result = new String[chars.length];
        int k = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[k++] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }
	
	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] result = frequency(text);
        for (String s : result) {
            if (s != null) System.out.println(s);
        }
    }
}
