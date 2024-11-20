package com.lagrota.medico.adapters.in.controller;

import com.lagrota.medico.adapters.in.controller.mapper.MedicoMapper;
import com.lagrota.medico.adapters.in.controller.request.MedicoRequest;
import com.lagrota.medico.application.core.domain.Medico;
import com.lagrota.medico.application.ports.in.CadastraMedicoInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MedicoController
 * Controller responsável por proporcionar endpoints que deverão ser utilizados no módulo de médico
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 19/11/2024 - 11:42
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/medico")
public class MedicoController {

    private final CadastraMedicoInputPort cadastraMedicoInputPort;
    private final MedicoMapper medicoMapper;

    @PostMapping
    public ResponseEntity<Void> cadastra(@RequestBody @Valid MedicoRequest medicoRequest) {

        Medico medico = medicoMapper.geraMedico(medicoRequest);
        cadastraMedicoInputPort.cadastra(medico);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
