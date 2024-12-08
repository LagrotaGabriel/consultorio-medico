package com.lagrota.medico.actions.cadastro.controller;

import com.lagrota.medico.actions.cadastro.dto.MedicoRequest;
import com.lagrota.medico.actions.cadastro.services.CadastraMedicoService;
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

    private final CadastraMedicoService cadastraMedicoService;

    @PostMapping
    public ResponseEntity<Void> cadastra(@RequestBody @Valid MedicoRequest medicoRequest) {

        cadastraMedicoService.cadastra(medicoRequest);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
