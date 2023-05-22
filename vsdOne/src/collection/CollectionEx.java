package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*Iterable->iterator<E> 1 type
 * 1.Colletion: 3 typesw
 * 1.List 
 *     ArrayList
 *     LinkedList
 *     Stack--legacy class--out dated
 *     Vector--legacy class-out dated
 * 2.Set<E>-SortedSet<E>--NavigateableSet<E>
 *   HashSet
 *   LinkedHashSet
 *   TreeSet
 * 3.Queue<E>  ---Deque<E>------Not important
 *   PriorityQueue
 *   ArraydeQue
 *   LinkedList(Deque   
 *   
 * Map is not collection:  
 * Map<k,v>---SortedMap---Navigable<k,v>   
 * 
 * 1.HashMap
 * 2.HashLinkedMap
 * 3.HashTable
 * 4.TreeMap
 * 
*/

public class CollectionEx {
	
	public void arrayLisEx() {
	List<String> arralistex=new ArrayList<String>();
	//insertion order maintain and can give duplicate values
	arralistex.add("Dhoni");
	arralistex.add("Dhoni");
	arralistex.add("Dhoni");
	arralistex.add("kholi");
	arralistex.add("Dhoni");
	arralistex.add("kholi");
	
	System.out.println(arralistex);
	System.out.println(arralistex.get(0)); 
	System.out.println(arralistex.indexOf("kholi")); 
	System.out.println(arralistex.lastIndexOf("kholi")); 
	
	//copy
	List<String> anotherList=new ArrayList<String>();
	
	System.out.println(anotherList.addAll(arralistex)); 
	//clear
	anotherList.clear();
	System.out.println(anotherList); 
	//remove
	arralistex.remove(0);
	System.out.println(arralistex); 
	arralistex.remove("kholi");
	System.out.println(arralistex); 
	
	//null insertion
	arralistex.add(null);
	System.out.println(arralistex);
	
	//value replace , update the value
	arralistex.set(0, "ddddd");
	System.out.println(arralistex);
	
	System.out.println(arralistex.isEmpty());
	
	//iterate
	
	for (String string : arralistex) {
		System.out.println("iterate" +string);
		
	}
	//list iterator can forward and backward
	ListIterator<String> iteratorex=arralistex.listIterator();
	
	while (iteratorex.hasNext()) {
		System.out.println(iteratorex);
		
	}
		//list iterator we can previous
	while (iteratorex.hasPrevious()) {
		System.out.println(iteratorex);
		
	}
	
	//iterator only forward
	Iterator<String> iter=arralistex.iterator();
	
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	/*Array list non-synchronized.it should not be used multithreading
	 * 

*/
	
	for (String string : arralistex) {
		System.out.println("iterate" +string);
		//concurrentModification exception example reading time if we add,remove or etc it came 
	         arralistex.add("jadeja");
	         //if we need add when the CopeyOnWriteArraList<String> we can use
 		
	}
	}
	
	/*Important Points
	 * 1.ArrayList(C) is one of the classes provides implementation for the List(I)
	 * duplicate values are allowed
	 * insertion order is maintained
	 * underlying DS is resizeable Array or Growable Array
	 * can insert Heterogeneous objects --- List al = new ArrayList();can add int, string
	 * 
	 * ArrayList is not synchronised
	 * it is  not thread safe
	 * Default capavity-10
	 * fill ratio or loard factor : or 100%
	 * Growth Rate : current_size+current_size/2
	 * implements randomAccess, Serializable and cloneable
	 * Best suited for search operations and performs worst on insertion and deletion

*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CollectionEx example=new CollectionEx();
       example.arrayLisEx();
	}

}
