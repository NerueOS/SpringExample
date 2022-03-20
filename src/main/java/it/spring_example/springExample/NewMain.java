/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.spring_example.springExample;

import it.spring_example.springExample.model.dao.LibroDao;
import it.spring_example.springExample.model.entity.Libro;
import java.util.List;

/**
 *
 * @author 
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TEST DAO
        /*List<Libro> elencoLibri = new LibroDao().findAll();
        int lunghezzaLista = elencoLibri.size();
        
        new LibroDao().addLibro("gianni", "mimmo", "mario");
        
        elencoLibri = new LibroDao().findAll();
        
        if (lunghezzaLista == (elencoLibri.size()-1)) {
        
            System.out.println("Test Riuscito");
        } else {
        
            System.out.println("Test Non Riuscito");
        }*/
        
        //TEST DAO n.2
        /*
        int idLibroAggiunto = new LibroDao().addLibro("gianni", "mimmo", "mario");
        
        Libro libroDaRicercare = new LibroDao().findById(idLibroAggiunto);
        
        if (idLibroAggiunto == libroDaRicercare.getIdLibro()) {
            
            System.out.println("Test Riuscito");
        } else {
        
            System.out.println("Test Non Riuscito");
        }*/
        
        //TEST DAO n.3
        
        int idLibroAggiunto = new LibroDao().addLibro("gianni", "mimmo", "mario");
        
        new LibroDao().removeLibro(idLibroAggiunto);
        
        try {
        
            Libro libro = new LibroDao().findById(idLibroAggiunto);

            if (idLibroAggiunto == libro.getIdLibro()) {

                System.out.println("Test Non Riuscito");
            } 
        
        } catch (Exception ex) {
        
            System.out.println("Test Riuscito");
        }
    }
    
}
