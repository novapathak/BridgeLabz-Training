
public class VolumeOfEarth {
	public static void main(String args[]){
		
		//creating variable to assign value
		 int radiusOfEarth = 6378;
		 
		//calculating the voulume of earth in kilometers
		 double volumeOfEarthInKm = (4/3)* Math.PI* Math.pow(radiusOfEarth,3);
		 
		//calculating the voulume of earth in Miles
		 double volumeOfEarthInMiles = volumeOfEarthInKm/1.6;
		 
	    //displaying the volume of Earth
		 System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm +" and cubic miles is " + volumeOfEarthInMiles);
	}
}

		 
		 