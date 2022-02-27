package day16;

import java.util.*;

public class Test {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>();

 list.add(1);
 list.add(2);
 list.add(3);
 list.add(4);
 list.add(5);
 list.add(100);
 
 Iterator<Integer> iterator = list.iterator();
 
 while(iterator.hasNext()) {
	 
	 Integer n = iterator.next();
	 System.out.println(n);
	 if(n==5)
		 iterator.remove();
	     //list.remove(n);
	   
}
  System.out.println("------------------------------------------------");
  System.out.println(list);
}

}
