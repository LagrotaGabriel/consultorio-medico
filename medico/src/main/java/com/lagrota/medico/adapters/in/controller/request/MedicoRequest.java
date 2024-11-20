package com.lagrota.medico.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * MedicoRequest
 * Classe responsável por fornecer atributos que deverão ser utilizados durante a requisição de criação de um novo Medico
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 19/11/2024 - 11:44
 */
@Data
public class MedicoRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String crm;
}
