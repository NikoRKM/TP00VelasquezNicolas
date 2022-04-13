package ar.edu.unju.edm;

import org.springframework.stereotype.Component;

@Component

public class Calculator {
	
		//Attributes
		private int x;
		private int y;
		
		
		//Constructors
		
		public Calculator() {
			
		}
		
		public Calculator(int x,int y) {
			
			this.x = x;
			this.y = y;
			
		}
		
		//Basics operations
		
		public int sum() {
		
			return this.x + this.y;	
		
		}
		
		public int subtract() {
			
			return this.x -  this.y;
			
		}

		public int multiply() {
			
			return this.x * this.y;	
		
		}
		
		public double divide() {
			
			if(y != 0) return this.x / this.y;
			else return 0;
			
		}
		
		public double power() {
			
			return Math.pow(this.x, this.y);
			
		}
		
		public double root() {
			
			return Math.pow(this.x, Math.pow(this.y, -1));
			
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
