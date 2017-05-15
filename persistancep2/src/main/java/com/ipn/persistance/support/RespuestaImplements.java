package com.ipn.persistance.support;

import com.ipn.persistance.RespuestaFacade;
import com.ipn.persistance.vo.Respuesta;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class RespuestaImplements extends AbstractFacade<Respuesta> implements RespuestaFacade{
    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;

    public RespuestaImplements(Class<Respuesta> entityClass) {
        super(entityClass);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
