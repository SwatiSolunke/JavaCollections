package linkedList_Methods;

import java.util.LinkedList;

public class LinkedList_Method2 {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);

		System.out.println("LinkedLIst Elements:="+ll);//[10, 20, 30]

		//addFirst(E e)==>This method Inserts the specified element at the beginning of this list.
		ll.addFirst(40);
		System.out.println("After addFirt:="+ll);//[40, 10, 20, 30]

		//addLast(E e)==>This method Appends the specified element to the end of this list.
		ll.addLast(50);
		System.out.println("After addLast:="+ll);//[40, 10, 20, 30, 50]

		//getFirst()==>It is used to get the First element from the list
		System.out.println("After getFirst Method:="+ll.getFirst());//40

		//getLast()==>It is used to get the last element from the list
		System.out.println("After getLast method:="+ll.getLast());//50

		//removeFirst()==>This method removes and returns the first element from this list.
		System.out.println("After removeFirst method:="+ll.removeFirst());//40

		//removeLast()==>This method removes and returns the last element from this list.
		System.out.println("After removeLast method:="+ll.removeLast());//50

		/* offer(E e)==>This method Adds the specified element as the tail (last
		 * element) of this list. */
		ll.offer(70);
		System.out.println("After offer method:="+ll);//[10, 20, 30, 70]

		//offerFirst(E e)==>This method Inserts the specified element at the front of this list.
		ll.offerFirst(100);
		System.out.println("After OfferFirst Method:="+ll);//[100, 10, 20, 30, 70]

		//offerLast(E e)==>This method Inserts the specified element at the end of this list.
		ll.offerLast(200);
		System.out.println("After OfferLast Method:="+ll);//[100, 10, 20, 30, 70, 200]

		//peek()==>This method retrieves but does not remove,the head (first element) of this list.
		System.out.println("After peek Method:="+ll.peek());//100

		/* peekFirst()==>This method retrieves, but does not remove, the first element
		 * of this list, or returns null if this list is empty.*/
		System.out.println("After peekLast Method:="+ll.peekFirst());//100

		/*peekLast()==>This method retrieves, but does not remove, the last element of
		 * this list,or returns null if this list is empty.*/
		System.out.println("After peekLast Method:="+ll.peekLast());//200

		//poll()==>This method retrieves and removes the head (first element) of this list.
		System.out.println("After poll Method:="+ll.poll());//100

		/* pollFirst()==>This method retrieves and removes the first element of this
		 * list, or returns null if this list is empty.*/
		System.out.println("After pollFirst method:="+ll.pollFirst());//10

		/*pollLast()==>This method retrieves and removes the last element of this list,
		 * or returns null if this list is empty.*/
		System.out.println("After pollLast method:="+ll.pollLast());//200

		//pop()==>This method Pops an element from the stack represented by this list.
		System.out.println("After Pop:="+ll.pop());//20

		//push(E e)==>This method pushes an element onto the stack represented by this list.
		ll.push(400);
		System.out.println("After Push:="+ll);//[400, 30, 70]
	}
}
