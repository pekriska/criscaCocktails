package sk.crisca.cocktails.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sk.crisca.cocktails.app.repository.IIngredientRepository;

@Controller
public class IngredientController {
	
	@Autowired
	private  IIngredientRepository ingredientRepository;
	
	@GetMapping("/ingredients") //local url: http://localhost:8080/criscaCocktails/ingredients
	public String getIngredients(Model model) {
		
		model.addAttribute("ingredients", ingredientRepository.findAll());
		
		return "ingredients"; //return ingredients.html from /templates
	}

}
