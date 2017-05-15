package com.ipn.persistance.vo;

import com.ipn.persistance.vo.Calificacion;
import com.ipn.persistance.vo.Materia;
import com.ipn.persistance.vo.Pregunta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T21:30:46")
@StaticMetamodel(Examen.class)
public class Examen_ { 

    public static volatile ListAttribute<Examen, Calificacion> calificacionList;
    public static volatile SingularAttribute<Examen, Integer> idExamen;
    public static volatile SingularAttribute<Examen, Date> fecha;
    public static volatile SingularAttribute<Examen, Materia> idMateria;
    public static volatile ListAttribute<Examen, Pregunta> preguntaList;

}