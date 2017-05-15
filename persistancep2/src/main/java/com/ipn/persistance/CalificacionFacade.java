package com.ipn.persistance;

import com.ipn.persistance.vo.Calificacion;
import java.util.List;

/**
 *
 * @author alopeze
 */
public interface CalificacionFacade {
    public Calificacion create(Calificacion calificacion);
    
    public void edit(Calificacion calificacion);

    public void remove(Calificacion calificacion);
    
    public Calificacion find(Long id);

    public List<Calificacion> findAll();

    public int count();
}
