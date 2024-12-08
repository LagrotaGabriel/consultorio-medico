package com.lagrota.medico.actions.cadastro.services.impl;

import com.lagrota.medico.actions.cadastro.dto.MedicoRequest;
import com.lagrota.medico.actions.cadastro.services.CadastraMedicoService;
import com.lagrota.medico.entity.mapper.MedicoEntityMapper;
import com.lagrota.medico.entity.MedicoEntity;
import com.lagrota.medico.repository.MedicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * CadastraMedicoServiceImpl
 * Classe responsável por cadastrar novos médicos na aplicação
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 08/12/2024 - 10:59
 */
@Service
@RequiredArgsConstructor
public class CadastraMedicoServiceImpl implements CadastraMedicoService {

    private final MedicoRepository medicoRepository;
    private final MedicoEntityMapper medicoEntityMapper;

    @Override
    public void cadastra(MedicoRequest medicoRequest) {
        MedicoEntity medicoEntity = medicoEntityMapper.geraDeRequest(medicoRequest);
        medicoRepository.save(medicoEntity);
    }
}
