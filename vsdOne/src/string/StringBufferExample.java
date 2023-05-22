package string;

/*String Buffer = String Builder -- muatable objects
 * 
 * StringBuffer -Synchrinized
 * StringBuilder-Non synchronized
 * 
 * 
 * Diff
 * String Buffer                                         StringBuilder
 * Synchronized,two threads can't call the methods       Non Synchronize it means can call the methods of
 * of string buffer simultaneously                        StringBuilder simultaneously.
 * 
 * Less efficient                                           More efficient.
 * 
 */

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer name=new StringBuffer("Dinesh");
	     name.append("Kumar");
	     System.out.println(name);
	     
	     //Can able to reverse string Buffer , can't be able to reverse strin
	     System.out.println("Reverse"+name.reverse());
	     
	     //Replace
	     StringBuffer replaceThis=new StringBuffer("Kholi");
	     replaceThis.replace(0, 3, "dhoni");
	     
	     //Delete
	     StringBuffer deletethis=new StringBuffer("BadThings");
	    System.out.println("Delete"+deletethis.delete(2, 5)); 
	     //Insert
	    StringBuffer insertThis=new StringBuffer("Jackie");
	     System.out.println(insertThis.insert(6, "Chan")); 
	     
	     //capacity
	     System.out.println(insertThis.capacity());
	     //like String we have charAt , Substring,length methods as well
	     

	}

}
