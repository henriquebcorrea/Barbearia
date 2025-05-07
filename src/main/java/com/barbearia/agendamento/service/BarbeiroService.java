package com.barbearia.agendamento.service;

import com.barbearia.agendamento.model.Barbeiro;
import com.barbearia.agendamento.repository.BarbeiroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarbeiroService {

    private final BarbeiroRepository repository;

    public BarbeiroService(BarbeiroRepository repository) {
        this.repository = repository;
    }

    public Barbeiro salvar(Barbeiro barbeiro) {
        return repository.save(barbeiro);
    }

    public List<Barbeiro> listarTodos() {
        return repository.findAll();
    }
}
