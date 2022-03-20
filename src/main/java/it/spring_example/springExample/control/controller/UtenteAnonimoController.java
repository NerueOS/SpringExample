/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.control.controller;

import it.spring_example.springExample.control.dto.LibroDto;
import it.spring_example.springExample.control.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author 
 */
@Component
public class UtenteAnonimoController {
    
    @Autowired
    private LibroService libroService;
    
    public UtenteAnonimoController() {
    
        libroService = new LibroService();
    }
    
    public List<LibroDto> libroFindAllController() {
    
        return libroService.libroFindAllService();
    } 
    
    public LibroDto libroFindByIdController(Integer idLibro) {
    
        return libroService.libroFindByIdService(idLibro);
    } 
    
    public Integer addLibroController(LibroDto libro) {
    
        return libroService.addLibroService(libro);
    }
    
    public Integer removeLibroController(Integer idLibro) {
    
        return libroService.removeLibroService(idLibro);
    }
}
