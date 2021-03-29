package com.calculadoraedades.calculadoraedades.services;

import com.calculadoraedades.calculadoraedades.entities.Edad;

import java.time.LocalDate;

public class PersonaService
{

    public static Edad edad(int dia, int mes, int anio)
    {
        LocalDate edad = LocalDate.now().minusDays(dia).minusMonths(mes).minusYears(anio);

        return new Edad(edad.getYear());
    }

}
