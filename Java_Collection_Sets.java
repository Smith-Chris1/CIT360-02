import java.util.HashSet;
import java.util.*;
import java.util.Set;


public class Java_Collection_Sets {

	public static void main(String[] args) {
System.out.println("\f");
		Map mapA = new HashMap();

		mapA.put("Europe", "Denmark");
		mapA.put("North America", "United States");
		mapA.put("Asia", "South Korea");
		mapA.put("Africa", "Egypt");
		mapA.put("South America", "Bolivia");
		mapA.put("Australia", "Austrailia(its a country too)");
		Iterator iterator = mapA.keySet().iterator();
		while(iterator.hasNext()){
			Object key   = iterator.next();
			Object value = mapA.get(key);
			System.out.println("My favorite country on " + key +  " this continent is: " + value);
		}


		Set<String> countryList1 = new TreeSet<String>();
		
		if(countryList1.isEmpty()) {
			System.out.println("The best Country Set is empty\n");
		}
		
		countryList1.add("Canada");
		countryList1.add("United States");
		countryList1.add("Mexico");
		countryList1.add("Zealand");
		countryList1.add("1. Denmark");
		System.out.println("Adding items in no particular order to the set\n");
		System.out.println(countryList1);

		for(String element: countryList1){
			System.out.println(element + "\n");
		}
		
		if(countryList1.contains("3. Faroe Islands")) {
			System.out.println("Alias: FI");
		} else {
			countryList1.add("3. Faroe Islands");
		}
		
		System.out.println(countryList1);
		
		Set<String> countryList2 = new TreeSet<String>();
		System.out.println("\nAdding more countries to another list - some may overlap, lets intersect the lists and find out.\n");
		countryList2.add("2. Italy");
		countryList2.add("Austria");
		countryList2.add("Russia");
		countryList2.add("1. Denmark");
		countryList2.add("Japan");
		
		Set<String> intersection = new HashSet<String>(countryList1);

		intersection.retainAll(countryList2);
		
		System.out.println("Here are the intersecting items in each list: " + intersection + "\n");

		Set<String> difference = new HashSet<String>(countryList1);
	
		difference.removeAll(countryList2);
		
		System.out.println("The difference is: " + difference);
	}

}
