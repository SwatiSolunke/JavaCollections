package sorting_of_linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Sorting {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Fronx");
		cars.add("Breeza");
		cars.add("GrandVitara");
		cars.add("Aura");

		// Sorting of LinkedList
		System.out.println("Before Sorting Elements:="+cars);//[Volvo, Fronx, Breeza, GrandVitara, Aura]
		Collections.sort(cars);
		System.out.println("After Sorting Elements:="+cars);//[Aura, Breeza, Fronx, GrandVitara, Volvo]

		//sort in reverse order
		Collections.sort(cars,Collections.reverseOrder());
		System.out.println("After Sorting in reverse Order:="+cars);//[Volvo, GrandVitara, Fronx, Breeza, Aura]
	}
}
