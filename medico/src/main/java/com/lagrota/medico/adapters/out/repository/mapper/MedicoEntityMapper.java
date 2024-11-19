package com.lagrota.medico.adapters.out.repository.mapper;

import com.lagrota.medico.adapters.out.repository.entity.MedicoEntity;
import com.lagrota.medico.application.core.domain.Medico;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicoEntityMapper {

    MedicoEntity geraMedicoEntity(Medico medico);
}
