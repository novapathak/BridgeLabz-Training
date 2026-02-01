package com.bridgelabz.generics.smartwarehousesystem;
import java.util.List;

public class WarehouseWildCard {
public static void displayInfo(List<? extends WarehouseItem> items) {
	for(WarehouseItem item : items) {
		item.displayInfo();
	}
}
}
