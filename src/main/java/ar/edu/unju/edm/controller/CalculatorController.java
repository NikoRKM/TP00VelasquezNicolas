package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.Calculator;

@Controller

public class CalculatorController {
	
	@GetMapping("/menu")
	
	public String getMenu() {
		
		return "index";
		
	}
	
	@GetMapping("/calculoSuma")
	
	public String getSumaPage(@RequestParam (name = "x") int x , @RequestParam (name = "y") int y , Model model){
		int r = 0;
		Calculator nuevaCalculadora = new Calculator();
		nuevaCalculadora.setX(x);
		nuevaCalculadora.setY(y);
		r = nuevaCalculadora.sum();
		model.addAttribute("r", r);
		
		return "result";
		
	}
	
}
