package string;

/*
 * What is String?
 * 1. An object that represents sequence of char values
 * 2. Ex: "Dinesh" is a string of 6
 * 3. In java string is an immutable object which means it is constant and can be changed once it has been created.
 * 4.the java.lang.string class implements Serializable, Comparable and CharSequence interfaces.
 * 5.CharSequence is  parent of string.
 * 
 * CharSequence Implements:
 * 1.String 2.StringBuffer 3.StringBuilder
 * 
 * How to create a string
 * 
 * 1.By string literal
 *   String name="dinesh";
 *   String name1="dinesh"it create only one object in heap memory
 * 2.By new keyword
 *   String name=new String(); it create 2 objects in heap memory
 */

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Dinesh Kumar VS";
		int num=5;
		System.out.println(name.charAt(2));
		
		System.out.println(name.length());
		
		System.out.println(name.equals("Dinesh"));
		
		System.out.println(name.equalsIgnoreCase("DINEsh"));
		System.out.println(name.isEmpty());
		System.out.println(name.contains("D"));
        System.out.println(name.substring(3));
		
		System.out.println(name.substring(2, 5));
		
		System.out.println(name.concat("Software Engineer"));
		
		System.out.println(name.replace("u", "U"));
		//find the position of a character
		System.out.println(name.indexOf("h"));
		//finds the character specified from the index position 
		System.out.println(name.indexOf("s", 7));
        System.out.println(name.indexOf("i", 1));
		
		System.out.println(name.indexOf("kumar",1));
		
		//trim will remove the white spaces before and after
		System.out.println(name.trim());
		
		System.out.println(String.valueOf(num));
		String uppercase="DINESH KUMAR VS";
		System.out.println(uppercase.toLowerCase());
		String lowercase="dinesh kumar VS";
		System.out.println(lowercase.toUpperCase());
		
		//Returns a joined String with given delimiter
		System.out.println(String.join("-", "Dinesh","Kumar"));
		
		System.out.println(String.join("/", "19","01","1996"));
		
		
		//split
		String splitThis="Am,good,boy";
		String[] splited=  splitThis.split(",");
		
		for (String string : splited) {
			System.out.println(string);
			
		}
		
		

	}

}


