package com.ppfurtado.hibernatetutorial.domain.repositories;

import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientesRepository extends JpaRepository<Ingredientes, Long> {
}