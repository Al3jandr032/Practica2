/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.persistance.support;

import com.ipn.persistance.vo.Materia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alopeze
 */
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistance_unit");
        EntityManager em = emf.createEntityManager();
        MateriaImplements m = new MateriaImplements(em);
        Materia materia = new Materia(1, "calculo", 12);
        m.create(materia);
    }
}
