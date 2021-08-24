package sk.crisca.cocktails.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sk.crisca.cocktails.app.model.CocktailIngredientId;
import sk.crisca.cocktails.app.model.TIngredient;

public interface IIngredientRepository extends JpaRepository<TIngredient, CocktailIngredientId>{

}
