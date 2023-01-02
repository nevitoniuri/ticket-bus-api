package com.nevitoniuri.ticketbusapi.repository;

import com.nevitoniuri.ticketbusapi.domain.model.Passageiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassageiroRepository extends JpaRepository<Passageiro, Long> {

}
