package sk.crisca.cocktails.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "t_cocktails_x_t_ingredients", schema = "co")
public class TCocktailXIngredient implements Serializable{

	@EmbeddedId
	private CocktailIngredientId id;
	
	@ManyToMany
	@MapsId("cocktail_id")
	@JoinColumn(name = "cocktail_id", nullable = false)
	private TCocktail cocktail;
	
	@ManyToMany
	@MapsId("ingredient_id")
	@JoinColumn(name = "ingredient_id", nullable = false)
	private TIngredient ingredient;

	public TCocktailXIngredient() {
		super();
	}
	
	
}
