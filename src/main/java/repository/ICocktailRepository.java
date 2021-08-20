package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sk.crisca.cocktails.app.model.TCocktail;

public interface ICocktailRepository extends JpaRepository<TCocktail, Long>{

	
}
