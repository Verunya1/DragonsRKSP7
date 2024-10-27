package com.verarchik.dragonsrksp7.repository;

import com.verarchik.dragonsrksp7.model.Dragon;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DragonRepository extends R2dbcRepository<Dragon, Long> {
}
