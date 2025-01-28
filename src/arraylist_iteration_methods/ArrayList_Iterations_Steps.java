package arraylist_iteration_methods;

import java.util.ArrayList;

public class ArrayList_Iterations_Steps {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Mango");//Adding object in arraylist    
		list.add("Apple");    
		list.add("Banana");    
		list.add("Grapes");    
		
		//By using iterator method  
		java.util.Iterator<String> itr=list.iterator();//getting the Iterator  
		
		while(itr.hasNext()){//check if iterator has the elements  
			
			System.out.println(itr.next());//printing the element and move to next  
		}  

		// By using For Loop
		for(int i=0; i<list.size();i++) {
			System.out.println("List Elements ="+list.get(i));
		}
		/* O/P:List Elements =ABC
               List Elements =PQR
    		   List Elements =LMN
			   List Elements =XYZ */

		// By using for-each loop
		for(Object element:list) {

			System.out.println("Fetching the Elemnts from the list ="+element);
		}

		/*
		 * O/P: Fetching the Elemnts from the list =ABC
		 *  Fetching the Elemnts from the list =PQR 
		 *  Fetching the Elemnts from the list =LMN 
		 *  Fetching the Elemnts from the list =XYZ
		 */
	}
}