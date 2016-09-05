// P_ Assignment
// Author: Habeeb Mohammed
// Date:   x/xx/xxxx
// Class:  CS160
// Email:  habeeb@cs.colostate.edu
public class Q3 {

	public static void main(String[] args) {
		
		Q3 q3 = new Q3();
		System.out.println(q3.getState());
		System.out.println(q3.calculateQuadratic(5,7,4,2.0));
		System.out.println(q3.calculateAverage(14.32, 37.65, 68.98));
		System.out.println(q3.areaOfCircle(9.2));
		
	}
	 
		private double pi = 3.1416;
		private String state = "Colorado";
		
		public String getState(){
			
			return state;
		}
		public double calculateQuadratic(int a, int b, int c, double x){
			double result = 0.0;
			result = (a * (x*x)) + (b * x) + c;
			return result;
		}
		public double calculateAverage(double value0, double value1, double value2){
			double result = 0.0;
			result = (value0 + value1 + value2) / 3.0;
			return result;
		}
		public double areaOfCircle(double d){
			double result = 0.0;
			result = pi * ((d/2.0)*(d/2.0));
			return result;
		}
}
