package day16;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
	public static void main(String[] args) {
		Vector<Integer> vc = new Vector<>();
		vc.add(1);
		vc.add(2);
		vc.add(3);
		vc.add(4);
		vc.add(5);
		
		Enumeration<Integer> elements = vc.elements();
		while(elements.hasMoreElements()) {
			Integer n = elements.nextElement();
			System.out.println(n);
		}
		
		System.out.println("------------------------------------");
		System.out.println(vc);
	}

}
