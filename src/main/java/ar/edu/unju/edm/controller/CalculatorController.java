package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculator;

@Controller

public class CalculatorController {
	
	@GetMapping("/menu")
	public String getMenu() {
		
		return "index";
		
	}
	
	@GetMapping("/calculoSuma")
	public String getSumaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2 , Model model){
		int resultadoS = 0;
		
		Calculator nuevaCalculadora = new Calculator();
		nuevaCalculadora.setX(num1);
		nuevaCalculadora.setY(num2);
		resultadoS = nuevaCalculadora.sum();
		model.addAttribute("resultadoS", resultadoS);
		
		return "resultadosuma";
	
	}
	
	@GetMapping("/calculoResta")
	public String getRestaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2 , Model model){
		int resultadoR = 0;
		
		Calculator nuevaCalculadora = new Calculator();
		nuevaCalculadora.setX(num1);
		nuevaCalculadora.setY(num2);
		resultadoR = nuevaCalculadora.subtract();
		model.addAttribute("resultadoR", resultadoR);
		
		return "resultadoresta";
	
	}
	
	@GetMapping("/calculoMultiplicacion")
	public String getMultiplicacionPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2 , Model model){
		int resultadoM = 0;
		
		Calculator nuevaCalculadora = new Calculator();
		nuevaCalculadora.setX(num1);
		nuevaCalculadora.setY(num2);
		resultadoM = nuevaCalculadora.multiply();
		model.addAttribute("resultadoM", resultadoM);
		
		return "resultadomultiplicacion";
	
	}
	
	@GetMapping("/calculoDivision")
	public String getDivisionPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2 , Model model){
		double resultadoD = 0;
		
		Calculator nuevaCalculadora = new Calculator();
		nuevaCalculadora.setX(num1);
		nuevaCalculadora.setY(num2);
		resultadoD = nuevaCalculadora.divide();
		model.addAttribute("resultadoD", resultadoD);
		
		return "resultadodivision";
	
	}
	
	@GetMapping("/calculoPotencia")
	public String getPotenciaPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2 , Model model){
		double resultadoP = 0;
		
		Calculator nuevaCalculadora = new Calculator();
		nuevaCalculadora.setX(num1);
		nuevaCalculadora.setY(num2);
		resultadoP = nuevaCalculadora.power();
		model.addAttribute("resultadoP", resultadoP);
		
		return "resultadopotencia";
	
	}
	
	@GetMapping("/calculoRaiz")
	public String getRaizPage(@RequestParam (name = "num1") int num1 , @RequestParam (name = "num2") int num2 , Model model){
		double resultadoRa = 0;
		
		Calculator nuevaCalculadora = new Calculator();
		nuevaCalculadora.setX(num1);
		nuevaCalculadora.setY(num2);
		resultadoRa = nuevaCalculadora.root();
		model.addAttribute("resultadoRa", resultadoRa);
		
		return "resultadoraiz";
	
	}
	
}
