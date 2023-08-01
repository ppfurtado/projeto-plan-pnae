package com.ppfurtado.planpnae.domain.repositories;

import com.ppfurtado.planpnae.domain.model.FichaTecnica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FichaTecnicaRepository extends JpaRepository<FichaTecnica, Long> {
}