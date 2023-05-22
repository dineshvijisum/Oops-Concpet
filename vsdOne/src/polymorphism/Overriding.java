package polymorphism;

public class Overriding extends Overloading {
	
	public void dinesh(int salary) {
		System.out.println("Infinity");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading dinesh=new Overriding();
		dinesh.dinesh(2000000000);
		dinesh.dinesh("sweet home");
		

	}

}
