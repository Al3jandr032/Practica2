package com.ipn.persistance;

import com.ipn.persistance.support.AlumnoImplements;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author alopeze
 */
public class Test {
    private EntityManager em;
    public AlumnoImplements alumnodao;
   
    public Test(){
        this.em = Persistence.createEntityManagerFactory("persistance_unit").createEntityManager();
        this.alumnodao = new AlumnoImplements(this.em);
    }
    public static void main(String[] args) {
        Test t = new Test(); 
        int count = t.alumnodao.count();
        System.out.println("cuenta : "+ count);
    }
}
