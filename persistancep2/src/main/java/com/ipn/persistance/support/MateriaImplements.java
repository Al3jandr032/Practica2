/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.persistance.support;

import com.ipn.persistance.MateriaFacade;
import com.ipn.persistance.vo.Materia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alopeze
 */
public class MateriaImplements extends AbstractFacade<Materia> implements MateriaFacade{
    @PersistenceContext(unitName = "persistance_unit")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public MateriaImplements(EntityManager em) {
        this();
        this.em = em;
    }

    public MateriaImplements() {
        super(Materia.class);
    }
   
}
