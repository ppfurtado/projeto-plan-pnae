package com.ppfurtado.planpnae.controllers;

import com.ppfurtado.planpnae.domain.dtos.CardapioRequest;
import com.ppfurtado.planpnae.domain.model.Cardapio;
import com.ppfurtado.planpnae.domain.services.CardapioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v2/cardapio")
@RestController
public class CardapioController {

    private final CardapioService cardapioService;

    public CardapioController(CardapioService cardapioService) {
        this.cardapioService = cardapioService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Cardapio> save(@RequestBody CardapioRequest request){
        return ResponseEntity.ok(cardapioService.save(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cardapio> findById(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok().body(cardapioService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Cardapio>> findByAll(){
        return ResponseEntity.ok().body(cardapioService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> findByAll(@PathVariable(value = "id") Long id){
        cardapioService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable(value = "id") Long id, @RequestBody CardapioRequest request){
        cardapioService.update(id, request);
        return ResponseEntity.noContent().build();
    }
}
