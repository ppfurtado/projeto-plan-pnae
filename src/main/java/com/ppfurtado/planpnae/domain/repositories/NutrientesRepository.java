package com.ppfurtado.planpnae.domain.repositories;

import com.ppfurtado.planpnae.domain.model.Nutrientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface NutrientesRepository extends JpaRepository<Nutrientes, Long>, JpaSpecificationExecutor<Nutrientes> {
}
