package com.lagrota.medico.repository;

import com.lagrota.medico.entity.MedicoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends MongoRepository<MedicoEntity, String> {
}
