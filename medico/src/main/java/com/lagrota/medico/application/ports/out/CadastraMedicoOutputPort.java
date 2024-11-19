package com.lagrota.medico.application.ports.out;

import com.lagrota.medico.application.core.domain.Medico;

public interface CadastraMedicoOutputPort {

    void cadastra(Medico medico);
}
