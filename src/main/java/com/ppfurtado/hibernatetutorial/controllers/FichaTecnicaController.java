package com.ppfurtado.hibernatetutorial.controllers;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import com.ppfurtado.hibernatetutorial.domain.services.FichaTecnicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class FichaTecnicaController {

    private final FichaTecnicaService fichaTecnicaService;

    public FichaTecnicaController(FichaTecnicaService fichaTecnicaService) {
        this.fichaTecnicaService = fichaTecnicaService;
    }

    @GetMapping("/fichas-tecnicas")
    public ResponseEntity<List<FichaTecnica>> listaFichaTecnica(){
        List<FichaTecnica> fichaTecnicas = fichaTecnicaService.findAll();

        return ResponseEntity.ok(fichaTecnicas);
    }

    @GetMapping("/fichas-tecnicas/{id}")
    public ResponseEntity<FichaTecnica> buscarFichaTecnicaPorId(@PathVariable @Validated Long id){
        FichaTecnica fichaTecnica = fichaTecnicaService.findById(id);

        return ResponseEntity.ok(fichaTecnica);
    }

    @PostMapping("/fichas-tecnicas")
    public ResponseEntity<FichaTecnicaRequest> salvar(@RequestBody FichaTecnicaRequest request){
        FichaTecnica fichaTecnica = fichaTecnicaService.save(request);

        return ResponseEntity.ok(request);
    }

}
