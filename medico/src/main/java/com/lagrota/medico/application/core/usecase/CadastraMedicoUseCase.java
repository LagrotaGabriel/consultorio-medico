package com.lagrota.medico.application.core.usecase;

import com.lagrota.medico.application.core.domain.Medico;
import com.lagrota.medico.application.ports.in.CadastraMedicoInputPort;
import com.lagrota.medico.application.ports.out.CadastraMedicoOutputPort;

/**
 * CadastraMedicoUseCase
 * Caso de uso de cadastro de novo médico
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 19/11/2024 - 11:05
 */
public class CadastraMedicoUseCase implements CadastraMedicoInputPort {

    private final CadastraMedicoOutputPort cadastraMedicoOutputPort;

    public CadastraMedicoUseCase(CadastraMedicoOutputPort cadastraMedicoOutputPort) {
        this.cadastraMedicoOutputPort = cadastraMedicoOutputPort;
    }

    @Override
    public void cadastra(Medico medico) {
        cadastraMedicoOutputPort.cadastra(medico);
    }
}