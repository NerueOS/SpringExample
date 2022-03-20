/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.control.service;

import it.spring_example.springExample.control.dto.LibroDto;
import it.spring_example.springExample.control.dto.conversionFactory.ConversionBeanToDtoFactory;
import it.spring_example.springExample.control.dto.conversionFactory.ConversionDtoToBeanFactory;
import it.spring_example.springExample.model.dao.LibroDao;
import it.spring_example.springExample.model.entity.Libro;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service
public class LibroService {
    
    private ConversionBeanToDtoFactory conversionBeanToDtoFactory;
    private ConversionDtoToBeanFactory conversionDtoToBeanFactory;
    
    private LibroDao libroDao;
    
    public LibroService() {
    
        this.conversionBeanToDtoFactory = new ConversionBeanToDtoFactory();
        this.conversionDtoToBeanFactory = new ConversionDtoToBeanFactory();
        this.libroDao = new LibroDao();
    }
    
    public List<LibroDto> libroFindAllService() {
    
        List<Libro> elencoLibriBean = libroDao.findAll();
        
        List<LibroDto> elencoLibroDto = new ArrayList<>();
        for (Libro libroBean : elencoLibriBean) {
        
            elencoLibroDto.add(
                conversionBeanToDtoFactory.libroBeanToDto(libroBean));
        } 
        
        return elencoLibroDto;
    }
    
    public LibroDto libroFindByIdService(Integer idLibro) {
    
        Libro libro = libroDao.findById(idLibro);
        
        LibroDto libroDto = conversionBeanToDtoFactory.libroBeanToDto(libro);
        
        return libroDto;
    }
    
    public Integer addLibroService(LibroDto libroDto) {
    
        Libro libro = conversionDtoToBeanFactory.libroDtoToBean(libroDto);
        
        Integer idLibro = libroDao.addLibro(libro.getTitolo(), 
                                            libro.getEditore(), 
                                            libro.getAutore());
        
        return idLibro;
    }
    
    public Integer removeLibroService(Integer idLibro) {
    
        //Libro libro = conversionDtoToBeanFactory.libroDtoToBean(libroDto);
        
        Integer id = libroDao.removeLibro(idLibro);
        
        return id;
    }
}
