
package com.ipn.persistance.support;

import com.ipn.persistance.CarreraFacade;
import com.ipn.persistance.vo.Carrera;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class CarreraImplements extends AbstractFacade<Carrera> implements CarreraFacade{

    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;
     
    public CarreraImplements() {
        super(Carrera.class);
    }
    public CarreraImplements(EntityManager em){
        this();
        this.em = em;
    }

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }
    
}
