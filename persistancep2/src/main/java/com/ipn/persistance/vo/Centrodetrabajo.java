package com.ipn.persistance.vo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alopeze
 */
@Entity
@Table(name = "centrodetrabajo")
@NamedQueries({
    @NamedQuery(name = "Centrodetrabajo.findAll", query = "SELECT c FROM Centrodetrabajo c"),
    @NamedQuery(name = "Centrodetrabajo.findByIdcentrodetrabajo", query = "SELECT c FROM Centrodetrabajo c WHERE c.idcentrodetrabajo = :idcentrodetrabajo"),
    @NamedQuery(name = "Centrodetrabajo.findByNombreCentroDeTrabajo", query = "SELECT c FROM Centrodetrabajo c WHERE c.nombreCentroDeTrabajo = :nombreCentroDeTrabajo")})
public class Centrodetrabajo implements Serializable,DataBaseReferableItem {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcentrodetrabajo")
    private Integer idcentrodetrabajo;
    @Basic(optional = false)
    @Column(name = "nombreCentroDeTrabajo")
    private String nombreCentroDeTrabajo;
    @OneToMany(mappedBy = "idCentroDeTrabajo", fetch = FetchType.EAGER)
    private List<Carrera> carreraList;

    public Centrodetrabajo() {
    }

    public Centrodetrabajo(Integer idcentrodetrabajo) {
        this.idcentrodetrabajo = idcentrodetrabajo;
    }

    public Centrodetrabajo(Integer idcentrodetrabajo, String nombreCentroDeTrabajo) {
        this.idcentrodetrabajo = idcentrodetrabajo;
        this.nombreCentroDeTrabajo = nombreCentroDeTrabajo;
    }

    public Integer getIdcentrodetrabajo() {
        return idcentrodetrabajo;
    }

    public void setIdcentrodetrabajo(Integer idcentrodetrabajo) {
        this.idcentrodetrabajo = idcentrodetrabajo;
    }

    public String getNombreCentroDeTrabajo() {
        return nombreCentroDeTrabajo;
    }

    public void setNombreCentroDeTrabajo(String nombreCentroDeTrabajo) {
        this.nombreCentroDeTrabajo = nombreCentroDeTrabajo;
    }

    public List<Carrera> getCarreraList() {
        return carreraList;
    }

    public void setCarreraList(List<Carrera> carreraList) {
        this.carreraList = carreraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcentrodetrabajo != null ? idcentrodetrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centrodetrabajo)) {
            return false;
        }
        Centrodetrabajo other = (Centrodetrabajo) object;
        if ((this.idcentrodetrabajo == null && other.idcentrodetrabajo != null) || (this.idcentrodetrabajo != null && !this.idcentrodetrabajo.equals(other.idcentrodetrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ipn.persistance.Centrodetrabajo[ idcentrodetrabajo=" + idcentrodetrabajo + " ]";
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
