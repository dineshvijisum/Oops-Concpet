package vsdOne;

public class Constructor {

	
		// TODO Auto-generated method stub
		/*
		 * 1.What is constructor?
		 *  Constructor is a block of code that initializes the newly created object.
		 *  
		 *  2.Must have properties of a constructor:
		 *  Constructor name must be the same as its class name
		 *  must not have explicit return type
		 *  cannot be abstract, static, final, and synchronized
		 *  
		 *  3.Types.
		 *  a)Default Constructor b)No arguments or no constructor C)Parameterized
		 *  
		 *  4.Default Constructor
		 *  when we don't provide any constructor, compiler will provide one.
		 *  we cannot see with naked eye, it will be in class file.
		 *  used to provide the default values to the object like 0, null, etc..,
		 *  depending on the types.
		 *  
		 *  5)No arguments Constructor :
		 *  
		 *  No arguments will be there
		 *  it will allow us to write logic when object is created.
		 *  this is not default constructor.
		 *  
		 *  6)Parameterized Constructor
		 *  It has arguments (parameters)
		 *  
		 *  
		 */
		
		
		
		//a.default Constructor
		
		String name;
		
		
	public static void main(String[] args) {
		//a.default Constructor
		Constructor stuName=new Constructor();
		System.out.println(stuName.name);

	}

}
