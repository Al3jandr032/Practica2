package com.ipn.persistance.support;

import com.ipn.persistance.PreguntaFacade;
import com.ipn.persistance.vo.Pregunta;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class PreguntaImplements extends AbstractFacade<Pregunta> implements PreguntaFacade{
    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;

    public PreguntaImplements(Class<Pregunta> entityClass) {
        super(entityClass);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
