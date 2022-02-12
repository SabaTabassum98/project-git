package pack1;

interface A{
 void happy();	
}

interface B{
	 void sad();	
}

interface C{
	 void hungry();	
}
 
interface D{
	void sleep();
}

class Emotions implements A,B,C,D{
public void happy() {
 System.out.println("1.Iam Happy");	
}	


public void sad() {
	 System.out.println("2.I Feel Sad");	
	}	
public void hungry() {
	 System.out.println("3.Iam Hungry");	
	}	
public void sleep() {
	 System.out.println("4.Take a nap");	
	}

}

public class InterfaceDemo {
	public static void main(String args[]) {
		   Emotions e= new Emotions();
		   e.happy();
		   e.sad();
		   e.hungry();
		   e.sleep();
        }
}