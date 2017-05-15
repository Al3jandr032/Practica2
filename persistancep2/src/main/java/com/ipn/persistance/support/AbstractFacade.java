package com.ipn.persistance.support;

import com.ipn.persistance.vo.DataBaseReferableItem;
import java.util.List;
import javax.persistence.EntityManager;

public abstract class AbstractFacade<T extends DataBaseReferableItem> {

    private final Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public T create(T entity) {
        getEntityManager().getTransaction().begin();
 
        getEntityManager().persist(entity);
        getEntityManager().getTransaction().commit();

        // FOR POST-PROCESSING PROPURSES
        return entity;
    }

    public void edit(T entity) {
        getEntityManager().getTransaction().begin();
//        entity.setId(entity.calculateId());
        getEntityManager().merge(entity);
        getEntityManager().getTransaction().commit();
    }

    public void remove(T entity) {
        getEntityManager().getTransaction().begin();
//        entity.setId(entity.calculateId());
        getEntityManager().remove(getEntityManager().merge(entity));
        getEntityManager().getTransaction().commit();

    }

    public T find(Long id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
