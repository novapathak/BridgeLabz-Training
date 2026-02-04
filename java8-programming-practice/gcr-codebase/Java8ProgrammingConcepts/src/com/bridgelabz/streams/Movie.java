package com.bridgelabz.streams;
import java.util.*;
import java.util.stream.*;
class TopMovie{
	String name;
	int year;
	double rating;
	
	public TopMovie(String name, int year, double rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie: " + name +", Rating: "+rating + ", Release Year: "+year;
	}
}
public class Movie {

	public static void main(String[]args) {
		
		List<TopMovie> m = new ArrayList<>();
		m.add(new TopMovie("DDLJ", 1999, 9.5));
		m.add(new TopMovie("YJHD", 2013, 9.7));
		m.add(new TopMovie("Dhurandar", 2025, 10));
		m.add(new TopMovie("Kal ho na ho", 2004, 10));
		m.add(new TopMovie("3idiots", 2016, 6.3));
		m.add(new TopMovie("KKHH", 2009, 7));
		
		m.stream().filter(x-> x.rating>=8).sorted((x1,x2)-> {
			if(x2.rating != x1.rating)
				return Double.compare(x2.rating, x1.rating);
			return Integer.compare(x2.year, x1.year);
		}).limit(5).forEach(System.out::println);
	}

}
