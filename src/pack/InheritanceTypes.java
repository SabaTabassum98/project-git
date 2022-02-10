package pack;


	class Parent1{// parrent 
		void sum() {
	}
	}

	class Parent2{//child 1 of parent 1

	}

	class Parent3 extends Parent2{//child2
	 void sum() {
	}
	}



	public class InheritanceTypes extends Parent1{//child2 of parent1 

		public static void main(String[] args) {
			System.out.println("Parent-> Child1-> child2");
		}

}
