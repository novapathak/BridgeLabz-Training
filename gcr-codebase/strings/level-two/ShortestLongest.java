public class ShortestLongest {

    static int[] findMinMax(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = min;

        for (String[] row : data) {
            int len = Integer.parseInt(row[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        String[][] data = {
            {"Java", "4"}, {"Programming", "11"}, {"Is", "2"}, {"Fun", "3"}
        };

        int[] result = findMinMax(data);
        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
    }
}
