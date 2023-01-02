package com.nevitoniuri.ticketbusapi.repository;

import com.nevitoniuri.ticketbusapi.domain.model.Bilhete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BilheteRepository extends JpaRepository<Bilhete, Long> {

}
