package polymorphism;

public class Overloading {
	
	
	public void dinesh(String house) {
		System.out.println("I'm son"+house);
	}
	public void dinesh(int salary) {
		System.out.println("20 lacks per anum"+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading dinesh=new Overloading();
		dinesh.dinesh("Home");
		dinesh.dinesh(2000000000);

	}

}
