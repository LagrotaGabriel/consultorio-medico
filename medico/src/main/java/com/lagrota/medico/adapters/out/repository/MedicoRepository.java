package com.lagrota.medico.adapters.out.repository;

import com.lagrota.medico.adapters.out.repository.entity.MedicoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends MongoRepository<MedicoEntity, String> {
}
