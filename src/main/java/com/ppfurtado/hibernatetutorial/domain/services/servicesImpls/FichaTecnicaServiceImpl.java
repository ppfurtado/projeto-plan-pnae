package com.ppfurtado.hibernatetutorial.domain.services.servicesImpls;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.mappers.FichaTecnicaMapper;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;
import com.ppfurtado.hibernatetutorial.domain.repositories.FichaTecnicaRepository;
import com.ppfurtado.hibernatetutorial.domain.repositories.IngredientesRepository;
import com.ppfurtado.hibernatetutorial.domain.services.FichaTecnicaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichaTecnicaServiceImpl implements FichaTecnicaService {

    private final FichaTecnicaRepository fichaTecnicaRepository;
    private final IngredientesRepository ingredientesRepository;

    public FichaTecnicaServiceImpl(FichaTecnicaRepository fichaTecnicaRepository, IngredientesRepository ingredientesRepository) {
        this.fichaTecnicaRepository = fichaTecnicaRepository;
        this.ingredientesRepository = ingredientesRepository;
    }


    @Override
    public List<FichaTecnica> findAll() {
        return fichaTecnicaRepository.findAll();
    }

    @Override
    public FichaTecnica findById(Long id) throws Exception {
        return fichaTecnicaRepository.findById(id).orElseThrow( () ->new Exception("Ficha não encontrada"));
    }

    @Override
    public FichaTecnica save(FichaTecnicaRequest request) {

        List<Ingredientes> ingrediente = ingredientesRepository.findAllById(request.getIngredientes());
        double energiaKcal = ingrediente.stream().mapToDouble(i -> Double.parseDouble(i.getEnergiaKcal().replace("," , "."))).sum();
        FichaTecnica fichaTecnica = FichaTecnicaMapper.INSTANCE.toEntity(request);
        fichaTecnica.setIngredientes(ingrediente);
        return fichaTecnicaRepository.save(fichaTecnica);
    }

    @Override
    public FichaTecnica delete(Long id) throws Exception {
        FichaTecnica fichaTecnica = findById(id);

        fichaTecnicaRepository.delete(fichaTecnica);

        return fichaTecnica;
    }
}
