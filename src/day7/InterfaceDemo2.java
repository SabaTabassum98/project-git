package day7;

interface A {
 int a =0;
 public void m1();
 public void m4();
   
 interface E{
	 }	
}
abstract class B{
	abstract void m2();
	public void m3(){
		
	}
}
class C implements A{	
	public void m1() {
		 System.out.println("1.im method m1");	
		}
	
	public void m4() {

		System.out.println("2.im method m4");
	}
}

public class InterfaceDemo2 {
	
public static void main(String[] args) {
	C c=new C();
	c.m1();
	c.m4();
}
}
