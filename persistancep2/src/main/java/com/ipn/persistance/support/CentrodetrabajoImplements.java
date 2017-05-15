package com.ipn.persistance.support;


import com.ipn.persistance.CentrodetrabajoFacade;
import com.ipn.persistance.vo.Centrodetrabajo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class CentrodetrabajoImplements extends AbstractFacade<Centrodetrabajo> implements CentrodetrabajoFacade{
    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;

    public CentrodetrabajoImplements() {
        super(Centrodetrabajo.class);
    }
    
    public CentrodetrabajoImplements(EntityManager em){
        this();
        this.em=em;
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }
}
