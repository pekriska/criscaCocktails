package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sk.crisca.cocktails.app.model.CocktailIngredientId;
import sk.crisca.cocktails.app.model.TIngredient;

public interface IIngredient extends JpaRepository<TIngredient, CocktailIngredientId>{

}
