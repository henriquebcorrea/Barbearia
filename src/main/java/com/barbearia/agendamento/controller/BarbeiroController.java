package com.barbearia.agendamento.controller;

import com.barbearia.agendamento.model.Barbeiro;
import com.barbearia.agendamento.service.BarbeiroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barbeiros")
public class BarbeiroController {

    private final BarbeiroService service;

    public BarbeiroController(BarbeiroService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Barbeiro> cadastrar(@RequestBody Barbeiro barbeiro) {
        return ResponseEntity.ok(service.salvar(barbeiro));
    }

    @GetMapping
    public ResponseEntity<List<Barbeiro>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }
}
