package com.calculadoraedades.calculadoraedades.dtos;

import com.calculadoraedades.calculadoraedades.entities.Edad;

public class EdadDtoMapper
{
    public static EdadDto mapToDto(Edad edad)
    {
        return new EdadDto(edad.getEdad());
    }
}
