package com.ipn.persistance.vo;

import com.ipn.persistance.vo.Calificacion;
import com.ipn.persistance.vo.Carrera;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T21:30:46")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> codigoPostal;
    public static volatile SingularAttribute<Alumno, Carrera> idCarerra;
    public static volatile SingularAttribute<Alumno, String> paternoAlumno;
    public static volatile SingularAttribute<Alumno, Character> sexo;
    public static volatile SingularAttribute<Alumno, Date> fechaNacimiento;
    public static volatile SingularAttribute<Alumno, String> colonia;
    public static volatile SingularAttribute<Alumno, Long> matricula;
    public static volatile SingularAttribute<Alumno, Integer> numero;
    public static volatile ListAttribute<Alumno, Calificacion> calificacionList;
    public static volatile SingularAttribute<Alumno, String> maternoAlumno;
    public static volatile SingularAttribute<Alumno, String> eMail;
    public static volatile SingularAttribute<Alumno, String> nombreAlumno;
    public static volatile SingularAttribute<Alumno, String> calle;

}