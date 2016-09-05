// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
package midterm;
import java.util.Scanner;
public class midterm {
	
	

	public static void main(String[] args) {
		//String s = alarmClock(1,true);
	//	Scanner keyboard = new Scanner(System.in); 
//		
//		Habeeb h = new Habeeb("Booty", "HP");
//		
//		System.out.println(h.name);
//		System.out.println(h.job);
		
//		int distance;
//		distance = 9;
//		double points;
//		points = distance;
//		System.out.println(points);
		
		//int hellos = (int)hello;
		
		//System.out.println(hello + hello);
		
//		byte longmoney = keyboard.nextByte();
//		String hello = "hello";
//		String world = "world";
//		float crap = 55.5192f;
//		long f = 84;
//		
//		System.out.printf("%f", crap);
//		System.out.print("booty");
//		
//		int booty = keyboard.nextInt();
//
//		if(booty % 2 == 0)
//			System.out.println("This is even.");
//		else 
//			System.out.println("This is odd.");

		/*int booty = keyboard.nextInt();

		switch(booty)
		{
		case 1: booty = 1;
		break;
		case 2: booty = 2;
		break;
		case 3: booty = 3;
		break;
		}
		
		System.out.println(booty);*/
		
//		swap(2, 5);


	}
	//alarmClock(1,true);
//	public static void swap(int num1, int num2) {
//		int temp = num1;
//		num1 = num2;
//		num2 = temp;
//		
//		System.out.printf("%d %d", num1, num2);
//	}
//}
//
	
//	static public String alarmClock(int day, boolean vacation) {
//		day = 6;
//		vacation = true;
//		  if (vacation == false && (day >= 1) && (day < 6)){System.out.println("If #1");
//		  return "7:00";}
//		  if (vacation == false && ((day == 0) || (day == 6))){System.out.println("If #2");
//		  return "10:00";}
//		  if (vacation == true){System.out.println("If #3");
//		  if (day >= 1 && day <= 5)
//		  return "10:00";}
//		  if (vacation == true && (day == 0) || (day == 6)){System.out.println("If #4");
//		  return "off";}
//		  else{System.out.println("If #5");
//		  return "7:00";}
//		}
	static public int redTicket(int a, int b, int c) {
		a = 1;
		b = 2;
		c = 0;
		  if ((a == 2) && (b == 2) && (c == 2))
		  {
			  System.out.println("case 1");
		  return 10;
		  }
		  if ((a != 2) && (a == b) && (a == c) && (b==c))
		  {
			  System.out.println("case 2");
		  return 5;
		  }
		  	  System.out.println("case 3");	
		  if ((a != b) && (b == c))
		  {
			  System.out.println("case 4");
		  return 1;
		  
		  }
		  else
		  return 0;
		}

}
