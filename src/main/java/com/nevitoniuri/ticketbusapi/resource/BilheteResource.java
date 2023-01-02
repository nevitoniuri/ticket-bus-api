package com.nevitoniuri.ticketbusapi.resource;

import com.nevitoniuri.ticketbusapi.domain.model.Bilhete;
import com.nevitoniuri.ticketbusapi.service.BilheteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("bilhetes")
public class BilheteResource {

    private final BilheteService service;

    @GetMapping("{id}")
    public Bilhete findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public Page<Bilhete> list(Pageable pageable) {
        return service.list(pageable);
    }

}
