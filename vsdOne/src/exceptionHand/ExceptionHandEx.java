package exceptionHand;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionHandEx {
	
	
	/*What is Exception?
	 * An exception is an undesirable or unexpected event,which occurs
	 * during the execution of a program at run time,
	 * that disrupts the normal flow of the program's instructions. It can be handled by our program
	 * 
	 * An exception is not an error:
	 * An error is a very severe problem, which can't be be 
	 * handled by the program.Ex: when your computer runs out of space, their is nothing our program can do except crashing
	 * 
	 * ExceptionFamily:
	 * Object->Throwable -> 2 types
	 * 1.Exceptions,2. error
	 * 
	 * Exceptions:
	 * 1.Checked Exceptions Ex: IO or Comiple time exceptions
	 * 2.Unchecked Exceptions EX:Runtime or Null pointer Exceptions
	 * 
	 * Error:
	 * 1.Virtual Machine Error
	 * 2.Assertion error etc
	 * 
	 * 
	 * Try Block:
	 *This is a block where we will write our code which may given run time 
	 *exception.
	 *
	 *Catch Block:
	 *THis is where the exception are handled. Catch block is immediately 
	 *followed by try block.
	 * 
	 * 
	 * Important Points:
	 * A try block can have multiple catch block.
	 * If there are multiple catch blocks, they should not be of generic exception type.
	 * If there are no exception then the catch blocks will not get executed.
	 * 
	 * Finally:
	 * A finally block must be associated with a try catch.
	 * Finally block not mandatory.
	 * Finally block also have an exception.
	 * The statements present in the finally block execute even if the try block contains control 
	 * transfer statements like return,break or continue.
	 * 
	 * 
	 * Will finally block always execute?
	 * No
	 * 1.The thread is dead.
	 * 2.When system.exit(); is called
	 * When an unrecoverable exception happens in Finally block
	 * 
	 */

	
	static String name;
	static FileReader fr=null;
	static BufferedReader br=null;
	
	
	public void ExcepcreateEx() {
		//How to create exception
				try {
					//1.
					throw new ExceptionHandEx("ExceptioncreateEx");//exception create
					int num=0;
					int num1=1;
					int divide=(num1/num);
					//2.
					fr=new FileReader("Filename");
					br=new BufferedReader(fr);
					 String sCurrentLine;
					 System.exit(0);//finally block not execute
					
				/*}catch (ExceptionHandEx e) {
					// TODO: handle exception
					e.printStackTrace();*/
				}catch (ArithmeticException e) {
					// TODO: handle exception
				}catch (Exception e) {
					// TODO: handle exception
				}finally {
					try {
						if(br!=null)
							br.close();
						if(fr!=null) {
							fr.close();
						}
					}catch (Exception ex) {
						// TODO: handle exception
						ex.printStackTrace();
					}
					
					
				}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Null pointer exception
		System.out.println(name.length());
		
		

	}

}
