package pack;
 
public class AccessModifier
{
public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		am.displayStudents();
		am.displayHours();
		am.displayClass();
   }

	int nos;
	float hrs;
	int noc;
	void displayStudents() {//m1
		System.out.println("Number of Students");
	}
	void displayHours() {//m2
		System.out.println("Number of Hours");
	}
	void displayClass() {//m3
		System.out.println("Number of Class");
	}


	

}
