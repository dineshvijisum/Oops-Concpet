package abstraction;

public class AbstractOne extends Abstract  implements DineshInterface ,anotherinterface {

	@Override
	public void firstname() {
		System.out.println("Dinesh");
		
	}

	@Override
	public void lastname() {
		System.out.println("Kumar VS");
		
	}
	
	
	
	@Override
	public void firstna() {
		System.out.println("ok");

		
	}

	@Override
	void lastna() {
		System.out.println("ok ok ");

		
	}
	public void jj() {
		Abstract god=new AbstractOne();
		god.dob();
		god.firstna();
		god.lastna();
		
	}
	 

}
