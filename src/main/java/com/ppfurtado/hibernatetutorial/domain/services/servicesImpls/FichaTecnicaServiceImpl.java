package com.ppfurtado.hibernatetutorial.domain.services.servicesImpls;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.mappers.FichaTecnicaMapper;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import com.ppfurtado.hibernatetutorial.domain.repositories.FichaTecnicaRepository;
import com.ppfurtado.hibernatetutorial.domain.services.FichaTecnicaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichaTecnicaServiceImpl implements FichaTecnicaService {

    private final FichaTecnicaRepository fichaTecnicaRepository;

    public FichaTecnicaServiceImpl(FichaTecnicaRepository fichaTecnicaRepository) {
        this.fichaTecnicaRepository = fichaTecnicaRepository;
    }


    @Override
    public List<FichaTecnica> findAll() {
        return fichaTecnicaRepository.findAll();
    }

    @Override
    public FichaTecnica findById(Long id) {
        return fichaTecnicaRepository.findById(id).orElseThrow();
    }

    @Override
    public FichaTecnica save(FichaTecnicaRequest request) {
        FichaTecnica fichaTecnica = FichaTecnicaMapper.INSTANCE.toEntity(request);
        return fichaTecnicaRepository.save(fichaTecnica);
    }
}
