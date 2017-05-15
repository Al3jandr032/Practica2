package com.ipn.persistance.support;

import com.ipn.persistance.AlumnoFacade;
import com.ipn.persistance.vo.Alumno;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class AlumnoImplements extends AbstractFacade<Alumno> implements AlumnoFacade{

    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public AlumnoImplements() {
        super(Alumno.class);
    }
    
    public AlumnoImplements(EntityManager em) {
        this();
        this.em = em;
    }
    
}
