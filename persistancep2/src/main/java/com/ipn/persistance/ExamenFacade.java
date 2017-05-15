package com.ipn.persistance;

import com.ipn.persistance.vo.Examen;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface ExamenFacade {
    public Examen create(Examen examen);
    
    public void edit(Examen examen);

    public void remove(Examen examen);
    
    public Examen find(Long id);

    public List<Examen> findAll();

    public int count();
}
