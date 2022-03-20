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
public class ConversionDtoToBeanFactory {
    
    public Libro libroDtoToBean(LibroDto libroDto) {
    
        return new Libro(libroDto.getIdLibro(), libroDto.getTitolo(),
                         libroDto.getEditore(), libroDto.getAutore(),
                         libroDto.isStato());
    }
}
