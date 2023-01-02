package com.nevitoniuri.ticketbusapi.repository;

import com.nevitoniuri.ticketbusapi.domain.model.Linha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinhaRepository extends JpaRepository<Linha, Long> {

}
