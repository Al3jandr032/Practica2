
package com.ipn.persistance.support;


import com.ipn.persistance.CalificacionFacade;

import com.ipn.persistance.vo.Calificacion;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class CalificacionImplements extends AbstractFacade<Calificacion> implements CalificacionFacade{

    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;
    
    public CalificacionImplements() {
        super(Calificacion.class);
    }
    
    public CalificacionImplements(EntityManager em) {
        super(Calificacion.class);
        this.em = em;
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }

  
    
}
