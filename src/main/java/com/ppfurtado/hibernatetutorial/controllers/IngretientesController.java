package com.ppfurtado.hibernatetutorial.controllers;

import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;
import com.ppfurtado.hibernatetutorial.domain.services.IngredientesService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngretientesController {

    private final IngredientesService ingredientesService;

    public IngretientesController(IngredientesService ingredientesService) {
        this.ingredientesService = ingredientesService;
    }


    @GetMapping("/ingredientes")
    public ResponseEntity<List<Ingredientes>> buscaIngredientes(){
        List<Ingredientes> ingredientes = ingredientesService.buscarIngrediente();

        return ResponseEntity.ok(ingredientes);
    }

    @GetMapping("/ingredientes/{id}")
    public ResponseEntity<Ingredientes> buscarIngredientePorId(@PathVariable @Validated Long id){
        Ingredientes ingredientes = ingredientesService.buscarIngredientesPorId(id);

        return ResponseEntity.ok(ingredientes);
    }
}
