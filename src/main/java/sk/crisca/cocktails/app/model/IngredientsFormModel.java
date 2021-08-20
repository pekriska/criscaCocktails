package sk.crisca.cocktails.app.model;

import java.util.Arrays;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class IngredientsFormModel {
	
	private Long[] ingredientsId;

	public IngredientsFormModel() {
		super();
	}

	public Long[] getIngredientsId() {
		return ingredientsId;
	}

	public void setIngredientsId(Long[] ingredientsId) {
		this.ingredientsId = ingredientsId;
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
