package com.calculadoraedades.calculadoraedades.controllers;

import com.calculadoraedades.calculadoraedades.dtos.EdadDtoMapper;
import com.calculadoraedades.calculadoraedades.entities.Edad;
import com.calculadoraedades.calculadoraedades.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController
{
    @GetMapping("edad/{dia}/{mes}/{anio}")
    public ResponseEntity edad(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio)
    {
        Edad e = PersonaService.edad(dia, mes, anio);
        return new ResponseEntity(EdadDtoMapper.mapToDto(e), HttpStatus.OK);
    }
}
