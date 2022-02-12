package pack1;

interface A{
 void Happy();	
}

interface B{
	 void Sad();	
}

interface C{
	 void Hungry();	
}

class Emotions implements A,B,C{
public void Happy() {
 System.out.println("1.Iam Happy");	
}	


public void Sad() {
	 System.out.println("2.I Feel Sad");	
	}	
	
public void Hungry() {
	 System.out.println("3.Iam Hungry");	
	}
}

public class InterfaceDemo {
	public static void main(String args[]) {
		   Emotions e= new Emotions();
		   e.Happy();
		   e.Sad();
		   e.Hungry();
        }
}