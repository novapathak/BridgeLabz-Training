//Create class using random to perform calculation
public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
		  int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }
	//Method to perform calculation
 public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
		double[] values = new double [3];
		values[0] = (double) sum / numbers.length;
		values[1] = min;
		values[2] = max;
		return values;
    }
    public static void main(String[] args) {
  int[] numbers = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(numbers);
		System.out.println("Average: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }
}
