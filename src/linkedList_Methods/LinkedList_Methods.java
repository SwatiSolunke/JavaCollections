package linkedList_Methods;

import java.util.LinkedList;

public class LinkedList_Methods {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		//add(String e)==>It is used to add new elements in LinkedList
		ll.add("Ravi");
		ll.add("Ram");
		ll.add("Raman");
		ll.add("Shankar");
		ll.add("Shashwat");

		System.out.println("After Adding LinkedList Elements:="+ll);//[Ravi, Ram, Raman, Shankar, Shashwat]

		/* add(int index, E element)==>This method Inserts the specified element at the
		 * specified position in this list.*/
		ll.add(1, "Uma");
		System.out.println("After Adding Uma at 1st postion:="+ll);//[Ravi, Uma, Ram, Raman, Shankar, Shashwat]

		/* set(int index, E element)==>This method replaces the element at the specified
		 * position in this list with the specified element.*/
		ll.set(2, "Rupa");
		System.out.println("After Set Raman at 2nd postion:="+ll);//[Ravi, Uma, Rupa, Raman, Shankar, Shashwat]

		//size()==>This method returns the number of elements in this list.
		System.out.println("LinkedList Size="+ll.size());//6

		//contains(Object o)==>This method returns true if this list contains the specified element.
		System.out.println("List contains element is:"+ll.contains("Shankar"));//true

		//get(int index)==>This method returns the element at the specified position in this list.
		System.out.println("After get method LinkedLIst Element is:"+ll.get(3));//Raman

		//remove(int index)==>This method removes the element at the specified position in this list.
		ll.remove(2);
		System.out.println("After removing 2nd postion element:"+ll);//[Ravi, Uma, Raman, Shankar, Shashwat]

		/* remove(Object o)==>This method removes the first occurrence of the specified
		 * element from this list if it is present.*/
		ll.remove("Rupa");
		System.out.println("After removing Rupa LinkedList Element:"+ll);//[Ravi, Uma, Raman, Shankar, Shashwat]

		LinkedList<String> ll2 = new LinkedList<String>();

		//add(String e)==>It is used to add new elements in LinkedList
		ll2.add("Radha");
		ll2.add("Sita");
		ll2.add("Tulsi");
		ll2.add("Swati");
		ll2.add("Swara");
		System.out.println("Second LinkedList Element:="+ll2);//[Radha, Sita, Tulsi, Swati, Swara]

		/* addAll(Collection<E> c)==>This method Appends all of the elements in the
		 * specified collection to the end of this list, in the order that they are
		 * returned by the specified collection’s iterator. */
		ll.addAll(ll2);
		System.out.println("After Adding LinkedList2 in LinkedList 1st:="+ll);//[Ravi, Uma, Raman, Shankar, Shashwat, Radha, Sita, Tulsi, Swati, Swara]

		/*addAll(int index, Collection<E> c)==>This method Inserts all of the elements
		 * in the specified collection into this list, starting at the specified
		 * position. */
		ll.addAll(1, ll2);
		System.out.println("After adding LinkedList2 at 1st postion:="+ll);//[Ravi, Radha, Sita, Tulsi, Swati, Swara, Uma, Raman, Shankar, Shashwat, Radha, Sita, Tulsi, Swati, Swara]

		/* containsAll(Collection e)==>It is used to check specified collection is
		 * present or not.If collection is Present returns true otherwise return false
		 */
		System.out.println("After Contains All method:="+ll.containsAll(ll2));//true

		//removeAll()==>It is used to remove the specified collection from the specific collection(Ex:Remove collection1 from collection1)
		ll.removeAll(ll2);
		System.out.println("After Removing LLinkedList2 From LinkedList1:="+ll);//[Ravi, Uma, Raman, Shankar, Shashwat]

		// clear()==>This method removes all of the elements from this list.
		ll.clear();
		System.out.println("After Clearing the elements from LinkedList:="+ll);//[]

		//isEmpty()==>It is used to check LinkedList is Empty or not.If Linkedlist is empty returns true otherwise returns false
		System.out.println("To check LinkeList is Empty or not:="+ll.isEmpty());//true
	}
}
