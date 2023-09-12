package com.ppfurtado.planpnae.domain.repositories;

import com.ppfurtado.planpnae.domain.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

}
