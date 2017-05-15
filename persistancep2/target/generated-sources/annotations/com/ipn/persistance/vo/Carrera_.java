package com.ipn.persistance.vo;

import com.ipn.persistance.vo.Alumno;
import com.ipn.persistance.vo.Centrodetrabajo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T21:30:46")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, String> duraccion;
    public static volatile SingularAttribute<Carrera, Centrodetrabajo> idCentroDeTrabajo;
    public static volatile SingularAttribute<Carrera, String> nombreCarrera;
    public static volatile ListAttribute<Carrera, Alumno> alumnoList;
    public static volatile SingularAttribute<Carrera, Integer> idCarrera;

}