package com.ppfurtado.hibernatetutorial.domain.repositories;

import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientesRepository extends JpaRepository<Ingredientes, Long>, JpaSpecificationExecutor<Ingredientes> {

    List<Ingredientes> findAllByNomeContaining(String nome);
}