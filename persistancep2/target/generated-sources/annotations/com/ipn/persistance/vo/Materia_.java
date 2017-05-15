package com.ipn.persistance.vo;

import com.ipn.persistance.vo.Examen;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T21:30:46")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, Integer> idMateria;
    public static volatile ListAttribute<Materia, Examen> examenList;
    public static volatile SingularAttribute<Materia, String> nombreMateria;
    public static volatile SingularAttribute<Materia, Integer> creditos;

}