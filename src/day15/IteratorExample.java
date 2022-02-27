package day15;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
void Display(List<String> list) {
	Iterator<String> obj = list.iterator();
	while(obj.hasNext()) {
		System.out.println("Element is:" + obj.next());
	}
}

public static void main(String[] args) {
	List<String> ob = new LinkedList<>();
	ob.add("im no:1");
	ob.add("im no:2");
	ob.add("im no:3");
	ob.add("im no:4");
	System.out.println("Element is:" + ob);
	
	IteratorExample ic = new IteratorExample();
	ic.Display(ob);
	
}
}
