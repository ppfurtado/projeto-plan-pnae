package com.ppfurtado.hibernatetutorial.controllers;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import com.ppfurtado.hibernatetutorial.domain.services.FichaTecnicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v2/ficha-tecnica")
@RestController
public class FichaTecnicaController {

    private final FichaTecnicaService fichaTecnicaService;

    public FichaTecnicaController(FichaTecnicaService fichaTecnicaService) {
        this.fichaTecnicaService = fichaTecnicaService;
    }

    @GetMapping()
    public ResponseEntity<List<FichaTecnica>> listaFichaTecnica(){
        List<FichaTecnica> fichaTecnicas = fichaTecnicaService.findAll();

        return ResponseEntity.ok(fichaTecnicas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FichaTecnica> buscarFichaTecnicaPorId(@PathVariable @Validated Long id) throws Exception {
        FichaTecnica fichaTecnica = fichaTecnicaService.findById(id);

        return ResponseEntity.ok(fichaTecnica);
    }

    @PostMapping()
    public ResponseEntity<FichaTecnica> salvar(@RequestBody FichaTecnicaRequest request) throws Exception {
        FichaTecnica fichaTecnica = fichaTecnicaService.save(request);

        return ResponseEntity.ok(fichaTecnica);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<FichaTecnica> deletar(@PathVariable Long id) throws Exception {
        FichaTecnica fichaTecnica = fichaTecnicaService.delete(id);

        return ResponseEntity.ok(fichaTecnica);
    }
}
