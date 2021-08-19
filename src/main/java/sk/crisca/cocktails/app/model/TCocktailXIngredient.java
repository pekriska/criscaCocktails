package sk.crisca.cocktails.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "t_cocktails_x_t_ingredients", schema = "co")
public class TCocktailXIngredient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5606973960779772338L;

	@EmbeddedId
	private CocktailIngredientId id;
	
	@ManyToOne
	@MapsId("cocktail_id")
	@JoinColumn(name = "cocktail_id", nullable = false)
	private TCocktail cocktail;
	
	@ManyToOne
	@MapsId("ingredient_id")
	@JoinColumn(name = "ingredient_id", nullable = false)
	private TIngredient ingredient;

	public TCocktailXIngredient() {
		super();
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
}
