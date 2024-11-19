package com.lagrota.medico.adapters.out;

import com.lagrota.medico.adapters.out.repository.MedicoRepository;
import com.lagrota.medico.adapters.out.repository.entity.MedicoEntity;
import com.lagrota.medico.adapters.out.repository.mapper.MedicoEntityMapper;
import com.lagrota.medico.application.core.domain.Medico;
import com.lagrota.medico.application.ports.out.CadastraMedicoOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * CadastraMedicoAdapter
 * Adapter responsável por cadastrar novos médicos na aplicação
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 19/11/2024 - 11:33
 */
@Component
@RequiredArgsConstructor
public class CadastraMedicoAdapter implements CadastraMedicoOutputPort {

    private final MedicoRepository medicoRepository;
    private final MedicoEntityMapper medicoEntityMapper;

    @Override
    public void cadastra(Medico medico) {
        MedicoEntity medicoEntity = medicoEntityMapper.geraMedicoEntity(medico);
        medicoRepository.save(medicoEntity);
    }
}
