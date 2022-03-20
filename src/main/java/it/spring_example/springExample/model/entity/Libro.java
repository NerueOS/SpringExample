/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.spring_example.springExample.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author
 */
@Entity
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l"),
    @NamedQuery(name = "Libro.findByIdLibro", query = "SELECT l FROM Libro l WHERE l.idLibro = :idLibro"),
    @NamedQuery(name = "Libro.findByTitolo", query = "SELECT l FROM Libro l WHERE l.titolo = :titolo"),
    @NamedQuery(name = "Libro.findByEditore", query = "SELECT l FROM Libro l WHERE l.editore = :editore"),
    @NamedQuery(name = "Libro.findByAutore", query = "SELECT l FROM Libro l WHERE l.autore = :autore"),
    @NamedQuery(name = "Libro.findByStato", query = "SELECT l FROM Libro l WHERE l.stato = :stato")})
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLibro")
    private Integer idLibro;
    @Basic(optional = false)
    @Column(name = "titolo")
    private String titolo;
    @Basic(optional = false)
    @Column(name = "editore")
    private String editore;
    @Basic(optional = false)
    @Column(name = "autore")
    private String autore;
    @Basic(optional = false)
    @Column(name = "stato")
    private boolean stato;

    public Libro() {
    }

    public Libro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Libro(Integer idLibro, String titolo, String editore, String autore, boolean stato) {
        this.idLibro = idLibro;
        this.titolo = titolo;
        this.editore = editore;
        this.autore = autore;
        this.stato = stato;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public boolean getStato() {
        return stato;
    }

    public void setStato(boolean stato) {
        this.stato = stato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibro != null ? idLibro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.idLibro == null && other.idLibro != null) || (this.idLibro != null && !this.idLibro.equals(other.idLibro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", titolo=" + titolo + ", editore=" + editore + ", autore=" + autore + ", stato=" + stato + '}';
    }

    
    
}
