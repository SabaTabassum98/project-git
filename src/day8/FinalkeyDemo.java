package day8;

class A{
	int a=19;
	final void m1() {
		a=20;
		System.out.println("Print the value a"+ a);
	}
	void m2() {
		System.out.println("Iam in method 2");
	}
	void m2(String s) {
		
	}
}
public class FinalkeyDemo extends A{
 
	@Override
 
 void m2() {
	 System.out.println("Iam in method m2 of FinalkeyDemo");
 }
 public static void main(String[] args) {
	 A a= new A();
	 FinalkeyDemo fd= new FinalkeyDemo();
	 a.m1();
	 a.m2();
	 fd.m2();
 }
}
