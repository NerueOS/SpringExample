/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.model.dao;

import it.spring_example.springExample.libroException.LibroException;
import it.spring_example.springExample.model.entity.Libro;
import it.spring_example.springExample.persistenceLayer.PersistenceLayer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author 
 */
public class LibroDao {
    
    private EntityManager em;
    
    public LibroDao() {
    
        em = PersistenceLayer.getEntityManager();
    }
    
    public List<Libro> findAll() {
        
        List<Libro> libros = new ArrayList<>();
        
        try {
            
            Query query = em.createNamedQuery("Libro.findAll");
            libros = query.getResultList();
            
            if (libros == null) {
                throw new LibroException("Lista libro nulla");
            } else if (libros.isEmpty()) {
                throw new LibroException("Lista libro vuota");
            }
            
        } catch (LibroException lEx) {
            
            System.out.println(lEx.getMessage());
            return new ArrayList<>();   
        }
        
        return libros;
    }
    
    public Libro findById(Integer id) {
    
        Libro libro = new Libro();
        
        try {
        
            Query query = em.createNamedQuery("Libro.findByIdLibro");
            query.setParameter("idLibro", id);
            libro = (Libro) query.getSingleResult();
                
        } catch (Exception ex) {
        
            System.out.println(ex.getMessage());
            libro = new Libro();
        }
        
        return libro;
    }
    
    public Integer addLibro(String titolo, String editore, String autore) {
    
        Integer id = 0;
        
        Libro libro = new Libro();
        
        try {
            
            em.getTransaction().begin();
            /*
            Query query = em.createNativeQuery(String.format(
                    "INSERT INTO libro (titolo, editore, autore) "+
                    "VALUES ('%s','%s','%s')", 
                    titolo, editore, autore));
            
            query.executeUpdate();
            */
            
            libro.setTitolo(titolo);
            libro.setEditore(editore);
            libro.setAutore(autore);
            
            em.persist(libro);
            
            em.getTransaction().commit();
            
            id = libro.getIdLibro();
        } catch (Exception ex) {
        
            System.out.println(ex.getMessage());
            return id = -1;
        }
        
        return id;
    }
    
    public Integer removeLibro(Integer idLibro) {
    
        Integer id = 0;
        
        Libro libro = new Libro();
        
        try {
        
            libro = em.find(Libro.class, idLibro);
            
            if (libro == null) {
            
                throw new LibroException("Can't remove. Libro not found");
            }
            
            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();
            
            id = libro.getIdLibro();
            
        } catch (LibroException lEx) {
        
            System.out.println(lEx.getMessage());
            return id = -1;
        } catch (Exception ex) {
        
            System.out.println(ex.getMessage());
            return id = -1;
        }
        
        return id;
    }
}
