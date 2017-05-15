package com.ipn.persistance.support;

import com.ipn.persistance.ExamenFacade;
import com.ipn.persistance.vo.Examen;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class ExamenImplements extends AbstractFacade<Examen> implements ExamenFacade {

    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;
    
    public ExamenImplements() {
        super(Examen.class);
    }
    
    public ExamenImplements(EntityManager em) {
        this();
        this.em= em;
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }
    
}
