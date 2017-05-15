package com.ipn.persistance.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author alopeze
 */
@Entity
@Table(name = "Calificacion")
@NamedQueries({
    @NamedQuery(name = "Calificacion.findAll", query = "SELECT c FROM Calificacion c"),
    @NamedQuery(name = "Calificacion.findByIdcalificaciones", query = "SELECT c FROM Calificacion c WHERE c.idcalificaciones = :idcalificaciones"),
    @NamedQuery(name = "Calificacion.findByPuntaje", query = "SELECT c FROM Calificacion c WHERE c.puntaje = :puntaje")})
public class Calificacion implements Serializable,DataBaseReferableItem {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcalificaciones")
    private Integer idcalificaciones;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "puntaje")
    private Double puntaje;
    @JoinColumn(name = "idExamen", referencedColumnName = "idExamen")
    @ManyToOne(fetch = FetchType.EAGER)
    private Examen idExamen;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula")
    @ManyToOne(fetch = FetchType.EAGER)
    private Alumno matricula;

    public Calificacion() {
    }

    public Calificacion(Integer idcalificaciones) {
        this.idcalificaciones = idcalificaciones;
    }

    public Integer getIdcalificaciones() {
        return idcalificaciones;
    }

    public void setIdcalificaciones(Integer idcalificaciones) {
        this.idcalificaciones = idcalificaciones;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Examen getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Examen idExamen) {
        this.idExamen = idExamen;
    }

    public Alumno getMatricula() {
        return matricula;
    }

    public void setMatricula(Alumno matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcalificaciones != null ? idcalificaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calificacion)) {
            return false;
        }
        Calificacion other = (Calificacion) object;
        if ((this.idcalificaciones == null && other.idcalificaciones != null) || (this.idcalificaciones != null && !this.idcalificaciones.equals(other.idcalificaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ipn.persistance.Calificacion[ idcalificaciones=" + idcalificaciones + " ]";
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
