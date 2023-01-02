package com.nevitoniuri.ticketbusapi.resource;

import com.nevitoniuri.ticketbusapi.service.PassageiroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("passageiros")
public class PassageiroResource {

    private final PassageiroService service;


}
