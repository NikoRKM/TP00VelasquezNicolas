package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Calculator {
	
		//Attributes
		private int x;
		private int y;
		
		
		//Constructors
		
		public Calculator() {
			
		}
		
		
		//Basics operations
		
		public int sum() {
		
			return x+y;	
		
		}
		
		public int subtract() {
			
			return x-y;
			
		}

		public int multiply() {
			
			return x*y;	
		
		}
		
		public double divide() {
			
			if(y != 0) return x/y;
			else return 0;
			
		}
		
		public double power() {
			
			return Math.pow(x, y);
			
		}
		
		public double root() {
			
			return Math.pow(x, Math.pow(y, -1));
			
		}
		
		//Getters & Setters
		
		public int getX() {
			return x;
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public int getY() {
			return y;
		}
		
		public void setY(int y) {
			this.y = y;
		}
}
