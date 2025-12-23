public class FrequencyUsingUnique {
	
	//method to check unique character
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[k++] = text.charAt(i);
        }
        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }
	
	//Main Method
    public static void main(String[] args) {
        String text = "programming";
        char[] unique = uniqueCharacters(text);
        System.out.println("Character  Frequency");
        for (char c : unique) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == c) count++;
            }
            System.out.println(c + "          " + count);
        }
    }
}
