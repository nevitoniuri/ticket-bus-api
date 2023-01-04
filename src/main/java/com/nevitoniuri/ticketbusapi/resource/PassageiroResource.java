package com.nevitoniuri.ticketbusapi.resource;

import com.nevitoniuri.ticketbusapi.resource.assembler.PassageiroAssembler;
import com.nevitoniuri.ticketbusapi.resource.request.PassageiroCreate;
import com.nevitoniuri.ticketbusapi.resource.response.PassageiroResponse;
import com.nevitoniuri.ticketbusapi.service.PassageiroService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("passageiros")
public class PassageiroResource {

    private final PassageiroService service;
    private final PassageiroAssembler assembler;

    @GetMapping
    public Page<PassageiroResponse> list(Pageable pageable) {
        return service.list(pageable).map(assembler::toResponse);
    }

    @PostMapping
    public void create(PassageiroCreate passageiroCreate) {
        service.save(assembler.toEntity(passageiroCreate));
    }

}
