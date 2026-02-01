package com.bridgelabz.generics.smartwarehousesystem;

public class Main {
	public static void main(String []args) {
		Storage<Electronics> electronicsStorage = new Storage<>();
		electronicsStorage.addItem(new Electronics("Laptop", 2));
		Storage<Groceries> groceriesStorage = new Storage<>();
		groceriesStorage.addItem(new Groceries("Milk", "12-02-2026"));
		


		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.addItem(new Furniture("Chair", "Wood"));
		

		System.out.println("---- Electronics ----");
		WarehouseWildCard.displayInfo(electronicsStorage.getItems());


		System.out.println("\n---- Groceries ----");
		WarehouseWildCard.displayInfo(groceriesStorage.getItems());


		System.out.println("\n---- Furniture ----");
		WarehouseWildCard.displayInfo(furnitureStorage.getItems());
		}
		}


