package com.nevitoniuri.ticketbusapi.resource;

import com.nevitoniuri.ticketbusapi.resource.assembler.RodoviariaAssembler;
import com.nevitoniuri.ticketbusapi.resource.request.RodoviariaCreate;
import com.nevitoniuri.ticketbusapi.resource.response.RodoviariaResponse;
import com.nevitoniuri.ticketbusapi.service.RodoviariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("rodoviarias")
public class RodoviariaResource {

    private final RodoviariaService service;
    private final RodoviariaAssembler assembler;

    @GetMapping
    public Page<RodoviariaResponse> list(Pageable pageable) {
        return service.list(pageable).map(assembler::toResponse);
    }

    @PostMapping
    public void create(RodoviariaCreate rodoviariaCreate) {
        service.save(assembler.toEntity(rodoviariaCreate));
    }
}
