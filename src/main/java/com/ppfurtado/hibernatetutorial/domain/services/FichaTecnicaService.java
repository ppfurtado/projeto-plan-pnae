package com.ppfurtado.hibernatetutorial.domain.services;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;

import java.util.List;

public interface FichaTecnicaService {

    List<FichaTecnica> findAll();

    FichaTecnica findById(Long id) throws Exception;

    FichaTecnica save(FichaTecnicaRequest fichaTecnica) throws Exception;

    FichaTecnica delete(Long id) throws Exception;
}
