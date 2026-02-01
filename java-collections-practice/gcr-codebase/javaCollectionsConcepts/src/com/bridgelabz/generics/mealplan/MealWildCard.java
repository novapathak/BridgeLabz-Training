package com.bridgelabz.generics.mealplan;

public class MealWildCard {
	public static <T extends MealPlan> void generateMeal(T meal) {
		System.out.println("validating meal plan: ");
		meal.prepareMeal();
	}

}
