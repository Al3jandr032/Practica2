package com.ipn.persistance;

import com.ipn.persistance.vo.Carrera;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface CarreraFacade {
    public Carrera create(Carrera carrera);
    
    public void edit(Carrera carrera);

    public void remove(Carrera carrera);
    
    public Carrera find(Long id);

    public List<Carrera> findAll();

    public int count();
}
