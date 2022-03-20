/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.control.dto;

/**
 *
 * @author 
 */
public class LibroDto {
    
    private Integer idLibro;
    private String titolo;
    private String editore;
    private String autore;
    private boolean stato;
    
    public LibroDto() {}
    
    public LibroDto(String titolo, String editore, String autore) {
    
        this.titolo = titolo;
        this.editore = editore;
        this.autore = autore;
    }
    
    public LibroDto(Integer idLibro, String titolo, String editore, String autore, boolean stato) {
    
        this.idLibro = idLibro;
        this.titolo = titolo;
        this.editore = editore;
        this.autore = autore;
        this.stato = stato;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getEditore() {
        return editore;
    }

    public String getAutore() {
        return autore;
    }

    public boolean isStato() {
        return stato;
    }
    
    
}
