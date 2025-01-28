package arrayList_Methods;

import java.util.ArrayList;

public class ArrayList_Methods {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// add(Object o)==> With the help of this method we can add objects in list
		list.add("Swati");
		list.add("shankar");

		System.out.println("List Elements ="+list); //[Swati, shankar]

		/* add(int index,Object o)==> It is used to insert specified element at the
		 * specified position in list*/
		list.add(1, "Shashwat");
		System.out.println("List Elements After add ="+list); //[Swati, Shashwat, shankar]

		// get(int index)==> With the help of this method to get or acheive specific element from the list
		System.out.println("List Elements After get ="+list.get(1)); //Shashwat 

		// set()==> it is used to replaced element in list at the specified postion
		list.set(0, "Solunke");
		System.out.println("After Set method List Element ="+list); //[Solunke, Shashwat, shankar]

		// contains(Object o)==>It returns true if the list contains the specified element.
		System.out.println("After Contains method ="+list.contains("Shashwat")); //true

		// size()==>It is gives the arraylist size
		System.out.println("List Size ="+list.size());//3

		// isEmpty()==> It is returns true if the list is empty otherwise returns false
		System.out.println("List is Empty or not ="+list.isEmpty()); //false

		// remove()==>To remove the specific element from the list(as per provied index)
		list.remove(2);
		System.out.println("After Remove Arraylist Elements ="+list); //[Solunke, Shashwat]

		// remove()==>It is used to remove the first occurrence of the specified element.
		System.out.println("After removing specified elemnt from list ="+list.remove("Solunke"));//[Shashwat]

		// clear()==>It is used to clear all elements from the list
		//list.clear();
		System.out.println("After Clearing list elements are ="+list); //[]

		/* addAll(Collection c)==>It is used to append all of the elements in the
		 * specified collection to the end of this list, in the order that they are
		 * returned by the specified collection's iterator.*/
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Arav");
		list2.add("Aayara");
		list.addAll(list2);
		System.out.println("After adding the Collection list elements ="+list);//[Shashwat, Arav, Aayara]

		/* addAll(int index,Collection c)==>It is used to append all the elements in the
		 * specified collection, starting at the specified position of the list.*/
		list.addAll(0, list2);
		System.out.println("After adding the specified object at specified postion Collection list elements ="+list);//[Arav, Aayara, Shashwat, Arav, Aayara]

		//containsAll(Collection c)==>To check specified collection in the previous collection
		System.out.println("After containsAll method ="+list.containsAll(list2));//true

		//removeAll(Collection c)==>To remove the specified collection from the list
		System.out.println("After removeAll method ="+list.removeAll(list2));//true
	}
}
