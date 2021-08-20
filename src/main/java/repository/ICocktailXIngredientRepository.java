package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sk.crisca.cocktails.app.model.TCocktailXIngredient;

public interface ICocktailXIngredientRepository extends JpaRepository<TCocktailXIngredient, Long>{

}
