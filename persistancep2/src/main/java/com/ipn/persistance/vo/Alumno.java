package com.ipn.persistance.vo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author alopeze
 */
@Entity
@Table(name = "Alumno")
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByMatricula", query = "SELECT a FROM Alumno a WHERE a.matricula = :matricula"),
    @NamedQuery(name = "Alumno.findByNombreAlumno", query = "SELECT a FROM Alumno a WHERE a.nombreAlumno = :nombreAlumno"),
    @NamedQuery(name = "Alumno.findByPaternoAlumno", query = "SELECT a FROM Alumno a WHERE a.paternoAlumno = :paternoAlumno"),
    @NamedQuery(name = "Alumno.findByMaternoAlumno", query = "SELECT a FROM Alumno a WHERE a.maternoAlumno = :maternoAlumno"),
    @NamedQuery(name = "Alumno.findByFechaNacimiento", query = "SELECT a FROM Alumno a WHERE a.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Alumno.findByCalle", query = "SELECT a FROM Alumno a WHERE a.calle = :calle"),
    @NamedQuery(name = "Alumno.findByColonia", query = "SELECT a FROM Alumno a WHERE a.colonia = :colonia"),
    @NamedQuery(name = "Alumno.findByNumero", query = "SELECT a FROM Alumno a WHERE a.numero = :numero"),
    @NamedQuery(name = "Alumno.findByCodigoPostal", query = "SELECT a FROM Alumno a WHERE a.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Alumno.findBySexo", query = "SELECT a FROM Alumno a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Alumno.findByEMail", query = "SELECT a FROM Alumno a WHERE a.eMail = :eMail")})
public class Alumno implements Serializable,DataBaseReferableItem {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "matricula")
    private Long matricula;
    @Basic(optional = false)
    @Column(name = "nombreAlumno")
    private String nombreAlumno;
    @Basic(optional = false)
    @Column(name = "paternoAlumno")
    private String paternoAlumno;
    @Basic(optional = false)
    @Column(name = "maternoAlumno")
    private String maternoAlumno;
    @Basic(optional = false)
    @Column(name = "fechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "calle")
    private String calle;
    @Column(name = "colonia")
    private String colonia;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "codigoPostal")
    private String codigoPostal;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "eMail")
    private String eMail;
    @JoinColumn(name = "idCarerra", referencedColumnName = "idCarrera")
    @ManyToOne(fetch = FetchType.EAGER)
    private Carrera idCarerra;
    @OneToMany(mappedBy = "matricula", fetch = FetchType.EAGER)
    private List<Calificacion> calificacionList;

    public Alumno() {
    }

    public Alumno(Long matricula) {
        this.matricula = matricula;
    }

    public Alumno(Long matricula, String nombreAlumno, String paternoAlumno, String maternoAlumno, Date fechaNacimiento) {
        this.matricula = matricula;
        this.nombreAlumno = nombreAlumno;
        this.paternoAlumno = paternoAlumno;
        this.maternoAlumno = maternoAlumno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getPaternoAlumno() {
        return paternoAlumno;
    }

    public void setPaternoAlumno(String paternoAlumno) {
        this.paternoAlumno = paternoAlumno;
    }

    public String getMaternoAlumno() {
        return maternoAlumno;
    }

    public void setMaternoAlumno(String maternoAlumno) {
        this.maternoAlumno = maternoAlumno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Carrera getIdCarerra() {
        return idCarerra;
    }

    public void setIdCarerra(Carrera idCarerra) {
        this.idCarerra = idCarerra;
    }

    public List<Calificacion> getCalificacionList() {
        return calificacionList;
    }

    public void setCalificacionList(List<Calificacion> calificacionList) {
        this.calificacionList = calificacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ipn.persistance.Alumno[ matricula=" + matricula + " ]";
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
