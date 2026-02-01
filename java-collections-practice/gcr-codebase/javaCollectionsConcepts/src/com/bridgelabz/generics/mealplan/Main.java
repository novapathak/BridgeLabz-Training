package com.bridgelabz.generics.mealplan;

public class Main {
public static void main(String[]args) {
	
	Meal<Veg> veg = new Meal<>(new Veg());
	Meal<Vegan> vegan = new Meal<>(new Vegan());
	Meal<HighProtein> highprotein = new Meal<>(new HighProtein());
	
	MealWildCard.generateMeal(veg.getMealPlan());
}
}
