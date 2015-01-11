import javax.xml.soap.Node;


public class LinkedListTest {

	public static void main(String[] args) {
		LinkedListInt list = new LinkedListInt();
		 list.add(5);
		 list.add(3);
		 list.add(2);
		 list.add(4);
		 list.printList();
		 if(list.contains(4))
			 System.out.println("NASAO");
		 else
			 System.out.println("NEMA");
		// list.add(7);
		// list.printList();
		// list.removeAt(2);
		// System.out.println("Poslije brisanja");
		// list.printList();
		// list.add(9,1);
		// list.printList();
		int[] array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		LinkedListInt list2 = new LinkedListInt();
		list2.add(7);
		list2.add(7);
		list.add(list2);
		list.printList();
		

		// System.out.println("Poslije dodavanja");
		// list.printList();
	}
}
