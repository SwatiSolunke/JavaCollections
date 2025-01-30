package linkedList_Iterations_Methods;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Iteration_Method {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();

		//add(String e)==>It is used to add new elements in LinkedList
		cars.add("Volvo");
		cars.add("Fronx");
		cars.add("Breeza");
		cars.add("GrandVitara");
		cars.add("Aura");

		// By using For Loop
		for(int i=0;i<cars.size();i++) {

			System.out.println("Cars name:="+cars.get(i));
		}

		/*
		 * O/P:Cars name:=Volvo 
		 * Cars name:=Fronx 
		 * Cars name:=Breeza 
		 * Cars name:=GrandVitara 
		 * Cars name:=Aura
		 */

		// By Using For-Each loop
		for(Object e:cars) {

			System.out.println("LinkedList Elements:= "+e);
		}

		/* O/P:LinkedList Elements:= Volvo LinkedList Elements:= Fronx LinkedList
		 * Elements:= Breeza LinkedList Elements:= GrandVitara LinkedList Elements:=
		 * Aura */

		// By Using Iterator method
		Iterator<String> itr = cars.iterator();
		while(itr.hasNext()) {

			System.out.println("Elements:="+itr.next());
		}
		
		/*
		 * O/P:Elements:=Volvo 
		 * Elements:=Fronx 
		 * Elements:=Breeza 
		 * Elements:=GrandVitara
		 * Elements:=Aura
		 */
	}
}
