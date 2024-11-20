package com.lagrota.medico.config;

import com.lagrota.medico.adapters.out.CadastraMedicoAdapter;
import com.lagrota.medico.application.core.usecase.CadastraMedicoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CadastraMedicoConfig
 * Beans do usecase de cadastro de médicos
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 20/11/2024 - 09:44
 */
@Configuration
public class CadastraMedicoConfig {

    @Bean
    public CadastraMedicoUseCase cadastraMedicoUseCase(CadastraMedicoAdapter cadastraMedicoAdapter) {

        return new CadastraMedicoUseCase(cadastraMedicoAdapter);
    }
}