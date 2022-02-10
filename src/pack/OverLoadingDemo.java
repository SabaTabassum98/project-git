package pack;

public class OverLoadingDemo {

void addition(int a, int b, int c) {//m1
		System.out.println("Result1: "+ (a+b-c));
	}
	void addition(int a, int b, double c) {//m2
		System.out.println("Result2: "+ (a+b*c));	
	}
	void addition(int a, int b, int c,int d) {//m3
		System.out.println("Result3: "+ (a+b+c+d));
	}
	void addition(int a, double b) {//m4
		System.out.println("Result4: "+ (a-b));
	}
	void addition(int a, int b) {//m5
		System.out.println("Result5: "+ (a*b));
	}

	public static void main(String[] args) {
		
		OverLoadingDemo old =new OverLoadingDemo();
		old.addition(2, 5,9);//m1
		old.addition(10,15,3.0);//m2
		old.addition(2, 5,5,6);//m3
		old.addition(2, 5.0);//m4
		old.addition(2, 5);//m5
		
	
	}

}


