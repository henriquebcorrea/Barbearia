package com.barbearia.agendamento.repository;

import com.barbearia.agendamento.model.Barbeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {
}
