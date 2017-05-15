package com.ipn.persistance;

import com.ipn.persistance.vo.Materia;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface MateriaFacade {
    public Materia create(Materia materia);
    
    public void edit(Materia materia);

    public void remove(Materia materia);
    
    public Materia find(Long id);

    public List<Materia> findAll();

    public int count();
}
