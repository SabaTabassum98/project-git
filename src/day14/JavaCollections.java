package day14;

import java.util.Stack;
import java.util.LinkedList;

public class JavaCollections {
public static void main(String[] args) {
	
	Stack<String> obj = new Stack<>();
	
	
	//String
	obj.push("Hello");
	obj.push("Hi");
	obj.push("Bye");
	obj.push("Hi");
	System.out.println(obj);
	
	//removing a string
	obj.pop();
	 System.out.println(obj);
	 
	LinkedList<Integer> obj1 = new LinkedList<>(); 
	//numbers
	obj1.add(100);
	obj1.add(200);
	obj1.add(300);
	obj1.add(400);
	System.out.println(obj1);
	
	obj1.addFirst(50);
	obj1.addLast(500);
	System.out.println(obj1);
	
	obj1.set(0, 1);
	System.out.println(obj1);
	
}
}
