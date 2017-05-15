package com.ipn.persistance.vo;

import com.ipn.persistance.vo.Examen;
import com.ipn.persistance.vo.Respuesta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T21:30:46")
@StaticMetamodel(Pregunta.class)
public class Pregunta_ { 

    public static volatile SingularAttribute<Pregunta, String> pregunta;
    public static volatile SingularAttribute<Pregunta, Examen> idExamen;
    public static volatile ListAttribute<Pregunta, Respuesta> respuestaList;
    public static volatile SingularAttribute<Pregunta, Integer> idPregunta;

}