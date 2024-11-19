package com.lagrota.medico.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * MedicoEntity
 * Entidade Medico, que deverá proporcionar os atributos relacionados à entidade Medico no banco de dados
 * @author Gabriel Henrique Afonso Cruz Lagrota
 * @since 19/11/2024 - 11:18
 */
@Data
@Document(collation = "medico")
public class MedicoEntity {

    @Id
    private String id;

    private String nome;

    private String crm;
}
