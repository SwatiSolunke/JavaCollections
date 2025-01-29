package linkList_Properties;

import java.util.LinkedList;

public class LinkList_Properties {

	public static void main(String[] args) {

		// LinkedList allow hetrogenious element
		LinkedList ll1 = new LinkedList();
		ll1.add("Shashwat");
		ll1.add(10.00);
		ll1.add(10.333333);
		ll1.add(20);
		ll1.add(true);
		ll1.add('A');
		System.out.println("LinkedList Element:="+ll1); //LinkedList Element:=[Shashwat, 10.0, 10.333333, 20, true, A]
		
		// LinkedList follow insertion order
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Ram");
		ll2.add("Raman");
		ll2.add("Shankar");
		
		System.out.println("LinkedList Element:="+ll2); //[Ravi, Ram, Raman, Shankar]
		
		// LinkedList element allow null elements
		ll2.add(null);
		ll2.add(null);
		System.out.println("LinkedList Element:="+ll2);//LinkedList Element:=[Ravi, Ram, Raman, Shankar, null, null]
	
		// LinkedList Allow Duplicate Element
		ll2.add("Ravi");
		ll2.add("Shankar");
		System.out.println("LinkedList Element:="+ll2);//[Ravi, Ram, Raman, Shankar, null, null, Ravi, Shankar]
		
	}
}
