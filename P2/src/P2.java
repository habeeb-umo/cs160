// P1 Assignment
// Author: Habeeb Mohammed
// Date:   8/31/2015
// Class:  CS160
// Email:  habeeb@cs.colostate.edu

public class P2 {

	public static void main(String[] args) {
		
		byte   byte1 = 32;
		short  short1 = 15477;
		int    int1 = 664422;
		long   long1 = 3984759871l;
		float  float1 = 8.112f;
		double double1 = 56.4444;
		
		char   char1 = '&',
			   char2 = 'S',
			   char3 = '5',
			   char4 = '&'-3, 
			   char5 = 'S'-3,
			   char6 = '5'-3;
		
		
		String string1 = "Computer",
			   string2 = "Science",
			   string3 = "Excellent";
		
		System.out.println(byte1  + ":" +
						   short1 + ":" +
						   int1   + ":" +
						   long1);
		System.out.println(float1 + "," + double1);
		System.out.println((byte1+short1+int1+long1)/99999);
		System.out.printf("%.3f",Math.sqrt(float1+double1));
		System.out.println();
		System.out.printf("%.5f",byte1/float1);
		System.out.println();
		System.out.println((char1 + "=" + char2 + "=" + char3));
		System.out.println((char4) + "~" + (char5) + "~" + (char6));
		System.out.println(string1 + " " + string2 + " " + "is" + " " + string3 + "!");
		System.out.print(string1.length() + "," + string2.length() + "," + string3.length());
	
	
		
		

	}

}
