//Create method to check voting eligibility
public class VotingCheck {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 90);
        return ages;
    }

    static String[][] canVote(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] data = canVote(ages);

        System.out.println("AGE\tCAN VOTE");
        for (String[] row : data)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
