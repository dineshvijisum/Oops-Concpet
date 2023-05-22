package constructor;

public class ParameterizedEx {
    String name;
    String lastName;
	
	ParameterizedEx(String name1,String last){
		name=name1;
		lastName=last;
		
	}
	
	public void name() {
		System.out.println("First name: "+name+" last name: "+ lastName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedEx nameEx=new ParameterizedEx("Dinesh", "Kumar VS");
		nameEx.name();
		
		ParameterizedEx nameEx1=new ParameterizedEx("L", "D");
		nameEx1.name();

	}

}
