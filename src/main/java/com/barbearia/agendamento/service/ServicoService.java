package com.barbearia.agendamento.service;

import com.barbearia.agendamento.model.Servico;
import com.barbearia.agendamento.repository.ServicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private final ServicoRepository repository;

    public ServicoService(ServicoRepository repository) {
        this.repository = repository;
    }

    public Servico salvar(Servico servico) {
        return repository.save(servico);
    }

    public List<Servico> listarTodos() {
        return repository.findAll();
    }
}
