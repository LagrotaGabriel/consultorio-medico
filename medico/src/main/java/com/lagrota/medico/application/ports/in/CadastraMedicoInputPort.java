package com.lagrota.medico.application.ports.in;

import com.lagrota.medico.application.core.domain.Medico;

public interface CadastraMedicoInputPort {

    void cadastra(Medico medico);
}
