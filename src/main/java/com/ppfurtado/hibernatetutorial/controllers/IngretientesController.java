package com.ppfurtado.hibernatetutorial.controllers;

import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;
import com.ppfurtado.hibernatetutorial.domain.services.IngredientesService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/ingredientes")
public class IngretientesController {

    private final IngredientesService ingredientesService;

    public IngretientesController(IngredientesService ingredientesService) {
        this.ingredientesService = ingredientesService;
    }


    @GetMapping()
    public ResponseEntity<List<Ingredientes>> buscaIngredientes(){
        List<Ingredientes> ingredientes = ingredientesService.buscarIngrediente();

        return ResponseEntity.ok(ingredientes);
    }

    @GetMapping("{id}")
    public ResponseEntity<Ingredientes> buscarIngredientePorId(@PathVariable(value = "id") @Validated Long id) throws Exception {
        Ingredientes ingredientes = ingredientesService.buscarIngredientesPorId(id);

        return ResponseEntity.ok(ingredientes);
    }

    @GetMapping("buscar-por-nome")
    public ResponseEntity<List<Ingredientes>> buscarIngredientePorNome(@RequestParam String nome) {
        List<Ingredientes> ingredientes = ingredientesService.buscarIngredientesPorNome(nome);

        return ResponseEntity.ok(ingredientes);
    }
}
