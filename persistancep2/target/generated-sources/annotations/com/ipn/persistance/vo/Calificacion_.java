package com.ipn.persistance.vo;

import com.ipn.persistance.vo.Alumno;
import com.ipn.persistance.vo.Examen;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T21:30:46")
@StaticMetamodel(Calificacion.class)
public class Calificacion_ { 

    public static volatile SingularAttribute<Calificacion, Examen> idExamen;
    public static volatile SingularAttribute<Calificacion, Integer> idcalificaciones;
    public static volatile SingularAttribute<Calificacion, Double> puntaje;
    public static volatile SingularAttribute<Calificacion, Alumno> matricula;

}