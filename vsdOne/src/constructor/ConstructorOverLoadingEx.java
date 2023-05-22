package constructor;

public class ConstructorOverLoadingEx {
	//String draw;
	
	 ConstructorOverLoadingEx() {
		System.out.println("Drawed");
	}
	 ConstructorOverLoadingEx(String todraw,int num){
		 
		// draw=todraw;
		 System.out.println("Draw ok a "+todraw +"num"+num);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverLoadingEx draw1=new ConstructorOverLoadingEx();
		ConstructorOverLoadingEx draw2=new ConstructorOverLoadingEx("Circle",2000000000);
		

	}

}
