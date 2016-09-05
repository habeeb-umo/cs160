// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizInterface quiz = new QuizClass();
		String[] s = {"0", "1","2", "3", "4", "A", "b"};
		double[] d = {-2};
		
		System.out.println(quiz.EncodeString("579"));
		System.out.println(quiz.DecodeString("&&&"));
		System.out.println(Arrays.toString(quiz.sumAscii(s)));
		quiz.quadrupleArray(d);
		System.out.println(Arrays.toString(d));
		quiz.writeFile("test.txt", s);
	
	}

}
