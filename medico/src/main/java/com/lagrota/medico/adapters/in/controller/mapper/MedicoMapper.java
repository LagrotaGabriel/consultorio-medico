package com.lagrota.medico.adapters.in.controller.mapper;

import com.lagrota.medico.adapters.in.controller.request.MedicoRequest;
import com.lagrota.medico.application.core.domain.Medico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MedicoMapper {

    @Mapping(target = "id", ignore = true)
    Medico geraMedico(MedicoRequest medicoRequest);
}
