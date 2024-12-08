package com.lagrota.medico.entity.mapper;

import com.lagrota.medico.actions.cadastro.dto.MedicoRequest;
import com.lagrota.medico.entity.MedicoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicoEntityMapper {

    MedicoEntity geraDeRequest(MedicoRequest medico);
}
