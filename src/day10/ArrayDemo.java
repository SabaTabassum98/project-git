package day10;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
      for (int i = 0; i < a.length; i++) {
		
		try {
    		 System.out.println("Print Array A"+a[i]); 
    	  }catch (Exception e) {
    		  e.printStackTrace();
    	  }
	}
      System.out.println("out of the loop");
	}

}
