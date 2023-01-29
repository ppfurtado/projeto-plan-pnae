package com.ppfurtado.hibernatetutorial.controllers;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import com.ppfurtado.hibernatetutorial.domain.services.FichaTecnicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public ResponseEntity<FichaTecnica> buscarFichaTecnicaPorId(@PathVariable @Validated Long id) throws Exception {
        FichaTecnica fichaTecnica = fichaTecnicaService.findById(id);

        return ResponseEntity.ok(fichaTecnica);
    }

    @PostMapping("/fichas-tecnicas/criar")
    public ResponseEntity<FichaTecnica> salvar(@RequestBody FichaTecnicaRequest request) throws Exception {
        FichaTecnica fichaTecnica = fichaTecnicaService.save(request);

        return ResponseEntity.ok(fichaTecnica);
    }


    @DeleteMapping("/fichas-tecnicas/{id}")
    public ResponseEntity<FichaTecnica> deletar(@PathVariable Long id) throws Exception {
        FichaTecnica fichaTecnica = fichaTecnicaService.delete(id);

        return ResponseEntity.ok(fichaTecnica);
    }
}
