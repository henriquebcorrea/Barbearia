package com.barbearia.agendamento.service;

import org.springframework.stereotype.Service;
import com.barbearia.agendamento.model.Cliente;
import com.barbearia.agendamento.repository.ClienteRepository;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> buscarPorEmail(String email) {
        return Optional.ofNullable(repository.findByEmail(email));
    }
}
