package sk.crisca.cocktails.app.service;

import java.util.List;

import sk.crisca.cocktails.app.model.TCocktailXIngredient;

public interface ICocktailXIngredientService {

	public List<TCocktailXIngredient> findAllCocktailsByIngredientIds(List<Long> ingredientIds);
	}
