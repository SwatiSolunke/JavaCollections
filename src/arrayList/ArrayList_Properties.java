package arrayList;

import java.util.ArrayList;

public class ArrayList_Properties {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		// List Store or add Hetrogenious element(different types of objects)

		list.add("Swati"); // String object
		list.add(12.3333);// Float object
		list.add(10.02); // Double object
		list.add(10); // Integer objects
		list.add('A'); // Char objects
		list.add(true); // Float objects
		System.out.println("List element ="+list);

		// List Follow insertion order
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		System.out.println("List Element ="+list2); // [10, 20, 30]

		// List Allow Duplicate elements
		list2.add(10);
		list2.add(30);
		System.out.println("List Element ="+list2); //[10, 20, 30, 10, 30]

		// List Allow Multiple Null elements
		list2.add(null);
		list2.add(null);
		System.out.println("List Element ="+list2); //[10, 20, 30, 10, 30, null, null]
	}
}
