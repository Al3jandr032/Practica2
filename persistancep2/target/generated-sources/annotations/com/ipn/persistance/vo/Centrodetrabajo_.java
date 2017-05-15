package com.ipn.persistance.vo;

import com.ipn.persistance.vo.Carrera;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-14T21:30:46")
@StaticMetamodel(Centrodetrabajo.class)
public class Centrodetrabajo_ { 

    public static volatile SingularAttribute<Centrodetrabajo, Integer> idcentrodetrabajo;
    public static volatile SingularAttribute<Centrodetrabajo, String> nombreCentroDeTrabajo;
    public static volatile ListAttribute<Centrodetrabajo, Carrera> carreraList;

}