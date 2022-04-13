package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp00VelasquezNicolas1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp00VelasquezNicolas1Application.class, args);
		
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		
		//int x = System.console().readLine();
		
		calculator.setX(100);
		calculator.setY(2);
		
		System.out.println("The sum is: "+ calculator.sum());
				
		System.out.println("The subtraction is: "+ calculator.subtract());
		
		System.out.println("The multiplication is: "+ calculator.multiply());
				
		double divide = calculator.divide();
		
		if(divide==0) System.out.println("Wrong input" );
		else System.out.println("The division is: "+divide);
		
		System.out.println("The power is: "+ calculator.power());
		
		System.out.println("The root is: "+ calculator.root());
		
	}

}
