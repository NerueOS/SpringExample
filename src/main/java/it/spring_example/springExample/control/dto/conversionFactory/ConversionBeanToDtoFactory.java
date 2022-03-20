/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.control.dto.conversionFactory;

import it.spring_example.springExample.control.dto.LibroDto;
import it.spring_example.springExample.model.entity.Libro;

/**
 *
 * @author 
 */
public class ConversionBeanToDtoFactory {
    
    public LibroDto libroBeanToDto(Libro libro) {
    
        return new LibroDto(libro.getIdLibro(), libro.getTitolo(), 
                            libro.getEditore(), libro.getAutore(),
                            libro.getStato());
    }
}
