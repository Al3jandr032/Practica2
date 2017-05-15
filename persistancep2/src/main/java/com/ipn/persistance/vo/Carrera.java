package com.ipn.persistance.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alopeze
 */
@Entity
@Table(name = "Carrera")
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", query = "SELECT c FROM Carrera c"),
    @NamedQuery(name = "Carrera.findByIdCarrera", query = "SELECT c FROM Carrera c WHERE c.idCarrera = :idCarrera"),
    @NamedQuery(name = "Carrera.findByNombreCarrera", query = "SELECT c FROM Carrera c WHERE c.nombreCarrera = :nombreCarrera"),
    @NamedQuery(name = "Carrera.findByDuraccion", query = "SELECT c FROM Carrera c WHERE c.duraccion = :duraccion")})
public class Carrera implements Serializable,DataBaseReferableItem {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idCarrera")
    private Integer idCarrera;
    @Basic(optional = false)
    @Column(name = "NombreCarrera")
    private String nombreCarrera;
    @Column(name = "Duraccion")
    private String duraccion;
    @JoinColumn(name = "idCentroDeTrabajo", referencedColumnName = "idcentrodetrabajo")
    @ManyToOne(fetch = FetchType.EAGER)
    private Centrodetrabajo idCentroDeTrabajo;
    @OneToMany(mappedBy = "idCarerra", fetch = FetchType.EAGER)
    private List<Alumno> alumnoList;

    public Carrera() {
    }

    public Carrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Carrera(Integer idCarrera, String nombreCarrera) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getDuraccion() {
        return duraccion;
    }

    public void setDuraccion(String duraccion) {
        this.duraccion = duraccion;
    }

    public Centrodetrabajo getIdCentroDeTrabajo() {
        return idCentroDeTrabajo;
    }

    public void setIdCentroDeTrabajo(Centrodetrabajo idCentroDeTrabajo) {
        this.idCentroDeTrabajo = idCentroDeTrabajo;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrera != null ? idCarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        if ((this.idCarrera == null && other.idCarrera != null) || (this.idCarrera != null && !this.idCarrera.equals(other.idCarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ipn.persistance.Carrera[ idCarrera=" + idCarrera + " ]";
    }

    @Override
    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
