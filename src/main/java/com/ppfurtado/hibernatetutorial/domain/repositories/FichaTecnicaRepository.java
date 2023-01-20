package com.ppfurtado.hibernatetutorial.domain.repositories;

import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FichaTecnicaRepository extends JpaRepository<FichaTecnica, Long> {
}