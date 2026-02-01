package com.bridgelabz.collections.insurancepolicy;

import java.util.Comparator;

public class ExpiryComparator implements Comparator<Policy>{

	public int compare(Policy a,Policy b){
		return a.exp.compareTo(b.exp);
}

}
