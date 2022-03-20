/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.control.webServiceServer;

import it.spring_example.springExample.control.controller.UtenteAnonimoController;
import it.spring_example.springExample.control.dto.LibroDto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */
@RestController
@RequestMapping("/ws-libri")
@CrossOrigin("http://localhost:4200")
public class UtenteAnonimoWebServiceServer {
    
    @Autowired
    private UtenteAnonimoController utenteAnonimoController;
    
    @GetMapping("load-list-libri")
    public List<LibroDto> loadElencoLibri() {
    
        return utenteAnonimoController.libroFindAllController();
    }
    
    @GetMapping("load-libro-by-id")
    public LibroDto loadLibroById(@RequestParam(required=true) Integer idLibro) {
    
        return utenteAnonimoController.libroFindByIdController(idLibro);
    }
    
    @PostMapping("add-libro")
    public Map<String, Integer> addLibro(@RequestBody LibroDto libro) {
    
        Map<String, Integer> map = new HashMap<>();
        map.put("idLibro", utenteAnonimoController.addLibroController(libro));
        
        /*Map<String, Boolean> map = new HashMap<>();
        Boolean booleanResult = false;
        if (utenteAnonimoController.addLibroController(libro) > 0) {
            booleanResult = true;
        }
        map.put("idLibro", booleanResult);*/
        
        return map;
    }
    
    @GetMapping("remove-libro")
    public Map<String, Integer> removeLibro(@RequestParam(required=true) Integer idLibro) {
    
        Map<String, Integer> map = new HashMap<>();
        map.put("idLibro", utenteAnonimoController.removeLibroController(idLibro));
        
        return map;
    }
}
