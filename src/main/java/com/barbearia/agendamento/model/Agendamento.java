package com.barbearia.agendamento.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Servico servico;

    @ManyToOne
    private Barbeiro barbeiro;

    private LocalDateTime dataHora;
    private boolean confirmado;
    private boolean chegou; // usado para registro de chegada
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Servico getServico() {
        return servico;
    }
    public void setServico(Servico servico) {
        this.servico = servico;
    }
    public Barbeiro getBarbeiro() {
        return barbeiro;
    }
    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public boolean isConfirmado() {
        return confirmado;
    }
    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
    public boolean isChegou() {
        return chegou;
    }
    public void setChegou(boolean chegou) {
        this.chegou = chegou;
    }

    
}
