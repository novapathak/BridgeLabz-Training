// Create method to find mean, short and tall height of tha players
public class FootballTeam {
	
	public static void main(String[] args){
		int[] heights = new int[11];
		for(int i = 0; i<11 ; i++){
        heights[i] = (int)(Math.random()*200)+150;
		}
		
		//Calling method
        int sum = sumOfHeights(heights);
        double mean = meanOfHeights(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        //Print results
        System.out.println("The sum of all the elements present in the array is "+ sum );
		System.out.println("The mean height of the players on the football team is "+mean);
		System.out.println("The shortest height of the players on the football team "+shortest);
		System.out.println("The tallest height of the players on the football team "+tallest);
	}
	public static int sumOfHeights(int[] h){
		int sum = 0;
		for(int i=0; i<h.length ; i++){
			sum+=h[i];
		}
		return sum;
	}
	public static int shortestHeight(int[] h){
		int shortt = h[0];
		for(int i=1;i<h.length; i++){
			if(h[i]<h[0]){
				shortt = h[i];
			}
		}
			return shortt;
		}
	public static int tallestHeight(int[] h){
		int tall = h[0];
		for(int i=1;i<h.length; i++){
			if(h[i]>h[0]){
				tall = h[i];
			}
		}
			return tall;
		}
    public static double meanOfHeights(int[] h){
		int count = 0;
		int sum = 0;
		for(int i=0; i<h.length; i++){
		    count++;
			sum += h[i];
		}
		double ans = sum/count;
		return ans;
	}
		 
		
}

		
